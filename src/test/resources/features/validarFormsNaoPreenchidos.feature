@validarmensagemdeformsincompletos
Feature: Validar campos preenchidos

 Scenario: Acesso a tela de site sampleapp.tricentis
    Given que acesso a url "http://sampleapp.tricentis.com/101/index.php"
    Then clico na aba Automobile
 
 Scenario: Validar na aba Select Price Option mensagem de cadastro imcompleto
 		Given que clico na aba select price sem cadastro realizado
 		Then exibe mensagem "Please, complete the first three steps to see the price table."
 		