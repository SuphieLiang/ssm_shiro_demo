<%--
  Created by IntelliJ IDEA.
  User: gp
  Date: 2017/8/22
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE HTML><html lang="UTF-8"><head><script language="javascript" type="text/javascript" src="http://res.360kad.com/script/envconfig.js"></script>
<script language="javascript" type="text/javascript" async="async" src="http://ctr.360kad.com/ctrjs/ctr_v2.js"></script>
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--布局:www_yjjc--><meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<title>康爱多网上药店</title>
<meta name="robots" content="nofollow" />
<link href="http://res4.360kad.com/theme/default/css/www/web2014/baseM3.css" rel="stylesheet" type="text/css"/>
<link href="http://res2.360kad.com/theme/default/css/www/web2014/headFooter.css" rel="stylesheet" type="text/css"/>
<link href="http://res3.360kad.com/theme/default/css/www/web2014/Yprolist.css?11" rel="stylesheet" type="text/css"/>
<script src="http://res.360kad.com/script/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="http://res2.360kad.com/script/jquery.jqzoom.js" type="text/javascript"></script>
<script src="http://res4.360kad.com/script/jquery.lazyload.min.js" type="text/javascript"></script>
<script src="http://res4.360kad.com/script/web2014/publicsearch.js" type="text/javascript"></script>
<script src="http://res.360kad.com/script/jquery.cookie.js" type="text/javascript"></script>
<script src="http://res1.360kad.com/script/web2014/newCommonJs2.js" type="text/javascript"></script>
<script src="http://res.360kad.com/script/web2014/rightFixedBar3.js" type="text/javascript"></script>
<script src="http://res1.360kad.com/script/web2014/Yprolist.js" type="text/javascript"></script>
<script src="http://res.360kad.com/script/web2014/parabola.js" type="text/javascript"></script>
<script src="http://res2.360kad.com/script/Recomm2.js" type="text/javascript"></script>
<script src="http://res2.360kad.com/script/uaredirect2.js" type="text/javascript"></script>
</head>
<body>

<table>
    <c:forEach items="${sessionScope.get(lists)}" var="item">
        <tr >
            <td class="center"><span class="center">${item.title}</span></td>
            <td>${item.sell_point}</td>
            <td>${item.price}</td>
            <td>${item.num}</td>
            <td>${item.barcode}</td>
            <td>${item.status}</td>
            <td>${item.image}</td>
            <td>${item.created}</td>
            <td>${item.updated}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
