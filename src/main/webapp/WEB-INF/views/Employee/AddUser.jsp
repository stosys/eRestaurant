<%--
  Created by IntelliJ IDEA.
  --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Employee AddUser</title>
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
        <a class="navbar-brand" href="#">Add To Menu <span class="sr-only">(current)</span></a>
      </div>
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Add <span class="sr-only">(current)</span></a></li>
        <li><a href="viewadmcr">View</a></li>
      </ul>
    </div>
  </nav>
</div>

  <div class="body">
    <form role="form" method="post" action="/userc" >
      <!--div class="form-group">
        <label>ID</label>
        <input type="id" class="form-control" id="ID" placeholder="Enter ID">
      </div-->
      <div class="form-group">
        <label>Tip</label>
        <input type="number" class="form-control" id="tip" placeholder="Enter Type">
      </div>
      <div class="form-group">
        <label>NrTelefon</label>
        <input type="text" class="form-control" id="nrtelefon" placeholder="Enter Phone Number">
      </div>
      <div class="form-group">
        <label>Email</label>
        <input type="email" class="form-control" id="email" placeholder="Enter Email">
      </div>

      <button type="submit" class="btn btn-default">Submit</button>
    </form>
  </div>
</body>
</html>
