<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/19
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>RESTFUL实验室</title>
    <script src="${pageContext.request.contextPath}/resource/js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
            $("#btnGet").click(function () {
                $.ajax({
                    url : "/restful/request",
                    type : "get",
                    dataType : "json",
                    success : function (json) {
                        $("#message").text(json.message);
                    }
                })
            })
        })
        $(function () {
            $("#btnPost").click(function () {
                $.ajax({
                    url : "/restful/request/100",
                    type : "post",
                    data : "name=susu&age=23",
                    dataType : "json",
                    success : function (json) {
                        $("#message").text(json.message+":"+json.id);
                    }
                })
            })
        })
        $(function () {
            $("#btnPut").click(function () {
                $.ajax({
                    url : "/restful/request",
                    type : "put",
                    data : "name=susu&age=20",
                    dataType : "json",
                    success : function (json) {
                        $("#message").text(json.message);
                    }
                })
            })
        })
        $(function () {
            $("#btnDelete").click(function () {
                $.ajax({
                    url : "/restful/request",
                    type : "delete",
                    dataType : "json",
                    success : function (json) {
                        $("#message").text(json.message);
                    }
                })
            })
        })
        $(function () {
            $("#btnPersons").click(function () {
                $.ajax({
                    url : "/restful/persons",
                    type : "get",
                    dataType : "json",
                    success : function (json) {
                        console.info(json);
                        for (var i = 0; i < json.length; i++){
                            var p = json[i];
                            $("#divPersons").append("<h2>"+p.name+"-"+p.age+"</h2>");
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
    <input type="button" id="btnGet" value="发送Get请求">
    <input type="button" id="btnPost" value="发送Post请求">
    <input type="button" id="btnPut" value="发送Put请求">
    <input type="button" id="btnDelete" value="发送Delete请求">
    <h1 id="message"></h1>

    <input type="button" id="btnPersons" value="查询所有人员">
    <div id="divPersons"></div>
</body>
</html>
