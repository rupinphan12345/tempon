<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
		<form:form action="saveSanPham" modelAttribute="sanPham" method="POST">
			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>Ten San Pham: </label> </td>
						<td><form:input path="tenSanPham"/></td>
					</tr>
					<tr>
						<td> <label>Don Gia: </label> </td>
						<td><form:input path="donGia"/></td>
					</tr>
					<tr>
						<td></td>
						<td> <input type="submit" value="Save" /> </td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>