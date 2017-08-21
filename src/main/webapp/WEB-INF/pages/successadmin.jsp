<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body{
            background-color: bisque;
        }
    </style>
</head>
<script>
    function  toinfo() {
        window.location.href="mana_info.do"
    }
</script>
<body >
     <shiro:hasAnyRoles name="admin">
         <shiro:principal/>拥有角色admin
     </shiro:hasAnyRoles>
     <button type="button" class="btn btn-info" onclick="toinfo()">查看管理员信息</button>
     <input type="hidden" value="${sessionScope.get("user")}" name="user">
</body>
</html>