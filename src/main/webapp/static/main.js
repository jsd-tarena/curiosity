$(function() {
	$.ajax({
		type : "POST",
		url : "http://localhost:8080/curiosity/main.do",
		success : function(msg) {
			alert(msg);
		}
	});
});