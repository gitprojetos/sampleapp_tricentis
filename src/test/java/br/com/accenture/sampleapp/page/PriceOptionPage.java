package br.com.accenture.sampleapp.page;

import org.openqa.selenium.By;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os elements da aba Select Price Option.
 */

public class PriceOptionPage {

	public static By ABA_SELECT_PRICE_OPTION = By.id("selectpriceoption");
	public static By SELECT_PRICE_OPTION = By.id("selectpriceoption");
	public static By SELECT_PLANO_UTIMATE = By
			.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	public static By NEXT_SELECT_OPTION = By.id("nextsendquote");
	public static By MSG_PELASE_COMPLETE_THE_FIRST_STEPS = By.id("xLoaderPrice");

}
