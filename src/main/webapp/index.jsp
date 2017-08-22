<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<span style="font-size:14px;"><link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/base.css"></span>
<html>
<body>
<shiro:guest>
    欢迎游客访问，<a href="${pageContext.request.contextPath}/login.jsp">点击登录</a><br/>
</shiro:guest>
<shiro:user>
    欢迎[<shiro:principal/>]登录，<a href="${pageContext.request.contextPath}/logout">点击退出</a><br/>
</shiro:user>
<a href="/find.do">药品</a>
</body>
</html>
