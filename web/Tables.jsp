<%-- 
    Document   : Tables
    Created on : Nov 22, 2015, 10:17:22 PM
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
        <script src="boottables/bootstrap-table.js"></script>  

        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">   
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="boottables/bootstrap-table.css">
    </head>
    <body>
        <br />
        <br />
        <br />
        <div class="container">
            <table id="getdatatable"
                   data-toggle="table"
                   data-height="460"
                   data-pagination="true"
                   data-search="true"
                   data-url="GetData">
                <thead>
                    <tr>
                        <th data-halign="center" data-field="id">ID</th>
                        <th data-field="name">Name</th>
                        <th data-field="age">Age</th>
                        <th data-field="town">Town</th>
                    </tr>
                </thead>
            </table>
        </div>
        <script>
            var $table = $('#getdatatable');
            $(function() {
            });
        </script>
    </body>
</html>
