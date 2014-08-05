package parser;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface ParserFactory {
    void getData() throws ParserConfigurationException, IOException, SAXException;
}