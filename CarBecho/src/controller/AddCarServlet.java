package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarFacade;
import model.CarVO;

/**
 * Servlet implementation class AddCarServlet
 */
@WebServlet("/AddCarServlet")
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCarServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = null;
		
		try{
			response.setContentType("text/html");

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
				
			out = response.getWriter();
			
			if(facade.addAndValidateCar(car)){

				out.println("<html><body>");
				out.println("<b> Success </b>");
				out.println("</body></html>");
			}else{
				
				out.println("<html><body>");
				out.println("<b> Failure </b>");
				out.println("</body></html>");
			}

		}catch(Exception ex){

			//System.out.println("Something went wrong: "+ex.getMessage());
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

	}

}