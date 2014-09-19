<%-- 
    Document   : Header
    Created on : Aug 20, 2014, 2:52:43 PM
    Author     : nuttanan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<link href="css/bootstrap.min.css" rel="stylesheet">

<link href="css/sb-admin.css" rel="stylesheet">

<link href="css/plugins/morris.css" rel="stylesheet">

<link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation" style=" background-color: #D2F5FB;">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="Home.jsp">Classroom Attendance</a>
    </div>
    <!-- Top Menu Items -->
    <ul class="nav nav-tabs" role="tablist">
        <li >
            <a href="Home.jsp"><h5 style="color: black"> Home</h5></a>

        </li>
        <li>
            <a href="ClassAdDay.jsp"></i><h5 style="color: black">Class Attendance </h5></a>
        </li>

        <li>
            <a href="ShowAllStServlet"></i><h5 style="color: black">Student Information </h5></a>
        </li>
        <li>
            <a href="Subject.jsp"></i><h5 style="color: black">Classroom Attendance Student</h5></a>
        </li>
        <ul class="nav navbar-right top-nav">


 
            <i class="fa fa-user"></i>${TUsername.TUsername}
            
           
            <a href="Logout"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
            
        </ul>
    </ul>

    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>
