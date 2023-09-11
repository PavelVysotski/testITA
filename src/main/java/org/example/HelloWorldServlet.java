package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
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
                "  <h1>Урок работы с Сервлетами</h1>\n" +
                "  <p>Началось</p> \n" +
                " </body>\n" +
                "</html>");
    }
}
