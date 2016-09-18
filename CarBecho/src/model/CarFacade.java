package model;

import java.util.List;

import daoLayer.CarDAO;
import daoLayer.ConnectionFactory;

public class CarFacade {

	public boolean addAndValidateCar(CarVO car){

		boolean flag = false;

		ConnectionFactory connectionFactory = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			CarDAO cardao = new CarDAO(connectionFactory.getConnection());

			if(cardao.addCar(car)){

				flag = true;
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

		return flag;
	}

	public boolean updateAndValidateCar(CarVO car){

		boolean flag = false;

		ConnectionFactory connectionFactory = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			CarDAO cardao = new CarDAO(connectionFactory.getConnection());

			if(cardao.updateCar(car)){

				flag = true;
			}

		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return flag;
	}
	
	public List<CarVO> getAllCars(){
		
		List<CarVO> listOfCars = null;
		
		ConnectionFactory connectionFactory = null;

		try{

			connectionFactory = ConnectionFactory.getInstance();

			CarDAO cardao = new CarDAO(connectionFactory.getConnection());

			listOfCars = cardao.selectAllCars();

		}catch(Exception ex){

			ex.printStackTrace();
		}finally{
			try{
				connectionFactory.closeConnection();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		return listOfCars;
	}

}