<%@ page import="de.hbrs.team89.se1_starter_repo.models.Kunde" %>
<%@ page import="de.hbrs.team89.se1_starter_repo.Controller.KundenController" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <title>Customer</title>
    <script src="https://cdn.plot.ly/plotly-2.11.1.min.js"></script>
    <link href="config.css" rel="stylesheet" type="text/css">
</head>

<body>
<%String kundename = request.getParameter("name");
    KundenController kundenController = new KundenController();
    kundenController.newKunde("name","bank");
    kundenController.newKunde("name2","bank2");
    Kunde kunde = kundenController.findKunde("name");
%>
<div class="box center grey-background">
    <h1>Customer</h1>
    <h2>Name: </h2><%=kunde.getName() %>
</div>

<div class="py-4">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <a class="text-secondary" href="/logout"><span class="oi oi-account-logout"></span></a>
                <hr />
                <h2>Car-List</h2>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <ul class="list-group checked-list-box">
                           <%= kunde.getNumberPlates()%>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-12">
            <h2>Invoice-List</h2>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <ul class="list-group checked-list-box">
                        <%=kunde.getRechnung()%>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>