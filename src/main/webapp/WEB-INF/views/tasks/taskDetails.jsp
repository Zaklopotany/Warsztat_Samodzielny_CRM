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
			<div  class="center2">
				<b>Task name: </b> <a>${task.getSubject()}</a><br>
				<b>Created: </b><a>${task.getCreated().toString().substring(0,19)}</a><br>
				<b>Project name: </b><a>${task.getProjects().getName()}</a>
				<hr>
				<b>Description: </b><br>
				<a>${task.getDescription()}</a>
				<hr>
				<b>Priority: </b><a>${task.getTaskPriority().getName()}</a><br>  
				<b>Status: </b><a>${task.getTaskStatus().getName()}</a><br>
				<b>Assigned user: </b><a href="">${task.getUsers().getLogin()}</a>
				<hr>
				<div>
					<a href="<c:url value="/project/showProjectDetails/${task.getProjects().getId()}"/>" class="w3-btn w3-blue w3-border w3-round-large">Show Project</a>
					<a class="w3-btn w3-green w3-border w3-round-large">Edit Task</a>
				</div>
				<hr class="style1">
			</div>
		</jsp:body>
	</t:mainLayout>
</body>
</html>