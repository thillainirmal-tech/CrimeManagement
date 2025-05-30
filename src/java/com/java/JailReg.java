/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import com.commondb.Common_DB;
 import org.apache.commons.codec.binary.Base64;
//import static com.java.registeration.properties;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prabu
 */
public class JailReg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JailReg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JailReg at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      


       // System.out.println("OTP "+pass); 
      
        String jaid=request.getParameter("jaid");
        String username=request.getParameter("username");
        String password1=request.getParameter("password");
         String gen=request.getParameter("gender");
         String cla=request.getParameter("class");
        String em=request.getParameter("email");
        String ph=request.getParameter("phno");
        //System.out.println(fullname+"////"+email+"..."+username+".,..."+password);
        
        int s=Integer.parseInt(jaid);
        int cp=s+1111;
        String jaid1=String.valueOf(cp);
        
        
        //String strip = "192.168.1.11";        
     byte[] encryptArray = Base64.encodeBase64(jaid.getBytes());        
     String encstr = new String(encryptArray,"UTF-8");   
     System.out.println("Enc   >>  "+ encstr);


     String strDec = encstr;
     byte[] dectryptArray = strDec.getBytes();
     byte[] decarray = Base64.decodeBase64(dectryptArray);
     String decstr = new String(decarray,"UTF-8"); 
     System.out.println("Dec  >>>  "+ decstr);
        
        try
        {
            
            ResultSet rs=Common_DB.LoginCheck("crime", "newregister", "poid", "stat", encstr, cla);
             if(rs.next()){
                 response.sendRedirect("Error1.jsp");
             
             }else{
             
            
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crime","root","password");
          PreparedStatement ps=con.prepareStatement("Insert into jaireg(jaid,username,password,gender,stat,email,phno) VALUES(?,?,?,?,?,?,?)");
          
          ps.setString(1,encstr);
          ps.setString(2, username);
          ps.setString(3, password1);
          ps.setString(4, gen);
          ps.setString(5,cla );
          ps.setString(6,em );
          ps.setString(7,ph );
          
          
          ps.executeUpdate();
          
          
          
          response.sendRedirect("index.jsp");
          
          
             }
      
 }
        catch(ClassNotFoundException | SQLException | IOException e)
        {
            System.out.println(e);
        } catch (Exception ex) {
            Logger.getLogger(JailReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
