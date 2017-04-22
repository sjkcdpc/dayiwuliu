<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<meta name="keywords" content=" 天瑞" />
<link href="${stylesRoot }/bootstrap.css" rel="stylesheet">
<link href="${stylesRoot }/base.css" rel="stylesheet">
<link href="${stylesRoot }/style.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="${stylesRoot }/pagination/pagination.css" />
<!--这个日历控件js必须放头部-->
</head>
<body>
	<div class="container-fluid">
		<jsp:include page="../../common/header.jsp" flush="false"></jsp:include>
		<!--后台右侧布局begin-->
		<div class="col-md-10 ">
			<div class="ht_content">
				<div id="content-header">
					<h3>运单轨迹</h3>
					<input type="hidden" id="bid" value="${id }">
				</div>
			</div>	
			<div id="_bmap" style="height:700px;width:100%;margin-top:10px">
					</div>
			<!--后台右侧布局end-->
		</div>
		<!--后台整体布局end-->
		<!--侧边栏end-->
	<%@include file="../../common/footer.jsp"%>
	<script type="text/javascript">
		var CONTEXTPATH = "${contextPath}";
		var imagesRoot = "${imagesRoot}";
	</script>
	<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script type="text/javascript" src="http://api.map.baidu.com/getscript?v=1.5&ak=7wG9zl9ryQt25NHfHxMECnbScLmSSkKj&services=&t=20150522094656"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=7wG9zl9ryQt25NHfHxMECnbScLmSSkKj"></script>
<script type="text/javascript">
	// 百度地图API功能
   	var map;
	$(function () {
	  // 百度地图API功能
	  map = new BMap.Map("_bmap");
	  map.addControl(new BMap.NavigationControl());               // 添加平移缩放控件
	  map.addControl(new BMap.ScaleControl());                    // 添加比例尺控件
	  map.addControl(new BMap.OverviewMapControl());              //添加缩略地图控件
	  map.enableScrollWheelZoom();                            //启用滚轮放大缩小
	  map.addControl(new BMap.MapTypeControl());          //添加地图类型控件
	  
	  showToolAutoDef(map);
	});
	
	
	function showToolAutoDef(map) { 
		$.ajax({
    		url:"/report/billPositiondata",
			data:{id:$("#bid").val()},
			type : "post",
			dataType:"json",
			success:function(rs){
				if( rs && rs.code =="000000" ){
					var list = rs.data;
					var points = new Array();
					var lon;
					var lat;
					var nlon;
					var nlat
					//位置长度
					var length = list.length;
					//运单状态
					var billStatus = list[0].billStatus;
					console.log("billStatus="+billStatus);
					for (var a = 0; a < list.length; a++) {
						lon = list[a].lon/1000000;
						lat = list[a].lat/1000000;
						addMarker(lon,lat,list[a].status);
							var thePoint1 = new BMap.Point(lon,lat);
							if(2<=billStatus<5){
								if(a<(length-1)){
									nlon = lon;
									nlat = lat
									points.push(thePoint1);
								}
							}if(billStatus>=5){
								nlon = lon;
								nlat = lat
								points.push(thePoint1);
							}
					}
					map.centerAndZoom(new BMap.Point(nlon, nlat),8);
					drawPolyline(map, points);
				}else{
					alert(rs.error);
				}
			}
    	})
				
	}
	
	//创建marker
	function addMarker(lng, lat, status){
		    var point = new BMap.Point(lng,lat);
		    var iconImg = createIcon(status);
		    var marker = new BMap.Marker(point,{icon:iconImg});
		    
		    var _marker = marker;
					_marker.addEventListener("click",function(){
					    alert(lng+" |  "+lat);
				    });
		    
		    map.addOverlay(marker);
	}
	
	/**
	 * 画线
	 * @param bMap
	 * @param points
	 */
	function drawPolyline(bMap, points) {
		if (points==null || points.length<=1) {
			return;
		}
		bMap.addOverlay(new BMap.Polyline(points, {
			strokeColor : "blue",
			strokeWeight : 3,
			strokeOpacity : 0.6
		})); // 画线
	}
	
	//创建一个Icon
	function createIcon(status){
		var m = "bposition"+status+".png";
		var icon ;
		if(status!=""){
			icon = new BMap.Icon("${imagesRoot }/"+m, 
		        	new BMap.Size(100, 80), 
		        	{anchor: new BMap.Size(40, 40),
	        		 imageOffset: new BMap.Size(20, -3)});
		}else{
			icon = new BMap.Icon("${imagesRoot }/"+m, 
		        	new BMap.Size(100, 80), 
		        	{anchor: new BMap.Size(40, 40),
	        		 imageOffset: new BMap.Size(20, 20)});
		}
		return icon;
	}
</script>
</body>
</html>