function getValue(){
	
	var firstRadioOption = document.getElementById("firstRadioOption");
	
	var secondRadioOption = document.getElementById("secondRadioOption");
	
	var firstDropdownField = document.getElementById("firstDropdownField");
	
	var secondDropdownField = document.getElementById("secondDropdownField");
	
	if(firstRadioOption.checked){
		
		alert(firstDropdownField.value);
	}
	if(secondRadioOption.checked){
		
		alert(secondDropdownField.value);
	}
}