function displayData(pageNo){
	init(pageNo);
}
function reset(){
	$("#billType").val("");
	$("#planNo").val("");
	$("#billNo").val("");
	$("#cargoName").val("");
	$("#vehicleNo").val("");
	$("#routeName").val("");
	$("#billStatus").val("");
	$("#driverName").val("");
	$("#payMent").val("");
	$("#sendMan").val("");
	$("#sendPersion").val("");
	$("#receiptMan").val("");
	$("#receiptPersion").val("");
	$("#businessTimeStart").val("");
	$("#businessTimeEnd").val("");
	$("#billCreaterTimeStart").val("");
	$("#billCreaterTimeEnd").val("");
	$("#acceptTimeStart").val("");
	$("#acceptTimeEnd").val("");
	$("#pickupTimeStart").val("");
	$("#pickupTimeEnd").val("");
	$("#unloadTimeStart").val("");
	$("#unloadTimeEndtime").val("");
	$("#signTimeStart").val("");
	$("#signTimeEnd").val("");
	init(0);
}
function getParams(pageNo){
	var billType =$("#billType").val();
	var planNo =$("#planNo").val();
	var billNo =$("#billNo").val();
	var cargoName =$("#cargoName").val();
	var vehicleNo =$("#vehicleNo").val();
	var routeName =$("#routeName").val();
	var billStatus =$("#billStatus").val();
	var driverName =$("#driverName").val();
	var payMent =$("#payMent").val();
	var sendMan =$("#sendMan").val();
	var sendPersion =$("#sendPersion").val();
	var receiptMan =$("#receiptMan").val();
	var receiptPersion =$("#receiptPersion").val();
	
	var businessTimeStart =$("#businessTimeStart").val();
	var businessTimeEnd =$("#businessTimeEnd").val();
	var billCreaterTimeStart =$("#billCreaterTimeStart").val();
	var billCreaterTimeEnd =$("#billCreaterTimeEnd").val();
	var acceptTimeStart =$("#acceptTimeStart").val();
	var acceptTimeEnd =$("#acceptTimeEnd").val();
	var pickupTimeStart =$("#pickupTimeStart").val();
	var pickupTimeEnd =$("#pickupTimeEnd").val();
	var unloadTimeStart =$("#unloadTimeStart").val();
	var unloadTimeEndtime =$("#unloadTimeEndtime").val();
	var signTimeStart =$("#signTimeStart").val();
	var signTimeEnd =$("#signTimeEnd").val();
	
	var params = {
			billType:$.trim(billType),
			planNo:$.trim(planNo),
			billNo:$.trim(billNo),
			cargoName:$.trim(cargoName),
			vehicleNo:$.trim(vehicleNo),
			routeName:$.trim(routeName),
			billStatus:$.trim(billStatus),
			driverName:$.trim(driverName),
			payMent:$.trim(payMent),
			sendMan:$.trim(sendMan),
			sendPersion:$.trim(sendPersion),
			receiptMan:$.trim(receiptMan),
			receiptPersion:$.trim(receiptPersion),
			businessTimeStart:$.trim(businessTimeStart),
			businessTimeEnd:$.trim(businessTimeEnd),
			billCreaterTimeStart:$.trim(billCreaterTimeStart),
			billCreaterTimeEnd:$.trim(billCreaterTimeEnd),
			acceptTimeStart:$.trim(acceptTimeStart),
			acceptTimeEnd:$.trim(acceptTimeEnd),
			pickupTimeStart:$.trim(pickupTimeStart),
			pickupTimeEnd:$.trim(pickupTimeEnd),
			unloadTimeStart:$.trim(unloadTimeStart),
			unloadTimeEndtime:$.trim(unloadTimeEndtime),
			signTimeStart:$.trim(signTimeStart),
			signTimeEnd:$.trim(signTimeEnd),
			
			pageNo:pageNo,
			pageSize:10
		};
	return params;
}

