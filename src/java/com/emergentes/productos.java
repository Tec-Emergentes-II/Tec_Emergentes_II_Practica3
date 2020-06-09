/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
  
    Author : Eva Carmen Huaylliri Ajata
 */
@WebServlet(name = "productos", urlPatterns = {"/productos"})
public class productos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        Declaramos unos string para recibir los parametros del formulario
        */
        String producto = request.getParameter("producto");
        String categoria= request.getParameter("categoria");
        String existencia= request.getParameter("existencia");
        String precio= request.getParameter("precio");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica N° 3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Producto</h1>");
            out.println("<h2>Producto: " +producto+ "</h2>");
            out.println("<h2>Categoria: " +categoria+ "</h2>");
            out.println("<h2>Existencia: " +existencia+ "</h2>");
            out.println("<h2>Precio: " +precio+ "</h2>");
            out.println("<br>");            
            out.println("<center><a href='index.jsp'>Inicio</a></center>");
            out.println("</body>");
            out.println("</html>");;
        }
    }

}
