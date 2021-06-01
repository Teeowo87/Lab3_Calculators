
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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstinput = request.getParameter("first_input");
        String secondinput = request.getParameter("second_input");
        String addParameter = request.getParameter("add");
        String subParameter = request.getParameter("sub");
        String mulParameter = request.getParameter("mul");
        String modParameter = request.getParameter("mod");
        
        request.setAttribute("first_input", firstinput );
        request.setAttribute("second_input", secondinput );
        request.setAttribute("add", addParameter );
        request.setAttribute("sub", subParameter );
        request.setAttribute("mul", mulParameter );
        request.setAttribute("mod", modParameter );
        
        
        if (firstinput == null || secondinput == null || firstinput.equals("") ||secondinput.equals("")){
            request.setAttribute("message2", " is invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        else if (addParameter != null){
            int addition = Integer.parseInt(firstinput) + Integer.parseInt(secondinput);
            request.setAttribute("message2",  addition);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if (subParameter != null){
            int subtraction = Integer.parseInt(firstinput) - Integer.parseInt(secondinput);
        request.setAttribute("message2", + subtraction);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if (mulParameter != null){
            int multiplication = Integer.parseInt(firstinput) * Integer.parseInt(secondinput);
        request.setAttribute("message2", " Result: " + multiplication);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if (modParameter != null){
            int modulus = Integer.parseInt(firstinput) % Integer.parseInt(secondinput);
        request.setAttribute("message2", " Result: " + modulus);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
    }

    
}
