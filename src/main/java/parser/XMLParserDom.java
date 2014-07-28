package parser;


import com.epam.task1.entity.ComputerPart;
import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class XMLParserDom implements ParserFactory {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(XMLParserSAX.class);
    private List<ComputerPart> сomputerParts = null;
    private ComputerPart сomputerPart = null;

    @Override
    public void getData() throws org.xml.sax.SAXException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src/main/resources/Instrument.xml");
            Element root = (Element) document.getDocumentElement();
            сomputerParts = сomputerPartListBuilder(root);
        }catch (SAXException e) {
            LOGGER.info(e.getMessage());
        }catch (ParserConfigurationException e) {
            LOGGER.info(e.getMessage());
        }catch (IOException e){
            LOGGER.info(e.getMessage());
        }
        for (ComputerPart сomputerPart : сomputerParts) {
            LOGGER.info(сomputerPart.toString());
        }

        private List<ComputerPart> instrumentBuilder(Element root) {
            List<ComputerPart> innerStudents = new LinkedList<ComputerPart>();
            NodeList instrumentNotes = root.getElementByTagName("сomputerPart");
            for (int i = 0; i < instrumentNotes.getLength(); i++) {
                сomputerPart = new ComputerPart();
                Element instrumentElement = (Element) instrumentNotes.item(i);

            }

        }
    }}
