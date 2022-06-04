<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<input type="button" value="Them lop hoc" onclick="window.location.href='formLopHoc';return false;" />
		<table>
			<tr>
				<th>id</th>
				<th>ten Lop Hoc</th>
				<th>day Nha</th>
				<th>buoi Hoc</th>	
			</tr>
			<c:forEach var="lopHoc" items="${dsLopHoc}">
				<c:url var="deleteLink" value="/danhSachLopHoc/delete">
					<c:param name="maLopHoc" value="${lopHoc.id}"></c:param>
				</c:url>
				<c:url var="updateLink" value="/showFormUpdate">
					<c:param name="maLopHoc" value="${lopHoc.id}"></c:param>
				</c:url>
				<tr>
					<td>${lopHoc.id}</td>
					<td>${lopHoc.tenLopHoc}</td>
					<td>${lopHoc.dayNha}</td>
					<td>${lopHoc.buoiHoc}</td>
					<td>
						<a href="${deleteLink}">Delete</a>
					</td>
					<td>
						<a href="${updateLink}">Update</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>