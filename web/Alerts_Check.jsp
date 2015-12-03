<%-- 
    Document   : Alerts_Check
    Created on : Nov 22, 2015, 8:27:59 PM
    Author     : Mahesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <script type="text/javascript" src="selete2/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>  
        <!--<script src="js/bootstrap.js"></script>-->


        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">   
        <link rel="stylesheet" href="css/bootstrap.css">


    </head>
    <body>
        <div class="container">
            <br/>
            <br/>
            <div class="alert alert-info fade in" id="errormsgs">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                Enter Details...!
            </div>
            <div class="alert alert-success fade in" id="errormsgs">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                Enter Details...!
            </div>
            <div class="alert alert-danger fade in" id="errormsgs">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                Enter Details...!
            </div>
            <div class="alert alert-warning fade in text-center" id="errormsgs">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                Enter Details...!
            </div> 
        </div>

        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                    </div>
                    <div class="modal-body">
                        ...
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
