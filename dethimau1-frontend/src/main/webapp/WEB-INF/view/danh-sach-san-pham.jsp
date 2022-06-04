<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="container">
	<input type="button" value="ADD Product" onclick="window.location.href='formSanPham'; return false;" />
	<table>
		<tr>
			<th>id</th>
			<th>ten san pham</th>
			<th>don gia</th>
			<th>loai san pham</th>
		</tr>
		<c:forEach var="sanPham" items="${danhSachSanpham}">
			<c:url var="deleteLink" value="/danhSachSanPham/delete">
				<c:param name="maSanPham" value="${sanPham.id }"></c:param>
			</c:url>
			<c:url var="updateLink" value="/showFromUpdate">
				<c:param name="maSanPham" value="${sanPham.id }"></c:param>
			</c:url>
			<tr>
				<td>${sanPham.id}</td>
				<td>${sanPham.tenSanPham}</td>
				<td>${sanPham.donGia}</td>
				<td>${sanPham.loaiSanPham.tenLoaiSanPham}</td>
				<td>
					<a href="${updateLink}">Update</a>
				</td>
				<td>
					<a href="${deleteLink}">Delete</a>
				</td>
			</tr>
			
		</c:forEach>
	</table>
</div>

</body>
</html>