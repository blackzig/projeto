var imovelAjaxApp = angular.module("imovelAjaxApp", []);

imovelAjaxApp.controller("ImoveisCtrl", ['$scope', '$http', function ($scope, $http) {
        $scope.companies = [
        ];
        $scope.addRowAsyncAsJSON = function () {
            $scope.companies.push({'descricao': $scope.descricao,
                'bairro': $scope.bairro, 'valor': $scope.valor, 'tipo': $scope.tipo,
                'area': $scope.area, 'quartos': $scope.quartos, 'salas': $scope.salas,
                'garagens': $scope.garagens, 'banheiros': $scope.banheiros});
            // Writing it to the server
            //		
            var dataObj = {
                descricao: $scope.descricao,
                bairro: $scope.bairro,
                valor: $scope.valor,
                tipo: $scope.tipo,
                area: $scope.area,
                quartos: $scope.quartos,
                salas: $scope.salas,
                garagens: $scope.garagens,
                banheiros: $scope.banheiros
            };

            var res = $http.post('/projeto/imovel/saveimovel_json', dataObj);
            res.success(function (data, status, headers, config) {
                // $scope.message = data;
            });
            res.error(function (data, status, headers, config) {
                // alert("failure message: " + JSON.stringify({data: data}));
            });
            // Making the fields empty
            //
            $scope.descricao = '';
            $scope.bairro = '';
            $scope.valor = '';
            $scope.tipo = '';
            $scope.area = '';
            $scope.quartos = '';
            $scope.salas = '';
            $scope.garagens = '';
            $scope.banheiros = '';
        };
    }]);


          function TipoImovelController2($scope) {
                $scope.tipos = 
                            [
                                "Apartamento",
                                "Terreno",
                                "Casa",
                                "Cômodo Comercial"
                            ];           
            }


app.controller('edit', ['$scope', function($scope) {
    $scope.purchase = {
        pickUpLocationId: 30,
        availableLocations: [
            {id: 20, name: "Charleston, SC"},
            {id: 30, name: "Atlanta, GA"},
            {id: 40, name: "Richmond, VA"},
        ]
    };
}]);