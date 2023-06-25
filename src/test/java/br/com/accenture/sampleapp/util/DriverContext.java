package br.com.accenture.sampleapp.util;

import org.openqa.selenium.WebDriver;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por inicializar o driver.
 */


public class DriverContext {
	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverContext.driver = driver;
	}

}
