<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
	</head>
	<body>
	
	</body>
	<script>
		var lastPay = localStorage.lastPay;
		if(lastPay === 'tempCar'){
			location.href = '${pageContext.request.contextPath}/temporaryParkingFee/goFeePage.html';
		}else{
			location.href = '${pageContext.request.contextPath}/payCarFee/monthCar.do';
		}
	</script>
</html>