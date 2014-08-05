package main;

import jdk.internal.org.xml.sax.SAXException;
import parser.ParserFactory;
import parser.XMLParserDom;
import parser.XMLParserSAX;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Main  {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, org.xml.sax.SAXException {
        LOGGER.info("----------------SAX---------------");
        ParserFactory saxParser = new XMLParserSAX();
        saxParser.getData();

        LOGGER.info("----------------DOM---------------");
        ParserFactory domParser = new XMLParserDom();
        domParser.getData();
    }
}
