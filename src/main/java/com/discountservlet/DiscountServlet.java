package com.discountservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productDescription = request.getParameter("ProductDescription");
        float listPrice = Float.parseFloat(request.getParameter("ListPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("DiscountPercent"));

        float discountAmount = discountPercent * listPrice * 0.01f;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Display discount</h1>");
        writer.println("<h2>ProductDescription: " + productDescription+ "</h2>");
        writer.println("<h2>listPrice: " + listPrice+ "</h2>");
        writer.println("<h2>discountPercent: " + discountPercent+ "</h2>");
        writer.println("<h2>discountAmount: " + discountAmount+ "</h2>");
        writer.println("</html>");
    }
}
