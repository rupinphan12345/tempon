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

<table>
		<tr>
			<th>id</th>
			<th>ten loai san pham</th>
		</tr>
		<c:forEach var="loaiSanPham" items="${danhSachLoaiSanPham}">
			<c:url var="chiTietLoaiSanPham" value= "/danhSachSanPham">
				<c:param name="maLoaiSanPham" value="${loaiSanPham.id }"></c:param>
			</c:url>
		
			<tr>
				<td>${loaiSanPham.id}</td>
				<td>${loaiSanPham.tenLoaiSanPham}</td>
				<td>
					<a href="${chiTietLoaiSanPham}">Chi tiet</a> 
				</td>
			</tr>
			
		</c:forEach>
	</table>

</body>
</html>