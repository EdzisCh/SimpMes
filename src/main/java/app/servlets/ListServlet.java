package app.servlets;

import app.model.Model;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 * Created by Привет on 26.09.2018.
 */

public class ListServlet extends javax.servlet.http.HttpServlet {

  protected void doPost(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {

  }

  protected void doGet(javax.servlet.http.HttpServletRequest request,
      javax.servlet.http.HttpServletResponse response)
      throws javax.servlet.ServletException, IOException {
    Model model = Model.getInstance();
    List<String> names = model.list();
    request.setAttribute("userNames", names);

    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/list.jsp");
    requestDispatcher.forward(request, response);

  }
}
