<%-- 
    Document   : StudentInfo
    Created on : Aug 20, 2014, 6:41:18 PM
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

        <script>

            $(function() {
                $('.popup').on('click', function() {
                    $.magnificPopup.open({
                        items: {
                            src: $(this).attr("src")
                        },
                        type: 'image' // this is default type
                    });
                });

            });
            
            function aa() {
    var password = prompt("Please enter your password");
    if (password != "") {
        document.getElementById("demo").innerHTML ='<h4 style="color : green">Password Correct</h4>';
    }else{
        document.getElementById("demo").innerHTML = '<h4 style="color : red">Please enter your password</h4>';
    }
}
        </script>
    </head>
    <body>




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
                    <table class="table table-striped">

                        <tr>
                            <td align="center"><img src="${ShowStudent.urlPic}"  width="200" height="200" class="popup"/>
                                <br>
                                <br>
                                <button class="btn btn-danger" type="button" onclick="aa()">UNLOCK</button>
                                
                                <p id="demo"></p>
                                
                            </td>

                            <td>
                                <h4>Student ID: ${ShowStudent.stId}</h4>
                                <br>
                                <h4>Name: ${ShowStudent.stName}</h4>
                                <br>
                                <h4>Last Name: ${ShowStudent.stLastname}</h4>
                                <br>
                                <h4>Year: ${ShowStudent.year}</h4>
                                
                            </td>
                            
                        </tr>
                        
                        <tr>
                       <td colspan="2" align="right"> <a href ="EditProfile.jsp?stId=${ShowStudent.stId}&stName=${ShowStudent.stName}&stLastname=${ShowStudent.stLastname}&year=${ShowStudent.year}"> <button class="btn btn-info" type="button">EDIT</button></a></td>
                        </tr>
                        



                    </table>

                </div>
            </div>
        </div> 

    </body>
</html>