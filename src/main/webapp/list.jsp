<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
	<script src="https://cdn.bootcss.com/jquery/1.12.3/jquery.js"></script>
<!-- <script type="text/javascript" src="static/js/jquery-3.2.1.min.js"></script> -->
<script type="text/javascript"
	src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<body>
<h1>hello </h1>
<input type="text" id="id"/>
<input type="button" id="bnt"/>

 

</body>
	<script type="text/javascript">
	$(function(){
		$('#bnt').click(function(){
			var t=$("#id").val();
			
		})
		
		
	})
	var aee=[5,4,5];
		$.each(aee,function (i,t){
			alert(i)
			alert(t)
		})
	</script>


</html>