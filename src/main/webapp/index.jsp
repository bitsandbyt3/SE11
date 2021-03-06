<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="de" xml:lang="de">
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
    <title>Tomcat Parkhaus</title>
    <script src="Controller.js"></script>
    <script src="https://cdn.plot.ly/plotly-2.11.1.min.js"></script>
    <link href="config.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="box center grey-background">
    <h1>Parkhaus Team89</h1>
    <p>Tomcat Version : <%= application.getServerInfo() %></p>
</div>
<div class="box lightblue">
    <h2><a href="kasse.jsp">Kasse</a></h2>
    <h2><a href="managerview.jsp">Manager</a></h2>
    <h2><a href="employessview.jsp">Mitarbeiter</a></h2>
    <h2><a href="customerview.jsp">Kunden</a></h2>
</div>
<div class="box darkblue">
    <h1>Parkhaus Controller</h1>

    <script src="Controller.js"> </script>
</div>

<div class="box lightyellow">
    <h1>Parkhaus Frauenparkplätze</h1>
    <ccm-parkhaus-11-0-0 server_url="./level1-servlet"
                         debug="true"
                         name="Etage1"
                         license_max="15"
                         extra_buttons='["sum","avg","min","max"]'
                         extra_charts='["chart"]'
                         client_categories='["Frau"]'
                         space_color='{"1":"pink"}'
                         vehicle_types='["PKW","SUV"]'
                         price_factor='{"SUV":2,"Family":0.5}'
                         max="11">
    </ccm-parkhaus-11-0-0>
</div>
<div class="box lightgreen">
    <h1>Parkhaus Etage 2</h1>
    <ccm-parkhaus-11-0-0 server_url="./level2-servlet"
                         name="Etage2"
                         license_min="16"
                         license_max="30"
                         extra_buttons='["sum","avg","min","max"]'
                         extra_charts='["chart"]'
                         client_categories='["any","Business"]'
                         space_color='{"1":"yellow","6":"black"}'
                         vehicle_types='["PKW","SUV"]'
                         price_factor='{"SUV":2,"Business":1}'
                         debug="true"
                         SALT="456">
    </ccm-parkhaus-11-0-0>
</div>
</body>
</html>




