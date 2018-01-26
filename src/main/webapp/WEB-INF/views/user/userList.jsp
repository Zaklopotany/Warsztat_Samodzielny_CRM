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
			<c:forEach items="${userList}" var="pr" >
				<div  class="center2">
					<div class="text-center"><b>${pr.getName()}  ${pr.getSurname()}</b> </div>
					<hr>
					<b>Login: </b><a>${pr.getLogin()}</a>
					<hr>
					<div>
						<a href="<c:url value="/user/userDetails/${pr.getId()}"/>" class="w3-btn w3-blue w3-border w3-round-large">Show Details</a>
						<a  class="w3-btn w3-blue w3-border w3-round-large">Show Projects</a>
						<a href="<c:url value="/task/showUserTasks/${pr.getId()}"/>" class="w3-btn w3-blue w3-border w3-round-large">Show Tasks</a>
						<a class="w3-btn w3-green w3-border w3-round-large">Edit User</a>
					</div>
					<hr class="style1">
				</div>
			</c:forEach>
			
		</jsp:body>
	</t:mainLayout>
</body>
</html>