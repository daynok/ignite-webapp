<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Main page</title>
</head>
<body>
    <div>
    <p>
    Example to set attribute:
    <em>
    localhost:8080/ignite-webapp/setAttribute/foo1/bar.htm
    </em>
    </p>
    
    <p>
    Example to remove attribute:
    <em>
    localhost:8080/ignite-webapp/removeAttribute/foo1.htm
    </em>
    </p>
    
    <c:if test="${not empty items}">
   	<p>Dump of session attributes</p>
   	<ul>
    <c:forEach var="listVar" items="${items}"> 
    <li><c:out value="${listVar}"/></li>
	</c:forEach> 	
   	</ul>
   	</c:if>
   	<c:if test="${empty items}">
   	<p>Session Id: ${id}: No session attributes</p>
   	</c:if>
   </div>
</body>
</html>
