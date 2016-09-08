$(document).ready(init);

function init(){
	
	$('input#name').keyup(changeBackgroundForNameField);
	$('input#age').keyup(changeBackgroundForAgeField);
	$('textarea').keyup(changeBackgroundForTextArea);
}

function changeBackground(inputName){
	
	
	var originalColor = 'white';
	inputName.css('background-color','#AFDBEC');
	setTimeout(function(){
		
		inputName.css('background-color',originalColor);
		
	},200);
	
}

function changeBackgroundForNameField(){
	
	var inputName = $('input#name');
	var currentValue ="";
	currentValue = inputName.val();
	
	if(currentValue != ""){
		
		changeBackground(inputName);
		$('div#nameDiv').html("Name : "+currentValue);
		
	}
	else{
		$('div#nameDiv').html("");
	}
	
}

function changeBackgroundForAgeField(){
	
	var inputName = $('input#age');
	var currentValue = "";
	currentValue = inputName.val();
	
	if(currentValue != ""){
		
		changeBackground(inputName);
		$('div#ageDiv').html("Age : "+currentValue);
	}
	else{
		
		$('div#ageDiv').html("");
	}
}

function changeBackgroundForTextArea(){
	
	var inputName = $('textarea');
	var currentValue = "";
	currentValue = inputName.val();
	
	if(currentValue != ""){
		
		changeBackground(inputName);
		$('div#addressDiv').html("Address : "+currentValue);
	}
	else{
		
		$('div#addressDiv').html("");
	}
}