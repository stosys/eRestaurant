<%--
  Created by IntelliJ IDEA.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
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
        <a class="navbar-brand" href="/">Home <span class="sr-only">(current)</span></a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active"><a href="/menucr">Menu <span class="sr-only">(current)</span></a></li>
          <li><a href="">Rezervari</a></li>
        </ul>
        <form margin-right class="navbar-form navbar-left" role="search">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#">Locatie</a></li>
        </ul>
      <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
      </div>
  <div class="body">
      <form role="form" method="post" action="/index">
          <div class="form-group">
              <input type="text" class="form-control" number="phoneNumber1" placeholder="Phone Number">
          </div>

          <button type="submit" class="btn btn-default">Submit</button>


      <!--img src="download.jpg"-->

  <div class="row">
    <div class="col-xs-6 col-md-3">
      <a href="#" class="thumbnail">
        <img src= download.jpg alt= "Interior">
      </a>
    </div>
  </div>
      </form>
  </div>
  </nav>
  </div>
</body>
</html>

