<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="cleartype" content="on">
<meta name="viewport" content="width=device-width, user-scalable=no, minimal-ui">
<link rel="dns-prefetch" href="//jiefangqu.com">

<title>解放区上门服务</title>
<link rel="stylesheet" href="css/shopping.common.css">
</head>

<body>
<section id="tabBox" class="tabBox pos-relative">
    <div class="bd my-order" id="tabBox-bd">
        <div class="myOrderList bgwhite">
           <div class="my-order-item">
			    <div><img src="images/zhaomu.jpg"/></div>
			    <ul class="list-box bordergrey t-center zhaomuPhone">
			    	<a class="disblock" href="tel:400-960-2228">
				    	<li class="paid-num f18 lineheightnormal">招募专线</li>
				    	<li class="mtop5"><span class="f14 mright10 grey">0755-26658119</span></li>
				    </a>
			    </ul>
				<section class="divide-box bgwhite height36"></section>
           </div>
        </div>
    </div>
</section>

<script src="js/jquery-1.11.2.min.js"></script>
<script>
	$(function(){
		
		$('.btnSubmit').click(function(){
			$('#tabBox').hide();
			$('.wrap-bg').removeClass('hide');
		});
		$('.back-btn').click(function(){
			$('.wrap-bg').addClass('hide');
			$('#tabBox').show();
		});
	})
</script>


</body>
</html>