<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<t:mainLayout>
		<jsp:body>
			<div class="center2">
				<p class="text-center-my"><b>${project.getName()}</b></p>
				<hr>
				<b>Id: </b><a>${project.getIdentifier()}</a><br>
				<b>Created: </b><a>${project.getCreated().toString().substring(0,19)}</a><br>
				<b>Description: </b><br>
				<a style="text-align:justify">${project.getDescription()}</a><br>
				<hr>
				<div style="width: 70%; display: flex; justify-content: space-between">
					<div>
						<a>Number of tasks: ${project.getTasksNumber()}</a>
						<br>
						<a>Users involved: ${project.getUsersNumber()}</a>
					</div>
				</div>
				<div>
					<a><b>Users: </b></a>
					<table style="width:60%">
						<tbody>
							<c:forEach items="${usersList}" var="ul">
								<tr>
									<td>
										<a>Login: ${ul.getLogin()}</a>
									</td>
									<td>								
										<a href='<c:url value='/user/showUserDetails/${ul.getId()}'/>'>More details...</a><br>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<hr>
				<div>
					<a class="w3-btn w3-blue w3-border w3-round-large">Show Users Details</a>
					<a href="<c:url value="/task/showProjectTasks/${project.getId()}"/>" class="w3-btn w3-blue w3-border w3-round-large">Show Tasks</a>
					<a class="w3-btn w3-green w3-border w3-round-large">Edit Project</a>
				</div>
				
			</div>
		</jsp:body>
	</t:mainLayout>
</body>
</html>