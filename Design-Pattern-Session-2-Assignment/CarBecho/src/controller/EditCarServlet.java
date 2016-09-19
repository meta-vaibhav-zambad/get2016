package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.CarFacade;

/**
 * Servlet implementation class EditCarServlet
 */
@WebServlet("/EditCarServlet")
public class EditCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = null;

		try{
			response.setContentType("text/html");

			CarFacade facade = new CarFacade();
			
			out = response.getWriter();
			
			List<CarVO> listOfCars = facade.getAllCars();
			
			out.println("<html><body>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Company Name");
			out.println("</th>");
			out.println("<th>");
			out.println("Model Number");
			out.println("</th>");
			out.println("<th>");
			out.println("Car Name");
			out.println("</th>");
			out.println("</tr>");
			for(CarVO car : listOfCars){
				
				out.println("<tr>");
				out.println("<td>");
				out.println(car.getCompanyName());
				out.println("</td>");
				out.println("<td>");
				out.println(car.getModelNumber());
				out.println("</td>");
				out.println("<td>");
				out.println(car.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(" <a href='UpdateCar?carName="+car.getCompanyName()+
						"modalNumber="+car.getModelNumber()+"carName="+car.getName()+"Edit </a>");
				out.println("</td>");
				out.println("</tr>");
			}
			
			out.println("</table>");
			out.println("</body></html>");
		
		}catch(Exception ex){
			
			ex.printStackTrace();
		}finally{
			
			out.flush();
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
