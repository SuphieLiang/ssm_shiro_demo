<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        function  toinfo() {
            window.location.href="mana_info.do"
        }
    </script>
    <style>
        body{
            background-color: aqua;
        }
    </style>
</head>

<body>
     <shiro:hasAnyRoles name="customer">
         <shiro:principal/>拥有角色customer
     </shiro:hasAnyRoles>
     <button type="button" class="btn btn-info" onclick="toinfo()">查看管理员信息</button>

</body>
</html>