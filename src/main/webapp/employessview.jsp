<%@ page import="de.hbrs.team89.se1_starter_repo.models.Mitarbeiter" %>
<%@ page import="de.hbrs.team89.se1_starter_repo.Controller.MitarbeiterController" %>
<%@ page import="de.hbrs.team89.se1_starter_repo.Controller.KundenController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">
    <meta name="author" content="Team89 (C) 2021">
    <meta name="description" content="Software Engineering 1 (SE1)">
    <meta name="license" content="The MIT License (MIT)">
    <meta name="theme-color" content="#239BD1"/>
    <meta property="og:title" content="Software Engineering 1 Project(SE1)">
    <meta property="og:description" content="Bachelor Course Software Engineering 1 (SE1), Hochschule Bonn-Rhein-Sieg.">
    <link rel="shortcut icon" href="https://kaul.inf.h-brs.de/favicon.ico" />
    <title>Employee</title>
    <script src="https://cdn.plot.ly/plotly-2.11.1.min.js"></script>
    <link href="config.css" rel="stylesheet" type="text/css">
</head>

<body>
<%String mitarbeitername = request.getParameter("name");
    Mitarbeiter mitarbeiter = MitarbeiterController.findMitarbeiter(mitarbeitername);
    assert mitarbeiter != null;
%>
<div class="box center grey-background">
    <h1>Employee</h1>
    <h2>Name: </h2><%=mitarbeiter.getName() %>
</div>
<div class="py-4">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h2>Customer-List</h2>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <ul class="list-group checked-list-box">
                            <%= KundenController.getAllNames()%>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
