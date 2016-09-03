function validateForm(){
		
	var firstName = document.getElementById("firstName");
	var lastName = document.getElementById("lastName");
	var email = document.getElementById("email");
	var phone = document.getElementById("phone");
	var address = document.getElementById("address");
	var checkboxes = document.getElementsByName("Technologies");
	var result = false;
	
	if(firstName.value === ""){
		
		alert("Please enter first name");
		firstName.focus();
		result = false;
		
	}
	else if(lastName.value === ""){
		
		alert("Please enter last name");
		lastName.focus();
		result = false;
	}
	else if(email.value === ""){
		
		alert("Please enter email");
		email.focus();
		result = false;
	}
	else if(phone.value === ""){
		
		alert("Please enter phone number");
		phone.focus();
		result = false;
	}
	else if(address.value === ""){
		
		alert("Please enter address");
		address.focus();
		result = false;
	}
	else{
		for(var i = 0 ; i < checkboxes.length ; ++i){
		
			if(checkboxes[i].checked){
				
				result = true;
				break;
			}
		}
		
		if(result === false){
			
			checkboxes[0].focus();
			alert("Please select one of the technology");
		}
	}
	
	
	return result;
}