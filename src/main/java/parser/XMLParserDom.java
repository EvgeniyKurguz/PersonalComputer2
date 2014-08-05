package parser;


import com.epam.task1.entity.ComputerPart;
import entity.ComputerPartList;
import entity.CpuType;
import jdk.internal.org.xml.sax.SAXException;
import org.omg.CORBA.portable.InputStream;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class XMLParserDom  {

public static final String TAG_COMPUTERPART = "ComputerPart";
public static final String TAG_NAME = "name";
public static final String TAG_QUENTITYCORE = "quntityCore";
public static final String TAG_FREQUENCY = "frequency";
public static final String TAG_CACHEMEMORY = "cacheMemory";
public static final String TAG_COUNTRYTYPE = "CountryType";
public static final String TAG_MAKERTYPE = "MakerType";


private static List<CpuType> cpuTypes;

public static void parse(InputStream xml, List<CpuType> list) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
            cpuTypes = list;
        parseNode((Element) doc.getDocumentElement());
        }

private static void parseNode(Element element) {
        NodeList nodeList = element.getElementsByTagName(TAG_COMPUTERPART);
    CpuType cpuType;
        for (int i = 0; i < nodeList.getLength(); i++) {
            cpuType = new CpuType();
        Element el = (Element) nodeList.item(i);
            computerPart.setId(getChildValue(el, TAG_NAME));
            computerPart.setOperatorName(getChildValue(el, TAG_OP_NAME));
            computerPart.setPayroll(new BigDecimal(getChildValue(el, TAG_PAYROLL)));
            computerPart.setSmsPrice(new BigDecimal(getChildValue(el, TAG_SMS_PRICE)));

        CallPrices callPrices = new CallPrices();
        Element tmp = getChild(el, TAG_CALL_PRICES);
        callPrices.setInnerPrice(new BigDecimal(getChildValue(tmp, TAG_INNER_PRICE)));
        callPrices.setOuterPrice(new BigDecimal(getChildValue(tmp, TAG_OUTER_PRICE)));
        callPrices.setFixedLocation(new BigDecimal(getChildValue(tmp, TAG_FIXED_LOCATION)));
        tariff.setCallPrices(callPrices);

        Parameters parameters = new Parameters();
        tmp = getChild(el, TAG_PARAMETERS);
        parameters.setFavoriteNumbers(new Boolean(getChildValue((Element) tmp, TAG_FAVORITE_NUMBERS)));
        parameters.setTarriffing(getChildValue(tmp, TAG_TARIFFING));
        parameters.setConnectionFee(new BigDecimal(getChildValue(tmp, TAG_CONNECTION_FEE)));
        tariff.setParameters(parameters);

        tariffs.add(tariff);
        }
        }

private static String getChildValue(Element element, String childName) {
        Node child = getChild(element, childName);
        return child == null ? "0" : child.getFirstChild().getNodeValue();
        }

private static Element getChild(Element parent, String childName) {
        return (Element) parent.getElementsByTagName(childName).item(0);
        }
        }