function init(pageNo){
	$.ajax({
		url:"/reportAll/bill",
		type:"POST",
		data:getParams(pageNo),
		success:function(ret){
			if(ret.code == '000000'){
				var data = ret.data.list;
				var total = ret.data.total;
				var pageNo = ret.data.pageNo;
				var pageSize = ret.data.pageSize;
				innerHml(data);
				$('#totalRecords').html(total);
				$('#totalPages').attr('maxPageNo',parseInt((total+pageSize-1)/pageSize));
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
}

function innerHml(data){
	$("#innerHtml").empty();
	for (var a = 0; a < data.length; a++) {
		var billType = data[a].billType == undefined ? "":data[a].billType;
		var businessTime = data[a].businessTimeStr == undefined ? "":data[a].businessTimeStr;
		var planNo = data[a].planNo == undefined ? "":data[a].planNo;
		var billNo = data[a].billNo == undefined ? "":data[a].billNo;
		var sendMan = data[a].sendMan == undefined ? "":data[a].sendMan;
		var sendPersion = data[a].sendPersion == undefined ? "":data[a].sendPersion;
		var receiptMan = data[a].receiptMan == undefined ? "":data[a].receiptMan;
		var receiptPersion = data[a].receiptPersion == undefined ? "":data[a].receiptPersion;
		var vehicleNo = data[a].vehicleNo == undefined ? "":data[a].vehicleNo;
		var cargoName = data[a].cargoName == undefined ? "":data[a].cargoName;
		var routeName = data[a].routeName == undefined ? "":data[a].routeName;
		var distinct = data[a].distinct == undefined ? "":data[a].distinct;
		var venderWeight = data[a].venderWeight == undefined ? "":data[a].venderWeight;
		var pickupWeight = data[a].pickupWeight == undefined ? "":data[a].pickupWeight;
		var unloadWeight = data[a].unloadWeight == undefined ? "":data[a].unloadWeight;
		var trueWeight = data[a].trueWeight == undefined ? "":data[a].trueWeight;
		var billStatus = data[a].billStatus == undefined ? "":data[a].billStatus;
		var driverName = data[a].driverName == undefined ? "":data[a].driverName;
		var payMent = data[a].payMent == undefined ? "":data[a].payMent;
		var billCreaterTimeStr = data[a].billCreaterTimeStr == undefined ? "":data[a].billCreaterTimeStr;
		var acceptTimeStr = data[a].acceptTimeStr == undefined ? "":data[a].acceptTimeStr;
		var pickupTimeStr = data[a].pickupTimeStr == undefined ? "":data[a].pickupTimeStr;
		var unloadTimeStr = data[a].unloadTimeStr == undefined ? "":data[a].unloadTimeStr;
		var signTimeStr = data[a].signTimeStr == undefined ? "":data[a].signTimeStr;
		var hml = "<tr>" +
				"<td>"+billType+"</td>" +
				"<td>"+businessTime+"</td>" +
				"<td>"+planNo+"</td>" +
				"<td>"+billNo+"</td>" +
				"<td>"+sendMan+"</td>" +
				"<td>"+sendPersion+"</td>" +
				"<td>"+receiptMan+"</td>" +
				"<td>"+receiptPersion+"</td>" +
				"<td>"+vehicleNo+"</td>" +
				"<td>"+cargoName+"</td>" +
				"<td>"+routeName+"</td>" +
				"<td>"+distinct+"</td>" +
				"<td>"+venderWeight+"</td>" +
				"<td>"+pickupWeight+"</td>" +
				"<td>"+unloadWeight+"</td>" +
				"<td>"+trueWeight+"</td>" +
				"<td>"+billStatus+"</td>" +
				"<td>"+driverName+"</td>" +
				"<td>"+payMent+"</td>" +
				"<td>"+billCreaterTimeStr+"</td>" +
				"<td>"+acceptTimeStr+"</td>" +
				"<td>"+pickupTimeStr+"</td>" +
				"<td>"+unloadTimeStr+"</td>" +
				"<td>"+signTimeStr+"</td>" +
				"</tr>";
		$("#innerHtml").append(hml);
	}
}

$('.printReport').off('click').on('click',function(){
	$('#planReport').jqprint();
});
$('.exportReport').off('click').on('click',function(){
	$.ajax({
		url : '/reportAll/bill',
		data : getParams(),
		type : 'post',
		success : function(result) {
			if(result.code == '000000'){
				alert(result.data.total);
				if(result.data.total == 0){
					alert("没有要导出的数据！");
				}else if(result.data.total > 2000){
					alert("数据超过2000条，请联系管理员导出！");
				}else{
					var path = '/reportAll/billReport?'+$.param(getParams(1));
					$('<form method="post" action="' + path + '"></form>').appendTo('body').submit().remove();
				}
			}
		}
	});
});