/****************************************************************
 *																*		
 * 						      代码库							*
 *                        www.dmaku.com							*
 *       		  努力创建完善、持续更新插件以及模板			*
 * 																*
****************************************************************/
$(function(){
	$(".banner li").hide().eq(0).show();
	$(".banner-dian li").eq(0).addClass('dian-active');
	var n = 0;
	function lunB(){
		if (n < $(".banner li").length - 1) {
			n++;
		} else{
			n= 0;
		};
		$(".banner li").hide().eq(n).stop().show();
		$(".banner-dian li").removeClass('dian-active').eq(n).stop().addClass('dian-active')
	};
	t = setInterval(lunB,5000);
	$(".banner-box").hover(function(){
		clearInterval(t);
	},function(){
		t = setInterval(lunB,5000);
	});
	$(".prev-banner").click(function(){
		if(n>0){
			n--;
		}else{
			n=$(".banner li").length - 1;
		};
		$(".banner li").hide().eq(n).stop().show();
		$(".banner-dian li").removeClass('dian-active').eq(n).stop().addClass('dian-active')
	});
	$(".next-banner").click(function(){
		lunB();
	});
	$(".banner-dian li").click(function(){
		n = $(this).index();
		$(".banner li").hide().eq(n).stop().show();
		$(".banner-dian li").removeClass('dian-active').eq(n).stop().addClass('dian-active')
	});
	
	
	//悬浮客服
	$(".xf_box ul li").hover(function(){
		$(this).find(".xf").stop().animate({"width":"124px"},200).css({"opacity":"1","filter":"Alpha(opacity=100)","background":"#cc0000"})	
	},function(){
		$(this).find(".xf").stop().animate({"width":"54px"},200).css({"opacity":"0.8","filter":"Alpha(opacity=80)","background":"#000"})	
	});
	
	$(".xf_box").hide()
	$(window).scroll(function(){
		if ($(window).scrollTop() > 300){
			$(".xf_box").fadeIn(400)
		}else{
			$(".xf_box").fadeOut(0)
		}
	});
	
	$(".nva-list li ul").hide();
	$(".nva-list li").hover(function(){
		$(this).find('ul').stop().slideToggle(500);
	});
	
	
	var i=0;
	$("#product ul").hide().eq(0).show();
	$(".cp-title li").hover(function(){
		i = $(this).index();
		$(".cp-title li").removeClass('cp-active').eq(i).addClass('cp-active');
		$("#product ul").hide().eq(i).stop().fadeIn();
	})
});
function goTop(){
	$('html,body').animate({'scrollTop':0},600);
};

