package parser;

import entity.ComputerPartList;
import entity.ComputerPartType;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;


public class XMLParserSAX implements ParserFactory {
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(XMLParserSAX.class);
    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

    @Override
    public void getData() {
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            SAXHandler saxHandler = new SAXHandler();
            saxParser.parse(new File("src/main/resources/personalComputer.xml"), saxHandler);
            List<ComputerPartType> computerPartLists = saxHandler.getComputerPartLists();
            for (ComputerPartType computerPartList : computerPartLists)
                LOGGER.info("toString: {}", computerPartList.toString());
        } catch (Exception e) {
            LOGGER.info("exception: {}", e.getMessage());
        }
    }
}