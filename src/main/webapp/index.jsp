  <!DOCTYPE html>
    <!--
    ~ Copyright (c) 2016. MyCape Pte. Ltd. All rights reserved.
    -->
    <html>
    <head>
    <title>Hello, MyCape!</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link rel="stylesheet"
    href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    </head>
    <body role="document" style="padding-top: 70px;">
    <div class="container theme-showcase" role="main">
    <!--
    Output from Endpoints API call.
    -->
    <div class="alert alert-success" style="visibility: collapse;" id="outputAlert"></div>

    <!--
    A form that takes a text value and submits it to the Endpoint,
    access to the Endpoint is enabled once the client is loaded below.
    -->
    <div class="jumbotron">
    <div class="row">
    <div class="col-lg-12">
    <h1>Hello, Auth!</h1>
    </div>
    </div>
    </div>
    </div>
    <script src="https://apis.google.com/js/client.js?onload=init"></script>
    </body>
    </html>
