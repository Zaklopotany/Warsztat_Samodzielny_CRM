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
	<c:url value="/project/add" var="link"/>
	
	<t:mainLayout>
		<jsp:body>
			<f:form modelAttribute="project" method="post" action = "${link}">
				<f:input path=""/>
				<f:input path=""/>
				<f:input path=""/>
				<f:input path=""/>
				<f:input path=""/>
				
			</f:form>
		</jsp:body>
	</t:mainLayout>
</body>
</html>