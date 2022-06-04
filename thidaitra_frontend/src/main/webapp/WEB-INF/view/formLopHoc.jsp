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
	<div>
		<form:form action="saveLopHoc" modelAttribute="lopHoc" method="POST">
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>Ten lop hoc: </label>  </td>
						<td><form:input path="tenLopHoc"/></td>
					</tr>
					<tr>
						<td><label>Day nha: </label>  </td>
						<%-- <td><form:input path="dayNha"/></td> --%>
						<td>
							<form:select path="dayNha">
								<form:option value="A">A</form:option>
								<form:option value="B">B</form:option>
								<form:option value="C">C</form:option>
								<form:option value="D">D</form:option>
								<form:option value="E">E</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td><label>Buoi hoc: </label>  </td>
						<%-- <td><form:input path="buoiHoc"/></td> --%>
						<td>
							<form:select path="buoiHoc">
								<form:option value="Sang">Sang</form:option>
								<form:option value="Chieu">Chieu</form:option>
								<form:option value="Toi">toi</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Save" /> </td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>
</body>
</html>