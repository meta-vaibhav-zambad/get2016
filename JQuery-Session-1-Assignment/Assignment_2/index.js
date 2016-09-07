
$(document).ready(defineOnClickOnButton);


function defineOnClickOnButton(){
	
	$('#toggleButton').click(showAndHideText);
}


function showAndHideText(){
	
	if ( $('#toggleButton').attr('value') === 'Hide'){
		$('span').hide();
		$('#toggleButton').attr('value','Show');
	}
		
	else if( $('#toggleButton').attr('value') === 'Show' ){
			
		$('span').show();
		$('#toggleButton').attr('value','Hide');
	}
}	
