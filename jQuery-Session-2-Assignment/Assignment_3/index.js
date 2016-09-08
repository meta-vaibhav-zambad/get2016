$(document).ready(buttonsClick);

function buttonsClick(){
	
	$('button#startButton').click(startAnimation);
	$('button#stopButton').click(stopAnimation);
	$('button#backButton').click(backAnimation);
	$('button#topButton').click(moveUp);
	$('button#bottomButton').click(moveDown);
	$('button#rightButton').click(moveRight);
	$('button#leftButton').click(moveLeft);
	
}

function startAnimation(){
	
	
	$('div#myDiv').animate(
		
		{left :'+=97.2%'},
		4000,
		'swing'
	);
	
}

function stopAnimation(){
	
	$('div#myDiv').stop();
	
}

function backAnimation(){
	
	$('div#myDiv').animate(
		
		{left :'-=97.2%'},
		4000,
		'swing'
	);
}

function moveUp(){
	
	$('div#myDiv').animate(
		
		{top : '-=50px'},
		900,
		'swing'
	);
}

function moveDown(){
	
	$('div#myDiv').animate(
		
		{top : '+=50px'},
		900,
		'swing'
	);
}

function moveRight(){
	
	$('div#myDiv').animate(
		
		{left : '+=50px'},
		900,
		'swing'
	);
}

function moveLeft(){
	
	$('div#myDiv').animate(
		
		{left : '-=50px'},
		900,
		'swing'
	);
}