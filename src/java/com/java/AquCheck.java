/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import com.commondb.Common_DB;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prabu
 */
public class AquCheck extends HttpServlet {

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
            out.println("<title>Servlet AquCheck</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AquCheck at " + request.getContextPath() + "</h1>");
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
        
        PrintWriter out = response.getWriter();
        String fileType = "";
        HttpSession se=request.getSession(true);
        String serial=request.getParameter("firno");
        System.out.println("Serial: "+serial);
        
        
        try
        {
            ResultSet rs=Common_DB.ViewParticularData("crime", "crecd", "firno", serial);
            if(rs.next())
            {
                String filename=rs.getString("filename");
                System.out.println("FileName: "+filename);
                int rs1 = Common_DB.UpdateTable("crime", "UPDATE crecd SET status='Approved' WHERE firno='"+serial+"'");   
                if(rs1>0) 
                {
                
                String outputfile = this.getServletContext().getRealPath("/files/"+filename);
                FileInputStream filetoDownload=new FileInputStream(outputfile);         
                response.setHeader("Content-Disposition","inline; filename="+filename);
                response.setContentType("application/x-msdownload");  
                int i;   
                while ((i=filetoDownload.read()) != -1) {  
                out.write(i);   
                
            }  
                
                    
                
            filetoDownload.close();   
            out.close(); 
            }
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
