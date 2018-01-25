
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
			<c:forEach items="${projectList}" var="pr" >
					<div  class="center2">
						<b>Project name: </b> <a>${pr.getName()}</a><br>
						<b>Id: </b><a>${pr.getIdentifier()}</a><br>
						<b>Created: </b><a>${pr.getCreated().toString().substring(0,19)}</a><br>
						<hr>
						<div>
							<a class="w3-btn w3-blue w3-border w3-round-large">Show Details</a>
							<a class="w3-btn w3-blue w3-border w3-round-large">Show Users</a>
							<a class="w3-btn w3-blue w3-border w3-round-large">Show Tasks</a>
							<a class="w3-btn w3-green w3-border w3-round-large">Edit Project</a>
						</div>
						<hr class="style1">
					</div>
	

				</c:forEach>
					
		</jsp:body>
	</t:mainLayout>
</body>
</html>