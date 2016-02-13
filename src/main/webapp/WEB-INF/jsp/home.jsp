<%-- 
    Document   : home
    Created on : 19/10/2015, 22:16:48
    Author     : Michel A. Medeiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html lang="pt-br" ng-app >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">      

        <link href="../../resources/css/animation.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container" ng-controller="AppCtrl">
            <div class="page-header"></div>
            <div class="jumbotron">
                <h2>Hello {{name|| 'World'}}!</h2>
                <label for="name">Enter Your Name</label>
                <input type="text" ng-model="name" class="form-control input-lg" id="name">
            </div>
        </div>

        <div data-ng-controller="EngineeringController">
            {{engineer.name}} is currently: {{ engineer.currentActivity}}
            <div>
                Choose a new activity:
                <select data-ng-model="engineer.currentActivity"
                        data-ng-options="act for act in activities">                
                </select>
            </div>
        </div>


        
    </body>    

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>  

    <!-- AngularJS https://ajax.googleapis.com/ajax/libs/angularjs/1.4.7/angular.js -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.29/angular.js"></script> 

    <!-- Controllers -->
    <script type="text/javascript" src="<spring:url value="/resources/js/home.js" />"></script> 
    <script type="text/javascript" src="<spring:url value="/resources/js/tipo_imovel.js" />"></script>    

    <script type="text/javascript">

    </script>

</html>


