var result = document.getElementById("result");

do{
	
	input = prompt("Please enter valid number");
	
}while(isNaN(input) || input === "" );

if(input === null){
	
	result.innerHTML = "User canceled the operation";
		
}

else{
	
	input = parseInt(input)+10;
	result.innerHTML = input;
}