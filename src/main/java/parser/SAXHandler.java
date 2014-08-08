package parser;

import entity.ComputerPartList;
import entity.ComputerPartType;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes;


public class SAXHandler extends DefaultHandler {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(SAXHandler.class);
    private List<ComputerPartType> computerPartLists = null;
    private ComputerPartType computerPartList = null;

    public List<ComputerPartType> getComputerPartLists() {
        if (computerPartLists == null) {
            computerPartLists = new LinkedList<ComputerPartType>();
        }
        return this.computerPartLists;
    }
    @Override
    public void startDocument() throws org.xml.sax.SAXException {
        System.out.println("start parsing...");
    }

    @Override
    public void endDocument() throws org.xml.sax.SAXException {
        System.out.println("end parsing...");
    }


    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("computerPartLists")) {
            computerPartLists = new LinkedList<ComputerPartType>();
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
