package parser;


import com.epam.task1.entity.ComputerPart;
import entity.ComputerPartList;
import entity.CpuType;
import jdk.internal.org.xml.sax.SAXException;
import org.omg.CORBA.portable.InputStream;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class XMLParserDom implements ParserFactory {
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

    public void getData() throws ParserConfigurationException, IOException, org.xml.sax.SAXException {
        try {
            File xmlFile = new File("src/main/resources/personalComputer.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            LOGGER.info("Root element: {}", doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName(TAG_COMPUTERPART);
            System.out.println("----------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                LOGGER.info("Current Element: {}", nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    LOGGER.info(" id: {}", eElement.getAttribute(ID));
                    LOGGER.info("TAG_NAME: {}", eElement.getElementsByTagName(TAG_NAME).item(0).getTextContent());
                    LOGGER.info("quntityCore: {}", eElement.getElementsByTagName(TAG_QUENTITYCORE).item(0).getTextContent());
                    LOGGER.info("price: {}", eElement.getElementsByTagName(PRICE).item(0).getTextContent());
                    LOGGER.info("country: {}", eElement.getElementsByTagName(COUNTRY).item(0).getTextContent());
                    LOGGER.info("maker: {}", eElement.getElementsByTagName(MAKER).item(0).getTextContent());
                    LOGGER.info("frequency: {}", eElement.getElementsByTagName(TAG_FREQUENCY).item(0).getTextContent());
                    LOGGER.info("cacheMemory: {}", eElement.getElementsByTagName(TAG_CACHEMEMORY).item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
