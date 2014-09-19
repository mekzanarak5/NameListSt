<%-- 
    Document   : ShowAllStudent
    Created on : Aug 21, 2014, 1:46:43 PM
    Author     : nuttanan
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.ConnectionAgent"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Model.ShowAllStudent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Student Information</title>

        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/sb-admin.css" rel="stylesheet">

        <link href="css/plugins/morris.css" rel="stylesheet">
        <link rel="stylesheet" href="css/magnific-popup.css"> 

        <!-- Magnific Popup core JS file -->
        <script src="js/jquery-1.11.0.js"></script> 
        <script src="js/jquery.magnific-popup.js"></script> 

        <link href="css/nn.css" rel="stylesheet">
        <link href="font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">


    </head>
    <script language="javascript" type="text/javascript">
        function Edit(StId) {
            var frm = document.editSt;
            frm.action = "ShowSt?student_id=" + StId;
            frm.method = "post";
            frm.submit();
        }
    </script>
    <body>



        <form name="editSt"> 

            <div id="wrapper">
                <jsp:include page="Header.jsp"/>


                <div id="page-wrapper">

                    <div class="container-fluid">


                        <div class="row">
                            <div class="col-lg-12">
                                <h1 class="page-header">
                                    Classroom Attendance 
                                </h1>
                                <ol class="breadcrumb">
                                    <li>
                                        <i class="fa fa-dashboard"></i>Student Information
                                    </li>
                                </ol>
                            </div>
                        </div>


                        <br>

                        <fieldset align="right">

                            <label>Name</label>
                            <form action="SearchName">
                                <input type="text" name="searchname" value="" placeholder="Type name…">

                                <button type="submit" class="btn btn-info">Submit</button>
                            </form>

                        </fieldset>

                        <table class="table table-striped">
                            <tr>


                                <td>Student ID</td>
                                <td>Name</td>
                                <td>Last Name</td>
                                <td>Year</td>

                            </tr>
                            <tr>

                                <c:forEach items="${ShowStudent}" var="a">
                                    <td onclick="Edit('${a.stId}');"><u>${a.stId}</u></td>
                                    <td>${a.stName}</td>
                                    <td>${a.stLastname}</td>
                                    <td>${a.year}</td>

                                </tr>
                            </c:forEach>


                        </table>

                    </div>
                </div>
            </div>  
        </form>
    </body>
</html>
