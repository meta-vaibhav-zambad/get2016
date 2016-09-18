package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import model.CarFacade;
import model.CarVO;
=======
import model.CarDAO;
import model.CarVO;
import model.ConnectionFactory;
>>>>>>> cc42741eb3b9a26714b6808ca51a5880f8a8f0af

/**
 * Servlet implementation class ViewCarServlet
 */
@WebServlet("/ViewCarServlet")
public class ViewCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewCarServlet() {
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

<<<<<<< HEAD
			CarFacade facade = new CarFacade();
			
			out = response.getWriter();
			
			List<CarVO> listOfCars = facade.getAllCars();
=======
			ConnectionFactory connectionFactory = ConnectionFactory.getInstance();
			
			CarDAO cardao = new CarDAO(connectionFactory.getConnection());
			
			out = response.getWriter();
			
			List<CarVO> listOfCars = cardao.selectAllCars();
>>>>>>> cc42741eb3b9a26714b6808ca51a5880f8a8f0af
			
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
			out.println("<th>");
			out.println("Fuel Capacity (in Litres)");
			out.println("</th>");
			out.println("<th>");
			out.println("Milage");
			out.println("</th>");
			out.println("<th>");
			out.println("Price");
			out.println("</th>");
			out.println("<th>");
			out.println("Road Tax");
			out.println("</th>");
			out.println("<th>");
			out.println("AC");
			out.println("</th>");
			out.println("<th>");
			out.println("Power Steering");
			out.println("</th>");
			out.println("<th>");
			out.println("Accessory Kit");
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
				out.println(car.getFuelCapacity());
				out.println("</td>");
				out.println("<td>");
				out.println(car.getMilege());
				out.println("</td>");
				out.println("<td>");
				out.println(car.getPrice());
				out.println("</td>");
				out.println("<td>");
				out.println(car.getRoadTax());
				out.println("</td>");
				out.println("<td>");
				if(car.isAcPresent() == 0){
					
					out.println("No");
				}
				else{
					
					out.println("Yes");
				}
				
				out.println("</td>");
				out.println("<td>");
				if(car.isPowerSteeringPresent() == 0){
					
					out.println("No");
				}
				else{
					
					out.println("Yes");
				}
				
				out.println("</td>");
				out.println("<td>");
				if(car.isAccessoryKitPresent() == 0){
					
					out.println("No");
				}
				else{
					
					out.println("Yes");
				}
				
				out.println("</td>");
				out.println("<td>");
				out.println(" <a href=View/UpdateCar.html?companyName="+car.getCompanyName()+
						"modalNumber="+car.getModelNumber()+"carName="+car.getName()+"fuelCapacity="+
						car.getFuelCapacity()+"milage="+car.getMilege()+"price="+car.getPrice()+
						"roadTax="+car.getRoadTax()+"AC="+car.isAcPresent()+
						"powerSteering="+car.isPowerSteeringPresent()+"accessoryKit="
						+car.isAccessoryKitPresent()+">"+"Edit </a>");
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

<<<<<<< HEAD
}
=======
}
>>>>>>> cc42741eb3b9a26714b6808ca51a5880f8a8f0af
