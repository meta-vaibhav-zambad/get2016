package controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class UpdateCarServlet
 */
@WebServlet("/UpdateCarServlet")
public class UpdateCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateCarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		
		PrintWriter out = null;
		
		try{

			out = response.getWriter();
			
			CarVO car = new CarVO();
			
			CarFacade facade = new CarFacade();
			
			car.setCompanyName(request.getParameter("car_company_name"));
			car.setModelNumber(request.getParameter("car_model_number"));
			car.setName(request.getParameter("car_name"));
			car.setFuelCapacity(Double.parseDouble(request.getParameter("car_fuel_capacity")));
			car.setMilege(Double.parseDouble(request.getParameter("car_milage")));
			car.setPrice(Double.parseDouble(request.getParameter("car_price")));
			car.setRoadTax(Double.parseDouble(request.getParameter("car_road_tax")));
			
			if(request.getParameter("AC").equals("Yes")){

				car.setAcPresent(1);
			}
			if(request.getParameter("powerSteering").equals("Yes")){

				car.setPowerSteeringPresent(1);;
			}
			if(request.getParameter("accessoryKit").equals("Yes")){

				car.setAccessoryKitPresent(1);
			}
			
			if(facade.updateAndValidateCar(car)){

				out.println("<html><body>");
				out.println("<b> Updated Successfully </b>");
				out.println("</body></html>");
			}else{
				
				out.println("<html><body>");
				out.println("<b> Failure </b>");
				out.println("</body></html>");
			}
=======

		try{

			ConnectionFactory connectionFactory = ConnectionFactory.getInstance();

			CarDAO cardao = new CarDAO(connectionFactory.getConnection());

			PrintWriter out = response.getWriter();
			
			CarVO car = new CarVO();
			
			car.setCompanyName(request.getParameter("companyName"));
			car.setModelNumber(request.getParameter("modalNumber"));
			car.setName(request.getParameter("carName"));
			car.setFuelCapacity(Double.parseDouble(request.getParameter("fuelCapacity")));
			car.setMilege(Double.parseDouble(request.getParameter("milage")));
			car.setPrice(Double.parseDouble(request.getParameter("price")));
			car.setRoadTax(Double.parseDouble(request.getParameter("roadTax")));
			car.setAcPresent(Integer.parseInt(request.getParameter("AC")));
			car.setPowerSteeringPresent(Integer.parseInt(request.getParameter("powerSteering")));
			car.setAccessoryKitPresent(Integer.parseInt(request.getParameter("accessoryKit")));
			
			request.setAttribute("car_company_name",car.getCompanyName());
			request.setAttribute("car_model_number",car.getModelNumber());
			request.setAttribute("car_name",car.getName());
			request.setAttribute("car_fuel_capacity",car.getFuelCapacity());
			request.setAttribute("car_milage",car.getMilege());
			request.setAttribute("car_price",car.getPrice());
			request.setAttribute("car_road_tax",car.getRoadTax());
			
			if(car.isAcPresent() == 0){
				request.setAttribute("AC", "No");
			}
			else{
				
				request.setAttribute("AC", "Yes");
			}
			if(car.isPowerSteeringPresent() == 0){
				
				request.setAttribute("powerSteering","No");
			}
			else{
				
				request.setAttribute("powerSteering","Yes");
			}
			if(car.isAccessoryKitPresent() == 0){
				
				request.setAttribute("accessoryKit", "No");
			}
			else{
				
				request.setAttribute("accessoryKit", "Yes");
			}
			
			
>>>>>>> cc42741eb3b9a26714b6808ca51a5880f8a8f0af

		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
<<<<<<< HEAD
			out.flush();
			out.close();
=======
			
>>>>>>> cc42741eb3b9a26714b6808ca51a5880f8a8f0af
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
