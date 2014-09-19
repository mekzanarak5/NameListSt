<%-- 
    Document   : EditProfile
    Created on : Sep 2, 2014, 4:30:21 PM
    Author     : nuttanan
--%>

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


        <title>Edit Profile</title>
    </head>
    <body>
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
                      
	
        <div class="well well-sm">
            <form class="form-horizontal" method="post" action="EditPf">
          <fieldset>
              
            
            <div class="form-group">              
                <span class="col-md-1 col-md-offset-2 text-center"><h5>Student ID:</h5></span>              
              <div class="col-md-8">
                <input  name="StId" type="text" value="${param.stId}"   class="form-control">
              </div>
            </div>    
               <div class="form-group">
                   <span class="col-md-1 col-md-offset-2 text-center"><h5> Name: </h5></span>
              <div class="col-md-8">
                <input  name="StName" type="text" value="${param.stName}" class="form-control">
              </div>
            </div>    
            
            <div class="form-group">
                <span class="col-md-1 col-md-offset-2 text-center"><h5> Last name:</h5></span>
              <div class="col-md-8">
                <input  name="StLastname" type="text" value="${param.stLastname}" class="form-control">
              </div>
            </div>

              <div class="form-group">
                  <span class="col-md-1 col-md-offset-2 text-center"><h5> Year: </h5></span>
              <div class="col-md-8">
                <input id="phone" name="Year" type="text" value="${param.year}" class="form-control">
              </div>
            </div>
    
            
    
            <div class="form-group">
              <div class="col-md-12 text-center">
                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
                <button type="submit" class="btn btn-primary btn-lg">Cancel</button>
              </div>
            </div>
          </fieldset>
          </form>
        


<style>
    .header {
        color:#36A0FF;
        font-size:27px;
        padding:10px;
    }
    .bigicon {
        font-size:35px;
        color:#36A0FF;
    }
</style>
                    </div>
                </div>
            </div>
                    </div>
    </body>
</html>
