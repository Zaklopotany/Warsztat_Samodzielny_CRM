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
				<c:forEach items="${taskList}" var="pr" >
				<div  class="center2">
					<b>Task name: </b> <a>${pr.getSubject()}</a><br>
					<b>Created: </b><a>${pr.getCreated().toString().substring(0,19)}</a><br>
					<b>Project name: </b> <a>${pr.getProjects().getName() }</a>
					<b>User login: </b> <a>${pr.getUsers().getLogin() }</a>
					<hr>
					<a>Priority: ${pr.getTaskPriority().getName()}</a><br>  
					<a>Status: ${pr.getTaskStatus().getName()}</a>
					<div>
						<a href="<c:url value="task/showTaskDetails/${pr.getId()}"/>" class="w3-btn w3-blue w3-border w3-round-large">Show Task Details</a>
						<a href="<c:url value=""/>" class="w3-btn w3-blue w3-border w3-round-large">Show Project</a>
						<a class="w3-btn w3-green w3-border w3-round-large">Edit Task</a>
					</div>
					<hr class="style1">
					</div>
				</c:forEach>
		</jsp:body>
	</t:mainLayout>
</body>
</html>