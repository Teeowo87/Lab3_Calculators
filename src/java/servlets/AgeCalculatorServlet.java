
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 848925
 */
public class AgeCalculatorServlet extends HttpServlet {

      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //this will display the resquested JSP as a view
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //Capture the parameters from the POST request (the form)
       String age = request.getParameter("age_input");
       
       request.setAttribute("age_input", age);
       
        if (age == null || age.equals("")){
            //checks if the user input is null or an empty string
            request.setAttribute("message", "You must give your current age");
            // forward the request and response objects to the JSP
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;//
        }
        else if (!age.matches("-?\\d+(\\.\\d+)?")) {
            // checks to see if the user input is a string and not a number
             request.setAttribute("message", "You must enter a number");
            // forward the request and response objects to the JSP
            //display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;//
        }
        else{
            // receives a number and calculates the new age of the user
            int aged = Integer.parseInt(age);
            aged = aged + 1;
            request.setAttribute("message", "Your age next birthday will be " + aged);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }
        
    }
       
 
}
