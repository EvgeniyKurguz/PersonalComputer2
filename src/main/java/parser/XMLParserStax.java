package parser;


import com.epam.task1.entity.ComputerPart;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

public class XMLParserStax implements ParserFactory {
private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(XMLParserSAX.class);
private List<ComputerPart> computerParts = null;
private ComputerPart computerPart = null;
private String tagContent = null;

        @Override
        public void getData() {
            try {
                XMLInputFactory factory = XMLInputFactory.newInstance();
                InputStream inputStream = new FileInputStream("");
                XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
                try {
                    while (reader.hasNext()) {
                        int event = reader.next();
                        switch (event) {
                            case XMLStreamConstants.START_ELEMENT:
                                startElement(reader);
                                break;
                            case XMLStreamConstants.CHARACTERS:
                                characters(reader);
                                break;
                            case XMLStreamConstants.END_ELEMENT:
                                endElement(reader);
                                break;
                        }
                    }
                } catch (XMLStreamException e) {
                    LOGGER.info("XMLStreamException: {}", e.getMessage());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }
    private void characters(XMLStreamReader reader){
            tagContent = reader.getText().trim();
        }

        private void startElement(XMLStreamReader reader){
            String s = reader.getLocalName();
            if (reader.getLocalName().equalsIgnoreCase("computerParts")) {
                computerParts = new LinkedList<ComputerPart>();
            } else if (reader.getLocalName().equalsIgnoreCase("computerPart")) {
                computerPart = new ComputerPart();
            }}

        private void endElement(XMLStreamReader reader) {
            if (reader.getLocalName().equalsIgnoreCase("computerParts")) {
                computerParts.add(computerPart);
            } else if (reader.getLocalName().equalsIgnoreCase("computerPartName")) {


            }
        }

}
