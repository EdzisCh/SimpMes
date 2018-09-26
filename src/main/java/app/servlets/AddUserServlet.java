package app.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;

/**
 * Created by Привет on 26.09.2018.
 */
public class AddUserServlet extends javax.servlet.http.HttpServlet {

  protected void doPost(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

  }

  protected void doGet(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/addUser.jsp");
    requestDispatcher.forward(request, response);
  }
}
