package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

@WebServlet(urlPatterns = "/servlet_param")
public class HelloWorldWithParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        writer.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <title>Цвет фона под заголовком</title>\n" +
                "  <style>\n" +
                "   h1 {\n" +
                "    background: #D9FFAD;\n" +
                "    color: green;\n" +
                "    padding: 2px;\n" +
                "   }\n" +
                "  </style>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <h1>Здравствуйте, " + firstName + " " + lastName + ". Урок работы с Сервлетами</h1>\n" +
                "  <p>Началось</p> \n" +
                " </body>\n" +
                "</html>");
    }
}
