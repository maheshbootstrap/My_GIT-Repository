<%-- 
    Document   : index
    Created on : Nov 22, 2015, 12:10:20 PM
    Author     : Mahesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="css/bootstrap-theme.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="selete2/select2.css">
        <link rel="stylesheet" href="selete2/select2.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">        
        <link rel="stylesheet" href="datepicker/datepicker.css">        

        <script type="text/javascript" src="selete2/jquery-1.11.3.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap.min.js"></script>     
        <!--<script src="selete2/jquery-1.8.0.min.js"></script>-->     

        <script src="selete2/select2.js"></script>  
        <script src="selete2/select2.full.js"></script>  
        <script src="selete2/select2.min.js"></script>  
        <script src="datepicker/bootstrap-datepicker.js"></script>  
        <style>
            fieldset{
                border:1px solid #cccc;
            }
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1> This is my first</h1>
            <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-print"></span> Print</button>
            <button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Delete</button>
            <button type="button" class="btn btn-default"><span class="glyphicon glyphicon-refresh"></span> Refresh</button>
            <button type="button" class="btn btn-success">Click Me</button>
            <button type="button" class="btn btn-warning">Click Me</button>
            <br/>
            <br/>
            <div class="alert alert-success text-center">
                <strong>This is alert..!</strong>My name is buru..
            </div>

            <div class="alert alert-info fade in" id="errormsgs">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                Enter Details...!
            </div>

            <select style="width: 300px;" id="selecttag">
                <option></option>
                <option>Kandy</option>
                <option>Colombo</option>
                <option>Anuradhapura</option>
                <option>Kurunegala</option>
                <option>Nuwara Eliya</option>
            </select>
            <br />
            <br />
            <div class="input-append date"  id="dp3" data-date="12-02-2012" data-date-format="dd-mm-yyyy">
                <input readonly class="span2" size="16" type="text" >
                <span class="add-on"><i class="icon-th"></i></span>
            </div>   

            <div class="control-group">
                <label for="date-picker-2" class="control-label">B</label>
                <div class="controls">
                    <div class="input-group">
                        <input id="date-picker-2" type="text" class="date-picker form-control" />
                        <label for="date-picker-2" class="input-group-addon btn"><span class="glyphicon glyphicon-calendar"></span>

                        </label>
                    </div>
                </div>
            </div>
            <br />
            <br />

            <div class="well well-sm">
                <p>Tax (NBT/VAT)</p>
                <table>
                    <tr>
                        <td>
                            <input type="text" class="form-control">                
                        </td>
                        <td>
                            <input type="text" class="form-control">
                        </td>
                    </tr>
                </table>
            </div>
        </div>





        <script>
//
            $('#dp3').datepicker('show');
            $("#date-picker-2").datepicker();
            $(document).ready(function() {
                $('#selecttag').append('<i class="fa fa-angle-down"></i>');
                $("#selecttag").select2({
                    placeholder: "Select a Town",
                    allowClear: true
                });
            });
        </script>
    </body>

</html>
