package br.com.accenture.sampleapp.stepDefs;

import java.util.Map;

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.FormEnterVehicleDataPage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps referente a tela Enter Vehicle Data.
 */


public class EnterVehicleDataSteps implements En {
	InteractionsWeb i = new InteractionsWeb();

	public EnterVehicleDataSteps() {
		Given("que preencho todos os campos da aba enter vehicle data", (io.cucumber.datatable.DataTable dados) -> {
			Map<String, String> map = dados.asMap(String.class, String.class);
			i.marcaElementNotaFinal(FormEnterVehicleDataPage.ABA_ENTER_VEHICLE_DATA);
			i.clicar(FormEnterVehicleDataPage.MAKE);
			Screen.takeScreenshot();
			i.selecionarByVisibleText(FormEnterVehicleDataPage.MAKE, map.get("MAKE"));
			i.escrever(FormEnterVehicleDataPage.ENGINE_PERFORMANCE_KM, map.get("ENGINE_PEREFORMANCE"));
			i.escrever(FormEnterVehicleDataPage.DATE_OF_MANUFACTURE, map.get("DATE_OF_MANUFACTU"));
			i.clicar(FormEnterVehicleDataPage.NUMBER_OF_SEATS);
			i.selecionarByVisibleText(FormEnterVehicleDataPage.NUMBER_OF_SEATS, map.get("NUMBER_OF_STATES"));
			Screen.takeScreenshot();
			i.clicar(FormEnterVehicleDataPage.FUEL_TUYPE);
			i.selecionarByVisibleText(FormEnterVehicleDataPage.FUEL_TUYPE, map.get("FUEL_TYPE"));
			i.escrever(FormEnterVehicleDataPage.LIST_PRICE_$, map.get("LIST_PRICE"));
			Screen.takeScreenshot();
			i.escrever(FormEnterVehicleDataPage.LICENSE_PLATE_NUMBER, map.get("LICENSE_PLATE_NUMBER"));
			i.escrever(FormEnterVehicleDataPage.ANNUAL_MILEAGE_MI, map.get("ANNUAL_MILEGE"));
			i.marcaElementNotaFinal(FormEnterVehicleDataPage.NEXT);

		});

		Then("clicar no botao next da tela enter vehicle data", () -> {
			i.clicar(FormEnterVehicleDataPage.NEXT);
			Screen.takeScreenshot();
		});

		Then("validar se os campos Engine Perfomance e List Price estao preenchidos", () -> {
			i.validarrCampoPopulado(FormEnterVehicleDataPage.ENGINE_PERFORMANCE_KM, "value");
		});

	}

}
