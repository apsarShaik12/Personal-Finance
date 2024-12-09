package com.finance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FinanceServlet")
public class FinanceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            Connection connection = DatabaseConnection.initializeDatabase();
            // Continue with database operations
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<p>SQL Error: " + e.getMessage() + "</p>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            out.println("<p>Class Not Found Error: " + e.getMessage() + "</p>");
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>General Error: " + e.getMessage() + "</p>");
        }
    }

}
