
$(document).ready(alternateColorForRows);

function alternateColorForRows(){
	
	$('tr:even').css('background-color','red');
	$('tr:odd').css('background-color','green');	
}