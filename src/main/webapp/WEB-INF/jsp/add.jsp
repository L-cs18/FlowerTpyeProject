<%--
  Created by IntelliJ IDEA.
  User: Alone
  Date: 2020/5/26
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <script>
        function btn() {
            document.getElementById("btn").submit();
        }
    </script>
</head>
<body>
<h1>花卉信息保存</h1>
<table border="1px" cellpadding="1" cellspacing="0" >
    <form:form  action="/flowerController/doAdd" method="post" modelAttribute="flower" id="formId">
        <tr align="center">
            <td>花卉分类：</td>
            <td>
                <form:radiobutton value="1" path="typename"></form:radiobutton>兰花类
                <form:radiobutton value="2" path="typename"></form:radiobutton>菊花类
                <form:radiobutton value="3" path="typename"></form:radiobutton>荷花类
            </td>
        </tr>
        <tr align="center">
            <td>
                花卉名称：
            </td>
            <td>
                <form:input path="flowerName"></form:input>
            </td>
        </tr>
        <tr align="center">
            <td>
                管理人：
            </td>
            <td>
                    <form:input path="manager"></form:input>
        </tr>
        <tr align="center">
            <td>
                销售价格：
            </td>
            <td>
                <form:input path="price"></form:input>
            </td>
        </tr>
        <tr align="center">
            <td>
                进货日期：
            </td>
            <td>
                <form:input path="instore"></form:input>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2" align="center">
                <button id="btn" onclick="btn()" style="background: gray">保存信息</button>
            </td>
        </tr>
    </form:form>
</table>
</body>
</html>
