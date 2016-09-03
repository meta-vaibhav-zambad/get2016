
var largestNumber = document.getElementById("largestNumber");	
	
var firstNumber = null;
var secondNumber = null;
var thirdNumber = null;
	
do{
	
	firstNumber = prompt("Please enter valid first number");
	
}while(isNaN(firstNumber) || firstNumber === "" );

do{
	
	secondNumber = prompt("Please enter valid second number");
	
}while(isNaN(secondNumber) || secondNumber === "");

do{ 
	
	thirdNumber = prompt("Please enter valid third number");
	
}while(isNaN(thirdNumber) || thirdNumber === "");


if(firstNumber == null || secondNumber === null || thirdNumber === null){
	
	largestNumber.innerHTML = "User canceled the operation";;
	
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
