function getPattern(){
	
	var userInput = [];
	
	var flag = 0;
	userInput.push(document.getElementById("number1").value);
	userInput.push(document.getElementById("number2").value);
	userInput.push(document.getElementById("number3").value);
	userInput.push(document.getElementById("number4").value);
	
	var result = document.getElementById("pattern");
	
	for(var i = 0 ; i < userInput.length ; ++i){
		
		if(userInput[i] == "" || isNaN(userInput[i]) || Number(userInput[i]) % 1 !=0 || Number(userInput[i]) < 0 ){
			
			alert("Please enter valid input");
			flag = 1;
			break;
		}
	}
	
	if(flag === 0){
		
		var max = 0;
		var temp = 0;
		var resultString = "";
		var patternArray = [];
		max = Math.max(userInput[0],userInput[1],userInput[2],userInput[3]);
		temp = max;
		for(var i = 0 ; i < max; ++i){
			
			resultString = "";
			if(userInput[0] >= temp){
				
				resultString += "* &nbsp;";
			}
			if(userInput[0] < temp){
				
				resultString += "&numsp; &nbsp;";
			}
			if(userInput[1] >= temp){
				
				resultString += "* &nbsp;";
			}
			if(userInput[1] < temp){
				
				resultString += "&numsp; &nbsp;";
			}
			if(userInput[2] >= temp){
				
				resultString += "* &nbsp;";
			}
			if(userInput[2] < temp){
				
				resultString += "&numsp; &nbsp;";
			}
			if(userInput[3] >= temp){
				
				resultString += "* &nbsp;";
			}
			if(userInput[3] < temp){
				
				resultString += "&numsp; &nbsp;";
			}
			temp--;
			patternArray.push(resultString+"<br/>");
		}
		
		var lastString = "A B C D";
		patternArray.push(lastString);
		result.innerHTML = patternArray.join("");
	}
}