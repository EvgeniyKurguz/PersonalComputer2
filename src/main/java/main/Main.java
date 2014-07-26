package main;

import jdk.internal.org.xml.sax.SAXException;
import parser.ParserFactory;
import parser.XMLParserSAX;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Евгений on 27.07.2014.
 */
public class Main  {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        LOGGER.info("----------------SAX---------------");
        ParserFactory saxParser = new XMLParserSAX();
        saxParser.getData();
    }
}
