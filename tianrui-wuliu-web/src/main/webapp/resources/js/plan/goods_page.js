/**
 * 我发布的计划页面初始化
 */
$("#planowner").addClass("selected");
var PlanUrl={
		page:	"/trwuliu/goods/select"
};
function pageCallback(pageNo) {
	displayData(pageNo);  
} 

var loading = {
		$loadHtml:$('<tr class="loadtr"><td colspan="7" class="bill_load" style="text-align: center;"><img src="'+trRoot+'/tianrui/images/reloader.gif"><h5>数据载入中，请稍后......</h5></td></tr>'),
		append:function(){
			$('#planlist').empty().append(this.$loadHtml);
		},
		remove:function(){
			this.$loadHtml.remove();
		}
};

function displayData(pageNo){
	$('.hasdata').show();
	$('.nodata').hide();
	loading.append();
	if(pageNo && pageNo >= 0){
		searchPlan(+pageNo+1);
	}else{
		searchPlan(1);
	}
}
//请求数据
function searchPlan(pageNo){
	$.ajax({
		url:PlanUrl.page,
		data:{"pageNo":pageNo,
			"searchParam":$("#search_v").val(),
			"pageSize":10},
		type:"post",
		success: function(rs) {
			loading.remove();
			if(rs.code!="000000"){
				alert("初始化失败");
			}else{
				var data = rs.data.list || [];
				var total = rs.data.total;
				var pageNo = rs.data.pageNo;
				var pageSize = rs.data.pageSize;
				renderHtml(data);
				//是否显示无数据
				if( data.length==0 && pageNo ==1){
					$('.hasdata').hide();
					$('.nodata').show();
				}
				$("#totalPages").html(parseInt((total+pageSize-1)/pageSize));  
				$('#totalRecords').html(total);
				$('#pageNo').val(pageNo);
				$("#pagination").pagination(total, {
				    callback: pageCallback,
				    prev_text: '上一页',
				    next_text: '下一页',
				    items_per_page:pageSize,
				    num_display_entries:4,
				    current_page:pageNo-1,
				    num_edge_entries:1,
				    maxentries:total,
				    link_to:"javascript:void(0)"
				});
			}
		}
	});
};

//渲染页面
function renderHtml(data){
	var hml="";
	for (var i = 0; i < data.length; i++) {
		var hm = "";  //操作
		var sta = ""; //状态
		var item =data[i];
		
		if(item.status=="0"){
			sta="待审核";
			hm = "<button class='btn btnyello cancleBtn' dataId='"+item.id+"' dataCode='"+item.plancode+"' >删除</button>"
		}else if(item.status=="9"){
			sta="审核失败";
			hm = "<button class='btn btnblue editBtn' dataId='"+item.id+"' dataCode='"+item.plancode+"'>删除</button>"
		}else if(item.status=="1"){
			sta="审核通过";
		}else if(item.status=="2"){
			sta="已完成";
		}else if(item.status=="3"){
			sta="已关闭";
		}
		
		hml +="<tr>"+
				"<td ><a class='detailBtn' dataId='"+item.id+"'  target='_blank'>"+(item.plancode||"")+"</a></td>"+
				"<td title='"+item.startcity+"—>"+item.endcity+"'>"+item.startcity+"—>"+item.endcity+"</td>"+
				"<td >"+item.cargoname+" </td>"+
				"<td >"+(item.totalplanned||"0")+item.measure+"</td>"+
				"<td >"+(item.completed||"0")+item.measure+"</td>"+
				"<td >"+sta+"</td>"+
				"<td >"+new Date(item.createtime).format("yyyy-MM-dd hh:mm:ss")+" </td>"+
				"<td class='planbtn'>"+hm+"</td>" +
			 "</tr>";
	}
	$("#planlist").empty().append(hml);
};