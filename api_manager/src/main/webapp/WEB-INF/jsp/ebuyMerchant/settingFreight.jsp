<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="cleartype" content="on">
<meta name="description" content="">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport" content="width=device-width, user-scalable=no, minimal-ui">
<link rel="dns-prefetch" href="//jiefangqu.com">

<title>运费设置</title>
<link rel="stylesheet" href="../css/merchant/shopping.common.css">
</head>

<body class="bggrey">
<section class="sectionBox welcome-img p00 bgdarkblue dsn">
    <div class="change-password-box">
    	<span>解放区会在3个工作日内审核<br>并通知到您</span>
        <input class="btn-submit bgred mtop40 create-shopping-btn" type="button" name="button" value="知道了" onClick="window.location='setting.html'" />
    </div>
</section>
<section class="main-part01">
  <form id="inputform" class="inputform" action="saveShopFullInfo.html" onsubmit="return false;">
    <header class="sectionBox fantasia-header order-top-bg">
        <a class="disblock mleft15 left" href="setting.html"><img class="back-arrow" src="../images/back-arrow.png" /></a>
        <div class="header-title">运费设置</div>
    </header>
    <section class="sectionBox pos-relative">
        <section class="freight-type-delivery-info">
            <input id="freightSetSelect" class="input-text wp100" type="text" hidden="hidden" value="默认选择到店自提" datatype="*" nullmsg="请选择运费类型！" /> 
            <section class="sectionBox password-mind-box borderbottomgrey">
                <div class="mleft15 bold">方式1：到店自提</div>
            </section>
            <div class="list-box bgwhite freight-setting-list">
                <div class="displaybox minheight36">
                    <div class="freight-check-icon on"></div>
                    <div class="mright5 f14">自提点：</div>
                    <div class="boxflex01 f16">
                    	<input name="selfGetAddress" value="${sessionScope.shopInfo.shopName }${sessionScope.shopInfo.shopAddress }" class="input-text ignore-input wp100" type="text" 
                    	placeholder="请录入自提地址，顾客上门取货" datatype="*3-100" errormsg="请填写自提点地址, 3到100个字符！" nullmsg="请填写自提点地址！" /></div>
                </div>
            </div> 
            <section id="moreTypesBtn" class="sectionBox password-mind-box borderbottomgrey">
                <div class="t-center">更多配送方式</div>
            </section> 
            <section id="moreTypesInfo" class="dsn">
	            <section class="sectionBox password-mind-box borderbottomgrey">
	                <div class="mleft15 bold">方式2：订单配送</div>
	            </section> 
	            <div class="list-box bgwhite freight-setting-list f14">
	                <div class="displaybox">
	                    <div class="freight-check-icon"></div>
	                    <div class="mright5 height36">订单金额</div>
	                    <div class="boxflex01"><input name="leastDeliveryAmt" class="input-text ignore-input wp100 f14" type="text" placeholder="请输入订单金额" ignore="ignore" datatype="numberFixTwo" errormsg="请填写数字，可带两位小数！" nullmsg="请输入订单金额！" /></div>
	                    <div class="t-right">元起送</div>
	                </div>
	            </div>
	            <section class="sectionBox password-mind-box bordertbgrey">
	                <div class="mleft15 grey">↑高于此金额才配送，如免邮，设置为0</div>
	            </section>
	            <section class="sectionBox password-mind-box borderbottomgrey">
	                <div class="mleft15 bold">方式3：订单包邮</div>
	            </section>
	            <div class="list-box bgwhite freight-setting-list f14">
	                <div class="displaybox">
	                    <div class="freight-check-icon"></div>
	                    <div class="mright5 height36">订单少于</div>
	                    <div class="boxflex01"><input name="leastOrderAmt" class="input-text ignore-input wp100 f14" type="text" ignore="ignore" datatype="numberFixTwo" errormsg="请填写数字，可带两位小数！" nullmsg="请输入最小订单金额！" /></div>
	                    <div class="f14 mright5">元，收邮费</div>
	                    <div class="boxflex01"><input name="orderAmtPer" class="input-text ignore-input wp100 f14" type="text" ignore="ignore" datatype="numberFixTwo" errormsg="请填写数字，可带两位小数！" nullmsg="请输入每单运费！" /></div>
	                    <div class="t-right">元</div>
	                </div>
	            </div>
	            <section class="sectionBox password-mind-box bordertbgrey">
	                <div class="mleft15 grey">↑如：“订单少于39元，收邮费8元”，即为满39包邮</div>
	            </section>
	            <div class="list-box bgwhite freight-setting-list borderbottomgrey f14">
	                <div class="displaybox">
	                    <div class="freight-check-icon"></div>
	                    <div class="mright5 height36">每单运费</div>
	                    <div class="boxflex01"><input name="orderAmtPerMust" class="input-text ignore-input wp100 f14" type="text" placeholder="请输入每单运费" ignore="ignore" datatype="numberFixTwo" errormsg="请填写数字，可带两位小数！" nullmsg="请输入每单运费！" /></div>
	                    <div class="t-right">元</div>
	                </div>
	            </div>
	            <section class="sectionBox password-mind-box">
	                <div class="mleft15 grey">↑不论订单金额多少，都需要收取运费</div>
	            </section>
            </section>
        </section>
    
        <section class="divide-box pb56"></section>
        <ul class="bottom-menu-box displaybox t-center">
            <li class="p00"><input class="btn-submit btn-next noradius bordertbgrey btnSubmit red" type="button" name="button" value="提交审核"></li>
        </ul>
    </section>
  </form>
