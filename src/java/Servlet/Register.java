/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlet;

import Model.ShowAllStudent;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author nuttanan
 */
public class Register extends HttpServlet {

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
      ShowAllStudent st = new ShowAllStudent();
      PrintWriter out = response.getWriter();
       try{
        String data = request.getParameter("jsonData");
       // String data="{\"stdid\":\"54217023\",\"name\":\"da\",\"surname\":\"nu\",\"password\":\"phon\",\"year\":\"4\"}";
        JSONParser parser = new JSONParser();
         Object obj = parser.parse(data);
         JSONObject newJSON = (JSONObject)obj;
           
  //      out.print(newJSON.get("stdid")+","+newJSON.get("name")+","+newJSON.get("surname")+","+newJSON.get("password")+","+newJSON.get("year"));
        st.setStId(Integer.parseInt(newJSON.get("stdid").toString()));
        st.setStName(newJSON.get("name").toString());
        st.setStLastname(newJSON.get("surname").toString());
        st.setPassword(newJSON.get("password").toString());
        st.setYear(Integer.parseInt(newJSON.get("year").toString()));
         

       int value = ShowAllStudent.insertStudent(st);
        if (value > 0) {
            out.println("ID:"+st.getStId()+"/"+"Name:"+st.getStName()+"/"+"SurName:"+st.getStLastname()+"Password:"+"/"+st.getPassword()+"Year:"+"/"+st.getYear());
            out.print("Register");
            
        } else {
            out.println(data);
            out.print("Register Failed!!!");
        }
        

       
       }catch(Exception e){
           System.out.println(e);}
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
        processRequest(request, response);
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
