package star.servlet;


import com.epam.task1.entity.ComputerPart;
import com.epam.task1.entity.StationaryComputer;
import com.epam.task1.entity.StationaryComputerFactory;
import org.xml.sax.SAXException;
import parser.ParserFactory;
import parser.XMLParserDom;
import parser.XMLParserSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Collections;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ParserFactory saxParser = new XMLParserSAX();
        try {
            saxParser.getData();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        request.setAttribute("saxParser", saxParser);


        XMLParserDom domParser = new XMLParserDom();
        try {
            domParser.getData();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        request.setAttribute("domParser", saxParser);
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}



//    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//    }
//
//    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//
//        request.setAttribute("StationaryComputer", new StationaryComputerFactory().setName("HP"));
//        request.getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//}
//
