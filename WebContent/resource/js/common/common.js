$(function(){
	if(total < 5){
		for( j = total+1; j <= 5; j++){
			var v = "#"+ j;
			$(v).css("display","none");
		}
	}
	$("#1").addClass("active");
});


var next = function(){
	if((now_nu - -1  >= 3)&&(now_nu - -1 <= total - 2)){
		now_nu = now_nu - -1;
		$("#1 a").text(now_nu - 2);
		$("#2 a").text(now_nu - 1);
		$("#3 a").text(now_nu);
		$("#4 a").text(now_nu - -1);
		$("#5 a").text(now_nu - -2);
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == 3) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
	}else{ 
		if(now_nu >= total){
			now_nu == now_nu;
		}else{
			now_nu = now_nu - -1;
		}
		
		var a;
		if(now_nu < 3) a = now_nu;
		if(now_nu > 3) a = now_nu - total +5;
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == a) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
	}
	replace(now_nu,urlPath);
};

var previous = function(){
	if((now_nu  -1  >= 3)&&(now_nu  -1 <= total - 2)){
		now_nu = now_nu -1;
		$("#1 a").text(now_nu - 2);
		$("#2 a").text(now_nu - 1);
		$("#3 a").text(now_nu);
		$("#4 a").text(now_nu - -1);
		$("#5 a").text(now_nu - -2);
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == 3) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
	}else{ 
		if(now_nu <= 1){
			now_nu == 1;
		}else{
			now_nu = now_nu -1;
		}
		
		var a;
		if(now_nu < 3) a = now_nu;
		if(now_nu > 3) a = now_nu - total +5;
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == a) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
	}
	replace(now_nu,urlPath);
};

var cli = function(number){
	var v = "#" + number;
	now_nu = $(v).text();
	if(now_nu >= 3 && now_nu <= total - 2){
		$("#1 a").text(now_nu - 2);
		$("#2 a").text(now_nu - 1);
		$("#3 a").text(now_nu);
		$("#4 a").text(now_nu - -1);
		$("#5 a").text(now_nu - -2);
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == 3) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
		
	}else{
		for (i = 1 ; i <= 5; i++) {
			var v = "#"+ i;
			if (i == number) {
				$(v).addClass("active");
			} else{
				$(v).removeClass("active");
			}
		}
	};
	replace(now_nu,urlPath);
};
