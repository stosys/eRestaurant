<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Admin Menu View</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<!-- AFISARE MENU  --- LOAD MENU -->

<div class="container">
  <nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                data-target="#bs-example-navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#"> Menu <span class="sr-only">(current)</span></a>
      </div>
    </div>
  </nav>
</div>

<div class="row">
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
      <img src="pizza-nova.jpg" alt="Pizza">
      <div class="caption">
        <h3></h3>
        <p>Pizzas...  .</p>
        <p><a href="#" class="btn btn-primary" role="button">View</a> <!--a href="#" class="btn btn-default" role="button">View</a--></p>
      </div>
    </div>
  </div>
</div>


<div class="row">
  <div class="col-sm-6 col-md-4">
    <div class = "thumbnail">
     <img src="appet.jpg" alt="Appetizers">
      <div class="caption">
        <h3></h3>
        <p>Appetizers...  .</p>
        <p><a href="#" class="btn btn-primary" role="button">View</a> <!--a href="#" class="btn btn-default" role="button">View</a--></p>
      </div>
    </div>
  </div>
</div>

<div class="row">
  <div class="col-sm-6 col-md-4">
    <div class = "thumbnail">
      <img src="soup.jpg" alt="Soup">
      <div class="caption">
        <h3></h3>
        <p>Soups...  .</p>
        <p><a href="#" class="btn btn-primary" role="button">View</a> <!--a href="#" class="btn btn-default" role="button">View</a--></p>
      </div>
    </div>
  </div>
</div>
</body>
</html>
