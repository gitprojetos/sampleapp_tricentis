@Cotacao
Feature: Formulários para solicitação de cotação

 Scenario: Acesso a tela de site sampleapp.tricentis
    Given que acesso a url "http://sampleapp.tricentis.com/101/index.php"
    Then clico na aba Automobile

	Scenario: Preencher formulario Enter Vehicle Data
 		Given que preencho todos os campos da aba enter vehicle data
 			| MAKE				   					| Volvo       |
      | ENGINE_PEREFORMANCE    	| 1000        |
      | DATE_OF_MANUFACTU       | 06/08/2023  |
      | NUMBER_OF_STATES    		| 1     			|
      | FUEL_TYPE					      | Diesel      |
      | LIST_PRICE						  | 70000       |
      | LICENSE_PLATE_NUMBER   	| 2034        |
      | ANNUAL_MILEGE				    | 150         |
    Then clicar no botao next da tela enter vehicle data
  
	Scenario: Preencher formulario Enter Insurant Data
		Given que preencho todos os campos da aba enter insurant data
			| FIRST_NAME				    | Cristiano  			|
      | LAST_NAME				    	| Lucena 					|
      | DATE_OF_BIRTH		      | 11/10/1988      |
      | GENDER				    		| Male	     			|
      | STREET_ADDRES         |Jardim São Paulo |
      | COUNTRY								| Brazil					|
      | ZIP_CODE						  | 50790186       	|
      | CITY							   	| Recife	        |
      | OCCUPATION				    | Employee        |
      | HOBBIES							  | Speeding	      |
      | WEBSITE						   	| https://www.linkedin.com/in/jos%C3%A9cristiano/ |
      
  Scenario: Preencher formulario Enter Product Data
		Given que preencho todos os campos da aba enter product data
			| START_DATE				    | 12/12/2023  		|
      | INSURANCE_SUM				  | 3.000.000,00 		|
      | MERIT_RATING		      | Super Bonus     |
      | DAMAGE_INSURANCE			| No Coverage	    |
      | OPTIONAL_PRODUCTS			| Euro Protection	|
      | COURTESY_CAR					| Yes       			|
   
  Scenario: Selecionar um plano
  	Given selecionar um tipo de plano
  
  Scenario: Preencher dados para envio da cotacao na aba Send Quote
  	Given preencher os campo da aba send quote
  		| EMAIL							    | accenturetstlinuxfedoraopen.c@gmail.com |
      | PHONE								  | 819877652430 		|
      | USERNAME				      | linuxcristlinux |
      | PASSWORD							| Cristiano@#30	  |
      | CONFIRM_PASSWORD			| Cristiano@#30		|
      | COMMENTS							| REGRESSÃO CONCLUÍDA COM SUCESSO |
   
   