<%-- 
    Document   : hello
    Created on : 02/11/2015, 14:17:44
    Author     : Michel A. Medeiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html lang="pt-br" ng-app="helloAjaxApp">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">      
    </head>
    <body ng-controller="CompaniesCtrl">

        <div style="padding-bottom:50px">
            <table style="width:100%">
                <tr>
                    <td colspan="2" style="width:100%;padding:10px;">					
                        <div class="alert alert-info" role="alert">{{message}}</div>
                    </td>
                </tr>
                <tr>					
                    <td style="width:45%;padding-left:40px;vertical-align: top">
                        <div style="padding-bottom:20px">
                            <h3>Add a Company</h3>
                        </div>
                        <form class="form-horizontal" role="form" ng-submit="addRowAsyncAsJSON()">
                            <div class="form-group">
                                <label class="col-md-2 control-label">Name</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" name="name"
                                           ng-model="name" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">Employees</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" name="employees"
                                           ng-model="employees" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-2 control-label">Headoffice</label>
                                <div class="col-md-4">
                                    <input type="text" class="form-control" name="headoffice"
                                           ng-model="headoffice" />
                                </div>
                            </div>
                            <div class="form-group">								
                                <div style="padding-left:110px">
                                    <input type="submit" value="Submit" class="btn btn-primary"/>
                                </div>
                            </div>
                        </form>
                    </td>
                    <td style="vertical-align: top">
                        <table class="table">
                            <tr>
                                <th>Name
                                </th>
                                <th>Employees
                                </th>
                                <th>Head Office
                                </th>
                            </tr>
                            <tr ng-repeat="company in companies">
                                <td>{{company.name}}
                                </td>
                                <td>{{company.employees}}
                                </td>
                                <td>{{company.headoffice}}
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </div>

    </body>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>  

    <!-- AngularJS -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.9/angular.min.js"></script> 

    <!-- Controllers -->
    <script type="text/javascript" src="<spring:url value="/resources/js/hello.js" />"></script>    
</html>
