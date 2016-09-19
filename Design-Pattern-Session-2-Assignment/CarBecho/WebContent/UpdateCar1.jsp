<!DOCTYPE HTML>
<html>
	<head>
		<title> Welcome to Car Becho </title>
		<link rel='stylesheet' type='text/css' href='site.index.css'>
		<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
		<link rel='stylesheet' href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
	</head>
	
	<body onLoad="document.getElementById('updateButton').click()">
		<div id='contact'>
			<h2> Update Car </h2>
		</div>
		<div>
			<form id="updateForm" action="UpdateCarServlet" method="GET">
				<div>
					<label> Company Name </label>
					<input type='text' name='car_company_name' value="" placeholder='Company Name'/>
				</div>
				<div>
					<label> Model Number  </label>
					<input type='text' name='car_model_number' value="" placeholder='Model Number'/>
				</div>
				<div>
					<label> Name </label>
					<input type='text' name='car_name' value="" placeholder='Name' />
				</div>
				<div>
					<label> Fuel Capacity (in Litres) </label>
					<input type='number' name='car_fuel_capacity' value="" placeholder='Fuel Capacity'/>
				</div>
				<div>
					<label> Milage  </label>
					<input type='number'  name='car_milage' value="" placeholder='Milage'/>
				</div>
				<div>
					<label> Price </label>
					<input type='text' name='car_price' value="" placeholder='Price'/>
				</div>
				<div>
					<label> Road Tax </label>
					<input type='text' name='car_road_tax' value="" placeholder='Road Tax' />
				</div>
				<div>
					<label> Does car have AC ? </label>
					<input type='radio' name='AC' value='Yes'/> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='AC' value='No'/> <span id='radiotext'> No </span>
				</div>
				<div>
					<label> Does car have power steering ? </label>
					<input type='radio' name='powerSteering' value='Yes'/> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='powerSteering' value='No'/> <span id='radiotext'> No </span>
				</div> 
				<div>
					<label> Does car have accessory kit ? </label>
					<input type='radio' name='accessoryKit' value='Yes'/> <span id='radiotext' > Yes </span> &nbsp; &nbsp;
					<input type='radio' name='accessoryKit' value='No'/> <span id='radiotext'> No </span>
				</div>
				<div>
					<button id='updateButton' type='submit'> <h4 id='buttontext'>  Update  <i class="fa fa-paper-plane" aria-hidden="true"></i> </h4>  </button>
				</div>
			</form>
		</div>
	</body>
</html>