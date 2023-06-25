package br.com.accenture.sampleapp.stepDefs;

import java.util.Map;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps referente a tela Enter Isurant Data.
 */

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.FormEnterVehicleDataPage;
import br.com.accenture.sampleapp.page.FormInsurantDataPage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;

public class EnterInsurantDataSteps implements En {
	InteractionsWeb i = new InteractionsWeb();

	public EnterInsurantDataSteps() {

		Given("que preencho todos os campos da aba enter insurant data", (io.cucumber.datatable.DataTable dados) -> {
			Map<String, String> map = dados.asMap(String.class, String.class);
			i.marcaElementNotaFinal(FormInsurantDataPage.ABA_ENTER_ISURANT_DATA);
			i.escrever(FormInsurantDataPage.FIRST_NAME, map.get("FIRST_NAME"));
			i.escrever(FormInsurantDataPage.LAST_NAME, map.get("LAST_NAME"));
			i.clicar(FormInsurantDataPage.DATE_OF_BIRTH);
			Screen.takeScreenshot();
			i.escrever(FormInsurantDataPage.DATE_OF_BIRTH, map.get("DATE_OF_BIRTH"));
			i.clicar(FormInsurantDataPage.GENDER);
			i.escrever(FormInsurantDataPage.STREET_ADDRESS, map.get("STREET_ADDRES"));
			i.clicar(FormInsurantDataPage.COUNTRY);
			Screen.takeScreenshot();
			i.selecionarByVisibleText(FormInsurantDataPage.COUNTRY, map.get("COUNTRY"));
			i.escrever(FormInsurantDataPage.ZIP_CODE, map.get("ZIP_CODE"));
			i.escrever(FormInsurantDataPage.CITY, map.get("CITY"));
			i.clicar(FormInsurantDataPage.OCCUPATION);
			i.selecionarByVisibleText(FormInsurantDataPage.OCCUPATION, map.get("OCCUPATION"));
			Screen.takeScreenshot();
			i.clicar(FormInsurantDataPage.HOBBIES);
			i.escrever(FormInsurantDataPage.WEBSITE, map.get("WEBSITE"));
			i.marcaElementNotaFinal(FormInsurantDataPage.NEXT_ENTER_INSURANTE_DATA);
			i.clicar(FormInsurantDataPage.NEXT_ENTER_INSURANTE_DATA);
			Screen.takeScreenshot();

		});

	}
}
