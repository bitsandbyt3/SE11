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
<div class="box center grey-background">
    <h1>Employee</h1>
    <span class="oi oi-person"></span>&nbsp;{{.Username}}
</div>
<div class="py-4">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <a class="text-secondary" href="/logout"><span class="oi oi-account-logout"></span></a>
                <span class="oi oi-person"></span>&nbsp;{{.Username}}
                <hr />
                <h2>Customer-List</h2>
                <div class="py-4">
                    <div class="container">
                        <div class="row">
                            <div class="col-12">
                                <form class="form-inline justify-content-center" action="/add-customer" method="POST">
                                    <div class="input-group">
                                        <input type="text" class="form-control form-control-lg" name="action" placeholder="Customer">
                                        <div class="input-group-append">
                                            <button class="btn btn-secondary btn-lg" type="submit">Add</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <ul class="list-group checked-list-box">
                                {{range .Customers}}
                                <li class="delete">
                                    <a href="/toggle-done?id={{.ID}}"><p>{{.Action}}</p></a>
                                    <a href="/delete-Customer?id={{.ID}}"><span class="oi oi-trash close"></span></a>
                                </li>
                                {{else}}
                                <li>
                                    <a href="/toggle-done?id={{.ID}}"><p>{{.Action}}</p></a>
                                </li>
                                {{end}}
                                {{else}}
                                No Customers...
                                {{end}}
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
