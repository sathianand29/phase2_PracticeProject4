

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String pr=request.getParameter("price");
		String i=request.getParameter("id");
		
		int price=Integer.parseInt(pr);
		int id=Integer.parseInt(i);
		
		ProductDetails pro=new ProductDetails();
		pro.setPrice(price);
		pro.setName(name);
		pro.setid(id);
		
		out.println("<html><body>");
		
		if(name!=null && id!=0 && price!=0)
		{
			session.setAttribute("name", name);
			session.setAttribute("ID", id);
			session.setAttribute("rate", price);
			out.println("done");
		}
		RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
