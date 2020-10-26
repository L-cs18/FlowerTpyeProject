<%--
  Created by IntelliJ IDEA.
  User: Alone
  Date: 2020/5/26
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script>
        function btn() {
            document.getElementById("find").submit();
        }
    </script>
</head>
<body>
<h1>花卉销售管理平台</h1>
<%--更新1--%>
<form:form action="/flowerController/index1" method="post" modelAttribute="list">
    <span>请选择花卉分类：</span>
    <select name="typename">
        <option value="0">--请选择--</option>
        <option value="1">兰花类</option>
        <option value="2">菊花类</option>
        <option value="3">荷花类</option>
    </select>
    <button id="find" onclick="btn()">搜索花卉信息</button>
    <a href="/flowerController/toAdd">添加一个新花卉品种</a>
    <table border="1px">
        <tr style="background: gray">
            <td width="5%" align="center">花卉编号</td>
            <td width="15%" align="center">花卉分类</td>
            <td width="15%" align="center">花卉名称</td>
            <td width="15%" align="center">管理人</td>
            <td width="18%" align="center">销售金额</td>
            <td width="18%" align="center">进货日期</td>
        </tr>
        <c:forEach var="flower" items="${list}">
            <tr>
                <td width="5%" align="center" >${flower.flowered}</td>
                <c:if test="${flower.typename==1 }">
                    <td width="15%" align="center">兰花类</td>
                </c:if>
                <c:if test="${flower.typename==2}">
                    <td width="15%" align="center">菊花类</th>
                </c:if>
                <c:if test="${flower.typename==3}">
                    <td width="15%" align="center">荷花类</td>
                </c:if>
                <td width="15%" align="center">${flower.flowerName}</td>
                <td width="15%" align="center">${flower.manager}</td>
                <td width="18%" align="center">${flower.price}</td>
                <td width="18%" align="center">${flower.instore}</td>
            </tr>
        </c:forEach>
    </table>
</form:form>
</body>
</html>
