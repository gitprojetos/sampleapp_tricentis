@validarCamposPreenchidosEnterVehicle
Feature: Validar campos preenchidos

 Scenario: Acesso a tela de site sampleapp.tricentis
    Given que acesso a url "http://sampleapp.tricentis.com/101/index.php"
    Then clico na aba Automobile
    
 Scenario: Validar os campos preenchidos na tela Vehicle Data
 		Given que preencho todos os campos da aba enter vehicle data
 			| MAKE				   					| Volvo       |
      | ENGINE_PEREFORMANCE    	| 1000        |
      | DATE_OF_MANUFACTU       | 06/08/2023  |
      | NUMBER_OF_STATES    		| 1     			|
      | FUEL_TYPE					      | Diesel      |
      | LIST_PRICE						  | 70000       |
      | LICENSE_PLATE_NUMBER   	| 2034        |
      | ANNUAL_MILEGE				    | 150         |
    Then validar se os campos Engine Perfomance e List Price estao preenchidos