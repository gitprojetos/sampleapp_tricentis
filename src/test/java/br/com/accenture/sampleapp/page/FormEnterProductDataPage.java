package br.com.accenture.sampleapp.page;

import org.openqa.selenium.By;

/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os elements da aba Enter Product Data.
 */

public class FormEnterProductDataPage {

	public static By ABA_ENTER_PRODUCT_DATA = By.id("enterproductdata");
	public static By START_DATE = By.id("startdate");
	public static By INSURANCE_SUM_$ = By.id("insurancesum");
	public static By MERIT_RATING = By.id("meritrating");
	public static By DAMAGE_INSURANCE = By.id("damageinsurance");
	public static By OPTIONAL_PRODUCTS_EURO_PROTECTION = By.cssSelector("#insurance-form > div > section:nth-child(3) > "
			+ "div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	public static By COURTEY_CAR = By.id("courtesycar");
	public static By NEXT_ENTER_PRODUCT_DATA = By.id("nextselectpriceoption");

}
