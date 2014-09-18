$(function() {
	$("#submit-btn").click(function() {
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/curiosity/ask.do",
			data : {
				"title_area" : $("#title-area").val(),
				"title_area_shadow" : $("#title-area-shadow").val()
			},
			success : function(msg) {
				location.href="http://localhost:8080/curiosity/html/index.html";
			}
		});
	});
});