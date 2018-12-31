<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新亚商城</title>
</head>
<body>
	<a href="/ssm01/insertuser.action">注册</a>
	<table border="1">
		<tr>
			<th>userName</th>
			<th>password</th>
			<th>phone</th>
			<th>email</th>
			<th>createTime</th>
			<th>updateTime</th>
			<th>option</th>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>${list.userName}</td>
				<td>${list.password}</td>
				<td>${list.phone}</td>
				<td>${list.email}</td>
				<td>${list.createTime }</td>
				<td>${list.updateTime }</td>
				<td>
					<a href="/ssm01/updateUserIntoPage.action?id=${list.id}">更新</a>	
					<a href="/ssm01/deleteTheUser.action?id=${list.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<%-- <form name="f1" method="POST" action="index.jsp" onSubmit="return checknum()">
            <table border="0" align="center" >
                <tr>
                    <td>第<%=pages%>页 共<%=totalpages%>页 <a href="index.jsp?pages=1">首页</a></td>
                    <td><a href="index.jsp?pages=<%=(pages<1)?pages:(pages-1) %>"> 上一页</a></td>
                    <td><a href="index.jsp?pages=<%=(pages>=totalpages)?totalpages:(pages+1)%>"> 下一页</a></td>
                    <td><a href="index.jsp?pages=<%=totalpages%>">最后一页</a></td>
                    <td>转到第:<input type="text" name="page" size="8">页<input type="submit" value="GO" name="cndok"></td>
                </tr>
            </table> 
  </form> --%>
	
</body>
</html>