function hideAndShowText(){
	
	var text = document.getElementById('someText');
	var button = document.getElementById('toggleButton');
	if(button.value === 'Hide'){
		
		text.style.display = 'none';
		button.value = 'Show';
	}
	else if(button.value  === 'Show'){
		
		text.style.display = 'inline';
		button.value = 'Hide';
	}
}