</section>
<script src="../js/jquery-1.11.2.min.js"></script>
<script src="../js/merchant/fastclick.js"></script>
<script src="../js/merchant/Validform_v5.3.2.js"></script>
<script src="../js/jquery.form.js"></script>
<script>
$(function(){
	new FastClick(document.body);
	
	//表单验证
	$(".inputform").Validform({
		tiptype:1,
		btnSubmit:".btnSubmit",
		dragonfly:true,
		beforeSubmit:function(){
			$.Showmsg("请稍后…");
		},
		callback:function(data){
			$("#inputform").ajaxSubmit({  
                success: function(data){
                	setTimeout(function(){
                		$.Hidemsg();
	        			$('.main-part01').hide();
	        			$('.welcome-img').show();
                	},1500);
                },  
                error: function(){  
                	$.Showmsg('网络不给力，请稍后重试'); 
                }  
            }); 
		}
	});
	
	//选择配送方式，至少选择一项
	var $deliveryType = $('#deliveryType');
	$('.freight-type li').click(function(){
		var $thisIconCloseBtn = $(this).find('.icon-close-btn');
		var hasOnNum = 0;
		$thisIconCloseBtn.toggleClass('on');
		$('.freight-type li').each(function() {
            if($(this).find('.icon-close-btn').hasClass('on')){
				hasOnNum += 1;
			}
        });
		console.log('hasOnNum',hasOnNum);
		if(hasOnNum == 2){
			$deliveryType.val('');
		}else{
			$deliveryType.val('已选择配送方式');
		}
	});
	
	//选择送货上门方式
	$('.freight-type-delivery').click(function(){
		var $freightTypeInfo = $('.freight-type-delivery-info');
		$freightTypeInfo.stop(true, false).animate({height:'toggle'},200);
		var freightHeight = $freightTypeInfo.css("height");
		if(freightHeight !== '1px'){
			$('.freight-setting-list').each(function(){
				var $thisCheck = $(this).find('.freight-check-icon');
				var $thisInput = $(this).find('input.input-text');
				$thisCheck.removeClass('on');
				$thisInput.attr('ignore', 'ignore');
				$freightType.val('已选择送货上门方式');
			});
		}else{
			$('.freight-setting-list').each(function(){
				$freightType.val('');
			});	
		}
	});

	
	//填写配送费用
	var selfGetAddressAuto = '${sessionScope.shopInfo.shopName }${sessionScope.shopInfo.shopAddress }';	//带出地址= 店铺名称+地址
	var $freightType = $('#freightType');
	var $freightSetSelect = $('#freightSetSelect');
	$('.freight-setting-list').click(function(event){
		var myEvent = event || window.event;
		var $thisCheck = $(this).find('.freight-check-icon');
		var $thisInput = $(this).find('input.input-text');
		
		if(myEvent.target.nodeName != 'INPUT' && !$thisCheck.hasClass('on')){
			$('.freight-setting-list').find('.freight-check-icon').removeClass('on');
			$thisCheck.addClass('on');
			$('input.input-text.ignore-input').attr('ignore', 'ignore');
			$thisInput.attr('ignore', '');
			$(this).siblings('div.freight-setting-list').find('input.input-text').val('');
			$(this).parents(".freight-type-delivery-info").find('div.freight-setting-list').find('input.input-text').val('').attr('readonly', 'readonly');
			$(this).find("input[name='selfGetAddress']").val(selfGetAddressAuto);
			$(this).find('input.input-text').removeAttr('readonly');
			$freightSetSelect.val('已选择运费类型');
		}
	});
	
	$('.freight-setting-list').each(function(index){
		var thisHasOn = $(this).find('.freight-check-icon').hasClass('on');
		if(thisHasOn){
			$('.freight-setting-list').find('input.input-text').attr('readonly', 'readonly');
			$(this).find('input.input-text').removeAttr('readonly');
			return false;
		}
	})
	
	//显示更多配送方式
	$('#moreTypesBtn').click(function(){
		$('#moreTypesInfo').removeClass('dsn');
		$(this).hide();
	});
	
});
</script>


</body>
</html>