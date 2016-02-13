var TipoImovelController = function($scope) {
    
    $scope.tipos =
    [
        {name: "Apartamento"},
        {name: "Terreno"}
    ];        
};


var EngineeringController = function($scope) {
 
    $scope.engineer = {
        name: "Dani",
        currentActivity: "Fixing bugs"
    };
 
    $scope.activities =
    [
        "Writing code",
        "Testing code",
        "Fixing bugs",
        "Dancing"
    ];        
};


