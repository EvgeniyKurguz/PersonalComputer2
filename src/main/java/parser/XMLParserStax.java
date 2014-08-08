package parser;



import entity.ComputerPartList;
import entity.CountryType;
import entity.MakerType;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class XMLParserStax implements ParserFactory {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(XMLParserDom.class);
    public static final String ID = "id";
    public static final String TAG_COMPUTERPART = "ComputerPart";
    public static final String TAG_NAME = "name";
    public static final String COUNTRY = "country";
    public static final String MAKER = "maker";
    public static final String TAG_QUENTITYCORE = "quntityCore";
    public static final String TAG_FREQUENCY = "frequency";
    public static final String TAG_CACHEMEMORY = "cacheMemory";
    public static final String PRICE = "price";

    @Override
    public void getData() throws ParserConfigurationException, IOException, SAXException {
        List<ComputerPartList> computerPartLists = null;
        ComputerPartList computerPartList = null;
        CountryType countryType = null;
        MakerType makerType = null;
        String qName;
        String temp = "";
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = null;
            reader = factory.createXMLStreamReader(ClassLoader.getSystemResourceAsStream("src/main/resources/xml/Instruments.xml"));
            while (reader.hasNext()) {
                int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        qName = reader.getLocalName();
                        if (TAG_COMPUTERPART.equals(qName)) {
                            computerPartList = new ComputerPartList();
                        } else if (COUNTRY.equals(qName)) {
                            makerType = new MakerType();

                        }
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        temp = reader.getText().trim();
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        qName = reader.getLocalName();
                        if (TAG_COMPUTERPART.equalsIgnoreCase(qName)) {
                            computerPartLists.add(computerPartList);
                        } else if (ID.equalsIgnoreCase(qName)) {
                            computerPartList.setId(new Integer(temp));
                        } else if (TAG_NAME.equalsIgnoreCase(qName)) {
                            computerPartList.setInstrumentName(temp);
                        } else if (MAKER.equalsIgnoreCase(qName)) {
                            makerType.setMaterial(MakerType.valueOf(temp));
                        } else if (COUNTRY.equalsIgnoreCase(qName)) {
                            countryType.setMaterial(MakerType.valueOf(temp));
                        } else if (TAG_QUENTITYCORE.equalsIgnoreCase(qName)) {
                            computerPartList.setMoney(priceType);
                        } else if (PRICE.equalsIgnoreCase(qName)) {
                            computerPartList.setPrice(new BigDecimal(temp));
                        } else if (TAG_FREQUENCY.equalsIgnoreCase(qName)) {
                            computerPartList.setCurrency(temp);
                        } else if (TAG_CACHEMEMORY.equalsIgnoreCase(qName)) {
                            computerPartList.setBrand(BrandType.valueOf(temp));
                        } else if (PRICE.equalsIgnoreCase(qName)) {
                            computerPartList.setType(temp);
                                              }
                        break;

                    case XMLStreamConstants.START_DOCUMENT:
                        computerPartLists = new ArrayList<ComputerPartList>();
                        break;
                }
            }
            // instruments.forEach(System.out.println);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}


