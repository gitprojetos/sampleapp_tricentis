package br.com.accenture.sampleapp.page;

import org.openqa.selenium.By;

/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os elements da aba Enter Insurant Data.
 */

public class FormInsurantDataPage {

	public static By ABA_ENTER_ISURANT_DATA = By.id("enterinsurantdata");
	public static By FIRST_NAME = By.id("firstname");
	public static By LAST_NAME = By.id("lastname");
	public static By DATE_OF_BIRTH = By.id("birthdate");
	public static By GENDER = By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	public static By STREET_ADDRESS = By.id("streetaddress");
	public static By COUNTRY = By.id("country");
	public static By ZIP_CODE = By.id("zipcode");
	public static By CITY = By.id("city");
	public static By OCCUPATION = By.id("occupation");
	public static By HOBBIES = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	public static By WEBSITE = By.id("website");
	public static By NEXT_ENTER_INSURANTE_DATA = By.id("nextenterproductdata");

}
