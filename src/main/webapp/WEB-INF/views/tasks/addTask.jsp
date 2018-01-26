<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<t:mainLayout>
		<jsp:body>
			<f:form method="post" modelAttribute="task">
				<b>Subject: </b><f:input path="subject"/>
				<p>Description:</p><f:textarea path="description"/>
				<p>Select project: </p>
				<f:select path="projects.id" items="${projectList}" multiply="false" itemLabel="name" itemValue="id"/>
				<p>Select Status: </p>
				<f:select path="taskStatus.id" items="${statusList}" multiply="false" itemLabel="name" itemValue="id"/>
				<p>Select priority: </p>
				<f:select path="taskPriority.id" items="${priorityList}" multiply="false" itemLabel="name" itemValue="id"/>
				<br>
				<input type="submit" value="Create"/>
				<f:errors path="*"/>
			</f:form>
		</jsp:body>
	</t:mainLayout>
</body>
</html>