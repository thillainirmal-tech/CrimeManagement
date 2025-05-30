/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import com.commondb.Common_DB;
import static com.java.Newlogin.properties;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
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
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author James
 */
public class Newlogin extends HttpServlet {
     static Properties properties = new Properties();
   static
   {
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
   }

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
            out.println("<title>Servlet Newlogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Newlogin at " + request.getContextPath() + "</h1>");
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
        HttpSession se=request.getSession();
        
        ///otp////
        
        String dCase = "abcdefghijklmnopqrstuvwxyz";
   String uCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         Random r=new  Random();  
        String pass = "";
		 while (pass.length () != 6)
{
            int rPick = r.nextInt(2);
            if (rPick == 0){
                int spot = r.nextInt(26);
                pass += dCase.charAt(spot);
            } else if (rPick == 1) {
                int spot = r.nextInt (26);
                pass += uCase.charAt(spot);

            }
        }
//////otp////
                 System.out.println("kkkkkk  "+pass);
        
        
       String un=request.getParameter("un");    
         String poid=request.getParameter("poid"); 
         String ps=request.getParameter("pswd");    
         String st=request.getParameter("stat"); 
         
        
         byte[] encryptArray = Base64.encodeBase64(poid.getBytes());        
     String encstr = new String(encryptArray,"UTF-8");   
     System.out.println("Enc   >>  "+ encstr);
         
         try
         {
             ResultSet rs=Common_DB.LoginCheck("crime", "newregister", "poid", "stat", encstr, st);
             if(rs.next())
             {
                String em= rs.getString("email");
                 System.out.println("?????"+em);
                 
                 int rs1=Common_DB.UpdateTable("crime", "update newregister set otp1='"+pass+"' where poid='"+encstr+"'");
                 if(rs1>0){
                 se.setAttribute("otp", pass);
                  response.sendRedirect("otpver.jsp");
                  
                  
                  ///mail///
                  
                  
                  final String  from="cloudbean2019@gmail.com";
           final String password="j@v@be@n19";
           final String to="cloudbean2019@gmail.com";
           
         Session session = Session.getInstance(properties, new javax.mail.Authenticator() 
         {
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
            }});
         
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.setRecipients(Message.RecipientType.TO, 
         InternetAddress.parse(em));
         message.setSubject("OTP MESSAGE");
         //message.setSubject("private key");
        // String mgs="";
       //  msg="a;
         message.setText(pass);
         //message.setText("private key is "+"\n"+pri);
   
        Multipart multipart = new MimeMultipart();

      //addAttachments(multipart);
      //message.setContent(multipart);
      // Send message
      Transport.send(message);
      
      ////send////
                  
                 }    
             }
             else
             {
                 response.sendRedirect("Error.jsp");
             }
         }
         catch(Exception e)
         {
             System.out.println(e);
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
