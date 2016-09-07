
$(document).ready(getSelectors);

function getSelectors(){
	
	$('span.message').css('background-color','#6371CF');
	
	$('div.box:first').css('background-color','#C5CB5E');
	
	$('button').css('background-color','#E888E3');
	
	$('img[alt="hello"]').css('width','20%');
	
	$('div#myDiv').children('input[type="text"]').css('background-color','#94E888');
	
	$('input[type="text"][name^="txt"]').css('background-color','#B7EAE7');
	
	$('p:not(.box)').css('background-color','#EAD7B7');
	
	$('div#myDiv').children('span.info').css('background-color','#E95078');
	
	$('div.box,div.error').css('background-color','#DAC789');
	
	$('div[class="box error"]').css('background-color','#E62470');
}