package parser;


import com.epam.task1.entity.ComputerPart;
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

public class XMLParserDom implements ParserFactory {

public static final String TAG_TARIFF = "tariff";
public static final String TAG_NAME = "name";
public static final String TAG_OP_NAME = "operatorName";
public static final String TAG_PAYROLL = "payroll";
public static final String TAG_CALL_PRICES = "callPrices";
public static final String TAG_SMS_PRICE = "smsPrice";
public static final String TAG_PARAMETERS = "parameters";
public static final String TAG_INNER_PRICE = "innerPrice";
public static final String TAG_OUTER_PRICE = "outerPrice";
public static final String TAG_FIXED_LOCATION = "fixedLocation";
public static final String TAG_FAVORITE_NUMBERS = "favoriteNumbers";
public static final String TAG_TARIFFING = "tariffing";
public static final String TAG_CONNECTION_FEE = "connectionFee";

private static List<ComputerPart> computerParts;

public static void parse(InputStream xml, List<ComputerPart> list) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
    computerParts = list;
        parseNode((Element) doc.getDocumentElement());
        }

private static void parseNode(Element element) {
        NodeList nodeList = element.getElementsByTagName(TAG_TARIFF);
    ComputerPart tariff;
        for (int i = 0; i < nodeList.getLength(); i++) {
        tariff = new ComputerPart();
        Element el = (Element) nodeList.item(i);
        tariff.setName(getChildValue(el, TAG_NAME));
        tariff.setOperatorName(getChildValue(el, TAG_OP_NAME));
        tariff.setPayroll(new BigDecimal(getChildValue(el, TAG_PAYROLL)));
        tariff.setSmsPrice(new BigDecimal(getChildValue(el, TAG_SMS_PRICE)));

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
