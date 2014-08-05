package parser;

import entity.ComputerPartList;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes;


public class SAXHandler extends DefaultHandler {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SAXHandler.class);
    private List<ComputerPartList> computerPartLists = null;
    private ComputerPartList computerPartList = null;

    public List<ComputerPartList> getComputerPartLists() {
        if (computerPartLists == null) {
            computerPartLists = new LinkedList<ComputerPartList>();
        }
        return this.computerPartLists;
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("computerPartLists")) {
            computerPartLists = new LinkedList<ComputerPartList>();
            LOGGER.info("Start element: {}", "instruments");
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("computerPartLists")) {
            computerPartLists.add(computerPartList);
            LOGGER.info("End element: {}", "computerPartLists");
        }
    }

    public void characters(char[] ch, int start, int lenght) {
        LOGGER.info("Character: {}", new String(ch, start, lenght));
    }

}
