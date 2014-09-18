 function getXhr(){
  	var xhr = null;
  	if(window.XMLHttpRequest){
  	   xhr = new XMLHttpRequest();
  	}else{
  		xhr = new ActiveXObject("Microsoft.XMLHTTP");
  	}
  	//alert(xhr);
  	return xhr;
  }
  
  //$("username")
  function $(id){
  	return document.getElementById(id);
  }
  
  //$F("username")
  function $F(id){
  	return $(id).value;
  }
  
  
  