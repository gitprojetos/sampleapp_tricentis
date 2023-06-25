package br.com.accenture.sampleapp.stepDefs;

import java.util.Map;

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.FormEnterProductDataPage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps referente a tela Enter
 *            Product Data.
 */

public class EnterProductDataSteps implements En {

	InteractionsWeb i = new InteractionsWeb();

	public EnterProductDataSteps() {

		Given("que preencho todos os campos da aba enter product data", (io.cucumber.datatable.DataTable dados) -> {
			Map<String, String> map = dados.asMap(String.class, String.class);
			i.marcaElementNotaFinal(FormEnterProductDataPage.ABA_ENTER_PRODUCT_DATA);
			Screen.takeScreenshot();
			i.escrever(FormEnterProductDataPage.START_DATE, map.get("START_DATE"));
			i.clicar(FormEnterProductDataPage.INSURANCE_SUM_$);
			Screen.takeScreenshot();
			i.selecionarByVisibleText(FormEnterProductDataPage.INSURANCE_SUM_$, map.get("INSURANCE_SUM"));
			i.clicar(FormEnterProductDataPage.MERIT_RATING);
			i.selecionarByVisibleText(FormEnterProductDataPage.MERIT_RATING, map.get("MERIT_RATING"));
			i.clicar(FormEnterProductDataPage.DAMAGE_INSURANCE);
			i.selecionarByVisibleText(FormEnterProductDataPage.DAMAGE_INSURANCE, map.get("DAMAGE_INSURANCE"));
			Screen.takeScreenshot();
			i.clicar(FormEnterProductDataPage.OPTIONAL_PRODUCTS_EURO_PROTECTION);
			i.clicar(FormEnterProductDataPage.COURTEY_CAR);
			i.selecionarByVisibleText(FormEnterProductDataPage.COURTEY_CAR, map.get("COURTESY_CAR"));
			i.marcaElementNotaFinal(FormEnterProductDataPage.NEXT_ENTER_PRODUCT_DATA);
			i.clicar(FormEnterProductDataPage.NEXT_ENTER_PRODUCT_DATA);
			Screen.takeScreenshot();

		});

	}

}
