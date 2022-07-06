<%@ page import="de.hbrs.team89.se1_starter_repo.Controller.KundenController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="de" xml:lang="de">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">
    <title>Menü</title>
</head>
<body>
<h1><%= "Parkhaus Menü" %></h1>
<form name="kundenview" action="customerview.jsp">
    <%request.setAttribute("names", KundenController.getAllNames()); %>
    <label>
        <select name="Kunde">
            <c:forEach var="name" items="${names}">
            <option><c:out value="${name}"/></option>
            </c:forEach>
        </select>
                <br/><br/>
                <input type="submit" value="Submit" />
    </label>
</form>
<div class="box lightblue">
    <h2><a href="employessview.jsp">Mitarbeitermenü</a></h2>
</div>
<div class="box lightblue">
    <h2><a href="managerview.jsp">Managermenü</a></h2>
</div>
</body>
</html>