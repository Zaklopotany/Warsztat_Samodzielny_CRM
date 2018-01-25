<%@ tag description="main layout" language="java" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>
<%@attribute name="menu" fragment="true"%>
<%@ attribute name="submenu" fragment="true"%>
<%@ attribute name="option" fragment="true"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/bootstrap.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/style.css"/>"
	rel="stylesheet" type="text/css">	
	<link rel="stylesheet"  href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<div id="pageheader" class="jumbotron text-center">
		<h1>Bom bom - super szybka aplikacja</h1>
		<jsp:invoke fragment="header" />
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-2 text-center">
				<h3>Menu</h3>
					<a href="<c:url value="/project/showProjectList"/>">Project list</a><br>
					<a href="<c:url value="/project/add"/>">New Project</a><br>
					<a href="<c:url value="/user/showUserList"/>">User list</a><br>
					<a href="<c:url value="/user/add"/>">New user</a><br>
					<a href="<c:url value="/status/showStatusList"/>">Status list</a><br>
					<a href="<c:url value="/status/add"/>">New status</a><br>
					<a href="<c:url value="/priority/showPriorityList"/>">Priority List</a><br>
					<a href="<c:url value="/priority/add"/>">New priority</a><br>
				<jsp:invoke fragment="menu" />
				<jsp:invoke fragment="submenu" />
			</div>
			<div class="col-sm-7">
				<jsp:doBody />
			</div>
			<div class="col-sm-3">
				<jsp:invoke fragment="option"/>
			</div>
		</div>
	</div>
	<jsp:invoke fragment="footer" />
</body>
</html>