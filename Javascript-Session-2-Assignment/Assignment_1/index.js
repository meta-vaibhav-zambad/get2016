
function getLargest(firstNumber , secondNumber , thirdNumber){

	var largestNumber = document.getElementById("largestNumber");	
		
	if(isNaN(firstNumber) || firstNumber === "" || isNaN(secondNumber) || secondNumber === "" || thirdNumber==="" || isNaN(thirdNumber) ){
		
		alert("Please enter valid input");
	}

	else{
			
		firstNumber = parseFloat(firstNumber);

		secondNumber = parseFloat(secondNumber);

		thirdNumber = parseFloat(thirdNumber);

		if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
				
			largestNumber.innerHTML = firstNumber;
			
		}
		
		else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
			
			largestNumber.innerHTML = secondNumber;
		}
		else{
			
			largestNumber.innerHTML = thirdNumber;
		}
	}
}