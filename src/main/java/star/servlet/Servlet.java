package star.servlet;


import com.epam.task1.entity.ComputerPart;
import com.epam.task1.entity.StationaryComputer;
import com.epam.task1.entity.StationaryComputerFactory;

import java.io.IOException;
import java.util.Collections;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setAttribute("StationaryComputer", new StationaryComputerFactory().setName("HP"));
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

