function getCombination(){
	
	var radioButtonFor2 = document.getElementById("radioButton2");
	var radioButtonFor3 = document.getElementById("radioButton3");
	var radioButtonFor4 = document.getElementById("radioButton4");
	var radioButtonFor5 = document.getElementById("radioButton5");
	var result = document.getElementById("result");
	
	var combinationString = [];
	
	if(radioButtonFor2.checked){
		
		combinationString.push(radioButtonFor2.value);
	}
	if(radioButtonFor3.checked){
		
		combinationString.push(radioButtonFor3.value);
	}
	if(radioButtonFor4.checked){
		
		combinationString.push(radioButtonFor4.value);
	}
	if(radioButtonFor5.checked){
		
		combinationString.push(radioButtonFor5.value);
	}
	
	result.innerHTML = "Selected Values: "+combinationString;
}