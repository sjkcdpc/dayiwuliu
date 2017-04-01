<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <title>车辆档案</title>
    <link href="${trRoot }/weixin/css/base.css" rel='stylesheet' type='text/css'/>
    <link href="${trRoot }/weixin/css/style.css" rel='stylesheet' type='text/css'/>
    <link href="${trRoot }/weixin/css/layer.css" rel='stylesheet' type='text/css'/>
    <link href="${trRoot }/weixin/css/swiper.css" rel='stylesheet' type='text/css'/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div class="car_dangan">
    <div class="carda_line">
        <label>车牌号前缀：</label>
        <span>企业用户</span>
    </div>
    <div class="carda_line">
        <label>车牌号：</label>
        <span>15988888888</span>
    </div>
    <div class="carda_line">
        <label>所有人姓名：</label>
        <span>王大拿</span>
    </div>
    <div class="carda_line">
        <label>联系方式：</label>
        <span>1545212111</span>
    </div>
    <div class="carda_line">
        <label>车主姓名：</label>
        <span>王大拿</span>
    </div>
    <div class="carda_line">
        <label>车主联系方式：</label>
        <span>1545212111</span>
    </div>
    <div class="carda_line">
        <label>车型：</label>
        <span>王大拿</span>
    </div>
    <div class="carda_line">
        <label>载重：</label>
        <span>121</span>
    </div>
    <div class="carda_line">
        <label>长度：</label>
        <span>王大拿</span>
    </div>
    <div class="carda_line">
        <label>认证方式：</label>
        <span>完全认证</span>
    </div>
    <div class="carda_line">
        <label>安联认证：</label>
        <span>完全认证</span>
    </div>
    <div class="carda_line">
        <label>认证状态：</label>
        <span>认证中</span>
    </div>
    <div class="carda_line">
        <label>认证时间：</label>
        <span>2017-01-07 17:13:37</span>
    </div>
    <div class="carda_line">
        <label>车辆登记证：</label>
        <span class="colorblue zhengjian">查看图片</span>
    </div>
    <div class="carda_line">
        <label>营运证号：</label>
        <span>12221</span>
    </div>
    <div class="carda_line">
        <label>营运证件：</label>
        <span class="colorblue zhengjian">查看图片</span>
    </div>
    <div class="carda_line">
        <label>行驶证照片：</label>
        <span class="colorblue zhengjian">查看图片</span>
    </div>
</div>

<div class="fixed_btn">
    <a><button class="pass colorblue">通过</button></a>
    <a><button class="fail colorred">不通过</button></a>
</div>
<script src="${trRoot }/weixin/js/jquery-1.11.1.js"></script>
<script src="${trRoot }/weixin/js/layer.js"></script>
<script src="${trRoot }/weixin/js/swiper.jquery.js"></script>
<script>
    //通过按钮
    $(".pass").on("click", function () {
        layer.open({
            content: '您确定要通过审核吗？'
            ,btn: ['取消', '确认']
            ,no: function(index){
                window.location.href="car_shenhe.html";//点击确认按钮后的操作
                layer.close(index);
            }
        });
    });
    //不通过按钮
    $(".fail").on("click", function () {
        layer.open({
            title: [
                '请输入审核不通过原因'
            ],
            content: '<div class="shenhe_alt"><textarea  rows="10"></textarea></div>'
            ,btn: ['取消', '确认']
            ,no: function(index){
                window.location.href="car_rz_fail.html";//点击确认按钮后的操作
                layer.close(index);
            }
        });
    });
    //证件图片
    $(".zhengjian").on("click", function () {
        layer.open({
            content: '<div class="imgview"><img src="images/11.jpg"></div>'
        });
    });
</script>

</body>
</html>


