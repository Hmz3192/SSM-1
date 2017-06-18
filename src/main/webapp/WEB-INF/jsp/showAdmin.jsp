<%--
  Created by IntelliJ IDEA.
  User: ThinKPad
  Date: 2017/6/17
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>管理界面</title>
</head>
<body>

<c:if test="${!empty adminList}">
<table border="1px">
    <tr>
        <td>ID</td>
        <td>账户</td>
        <td>密码</td>
    </tr>
    <c:forEach var="admin" items="${adminList}">
        <tr>
            <td>${admin.id}</td>
            <td>${admin.username}</td>
            <td>${admin.password}</td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="3">
            <!-- 分页功能 start -->
            <div align="center">
                <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第
                    ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=1">首页</a>
                <c:choose>
                    <c:when test="${page.pageNow - 1 > 0}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.pageNow - 1}">上一页</a>
                    </c:when>
                    <c:when test="${page.pageNow - 1 <= 0}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=1">上一页</a>
                    </c:when>
                </c:choose>
                <c:choose>
                    <c:when test="${page.totalPageCount==0}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.pageNow}">下一页</a>
                    </c:when>
                    <c:when test="${page.pageNow + 1 < page.totalPageCount}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.pageNow + 1}">下一页</a>
                    </c:when>
                    <c:when test="${page.pageNow + 1 >= page.totalPageCount}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.totalPageCount}">下一页</a>
                    </c:when>
                </c:choose>
                <c:choose>
                    <c:when test="${page.totalPageCount==0}">
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.pageNow}">尾页</a>
                    </c:when>
                    <c:otherwise>
                        <a href="${pageContext.request.contextPath}/user/showAdmin?pageNow=${page.totalPageCount}">尾页</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </td>

    </tr>
</table>

</c:if>
</body>
</html>
