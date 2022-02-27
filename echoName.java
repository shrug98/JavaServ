//Import Servlet Libraries
import javax.servlet.*;
import javax.servlet.http.*;

//Import Java Libraries
import java.io.*;
import java.util.*;
import java.lang.*;

public class echoName extends HttpServlet
{
   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
   {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      out.print("<html>\n<head>\n\n");
      out.print("<title>SWE 432: Name echoing</title>\n");
      out.print("</head>\n");
      out.print("<body>\n");
      out.print("<center><h2>Name echoing</h2></center>\n");
      out.print("<hr>\n");

      String Nm = request.getParameter("username");
      String Lm = request.getParameter("lastname");
      out.print("Your name is: <font color=green>");
      out.print(Nm);
      out.print(' ');
      out.print(Lm);
      out.print("</font>\n");
      out.print("</body>\n");
      out.print("</html>\n");

      out.close ();
   }
}
