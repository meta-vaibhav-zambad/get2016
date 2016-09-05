function printPyramid(){
	
	var finalPattern = [];
	var result = document.getElementById("pyramid");
	
	for(var i = 0; i <= 9 ; ++i){
		
		finalPattern.push(getSpaces(9,i)+getSymbol(i)+getSpaces(i)+"<br/>");
	}
	
	result.innerHTML = finalPattern.join("");
}


function getSpaces(totalRows,rowNumber){
	
	var spaces = "";
	for(var i = totalRows-rowNumber-1;i >=0 ; --i){
		
		spaces += "&numsp;";
	}
	
	return spaces;
}

function getSymbol(rowNumber){
	
	var symbol = "";
	for(var i = 0 ; i < rowNumber; ++i){
		
		symbol += "* &nbsp;";
	}
	
	return symbol;
}