package app.servlets;

import app.entites.User;
import app.model.Model;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Привет on 26.09.2018.
 */
public class AddServlet extends javax.servlet.http.HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    String password = req.getParameter("pass");
    User user = new User(name, password);
    Model model = Model.getInstance();
    model.add(user);

    req.setAttribute("userName", name);
    doGet(req, resp);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/add.jsp");
    requestDispatcher.forward(req, resp);
  }
}
