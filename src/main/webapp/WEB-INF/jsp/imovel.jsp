<%-- 
    Document   : imovel
    Created on : 01/11/2015, 14:55:13
    Author     : Michel A. Medeiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html>
<html lang="pt-br" ng-app="imovelAjaxApp">
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
    <body  ng-controller="ImoveisCtrl">

        <div class="container" ng-controller="AppCtrl">
            <div class="page-header"></div>
            <div class="jumbotron">
                <h2>Hello {{name|| 'World'}}!</h2>
                <label for="name">Enter Your Name</label>
                <input type="text" ng-model="name" class="form-control input-lg" id="name">
            </div>
        </div>        

        <div style="padding-bottom:50px">
            <table style="width:100%">
                <!-- <tr>
                     <td colspan="2" style="width:100%;padding:10px;">					
                         <div class="alert alert-info" role="alert">{{message}}</div>
                     </td>
                 </tr> -->
                <tr>					
                    <td style="width:45%;padding-left:40px;vertical-align: top">
                        <div style="padding-bottom:20px">
                            <h3>Adicionar Imovel</h3>
                        </div>
                        <form class="form-horizontal" role="form" ng-submit="addRowAsyncAsJSON()">

                            <div class="form-group required">
                                <label for="descricao" class="col-sm-2 control-label">Descrição</label>
                                <div class="col-sm-6">
                                    <textarea id="descricao" class="form-control" rows="3"
                                              name="descricao" ng-model="descricao"></textarea>
                                </div>
                            </div>

                            <div class="form-group required">
                                <label for="bairro" class="col-sm-2 control-label">Bairro</label>
                                <div class="col-sm-2">
                                    <input type="text" class="form-control"
                                           ng-model="bairro"/>
                                </div>
                            </div>

                            <div class="form-group required">
                                <label for="valor" class="col-sm-2 control-label">Valor</label>
                                <div class="col-sm-2">
                                    <input id="valor" type="text" class="form-control js-moeda" 
                                           name="valor" ng-model="valor"/>
                                </div>
                            </div>

                            <div class="form-group required" ng-controller="TipoImovelController2">
                                 <label for="tipo" class="col-sm-2 control-label">Tipo</label>
                                 <div class="col-sm-2">
                                     <select ng-model="selected" ng-options="a for a in tipos">
                                       
                                     </select>
                                 </div>
                             </div>   

<p>You have selected {{ a }}</p>


<div ng-controller="edit">
  <select ng-model="purchase.pickUpLocationId" ng-options="loc.id as loc.name for loc in purchase.availableLocations"></select>

  <!-- This is the model not yet bound: -->
  <p>You have selected {{ purchase.pickUpLocationName }}</p>

</div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Quartos</label>
                                <div class="col-sm-10">
                                    <div class="form-group" style="margin-bottom: 0px;">
                                        <div class="col-sm-1">
                                            <input id="quartos" type="text" class="form-control" 
                                                   name="quartos" ng-model="quartos"/>
                                        </div>
                                        <label class="col-sm-1 control-label">Salas</label>
                                        <div class="col-sm-1">
                                            <input id="salas" type="text" class="form-control" 
                                                   name="salas" ng-model="salas"/>
                                        </div>
                                        <label class="col-sm-1 control-label">Garagens</label>
                                        <div class="col-sm-1">
                                            <input id="garagens" type="text" class="form-control" 
                                                   name="garagens" ng-model="garagens"/>
                                        </div>
                                        <label class="col-sm-1 control-label">Banheiros</label>
                                        <div class="col-sm-1">
                                            <input id="banheiros" type="text" class="form-control" 
                                                   name="banheiros" ng-model="banheiros"/>
                                        </div>
                                    </div>
                                </div>
                            </div>                            

                            <div class="form-group">								
                                <div style="padding-left:110px">
                                    <input type="submit" value="Submit" class="btn btn-primary"/>
                                </div>
                            </div>

                        </form>
                    </td>

                    <!-- <td style="vertical-align: top">
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
                     </td> -->
                </tr>
            </table>
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

    <!-- AngularJS -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.29/angular.js"></script> 

    <!-- Scripts -->
    <script type="text/javascript" src="<spring:url value="/resources/js/jquery.maskMoney.min.js" />"></script> 

    <!-- Controllers -->
    <script type="text/javascript" src="<spring:url value="/resources/js/home.js" />"></script>       
    <script type="text/javascript" src="<spring:url value="/resources/js/tipo_imovel.js" />"></script>  
    <script type="text/javascript" src="<spring:url value="/resources/js/imovel.js" />"></script>  
</html>
