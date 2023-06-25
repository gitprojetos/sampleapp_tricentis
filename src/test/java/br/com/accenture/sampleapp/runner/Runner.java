package br.com.accenture.sampleapp.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.accenture.sampleapp.util.DriverContext;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter options do cucumber e execução da features de teste.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "", plugin = {
		"json:target/reports/cucumberReport.json" }, tags = "")

public class Runner {

	@BeforeClass
	public static void setupTest() {
		System.setProperty("navegador", "firefox");
	}

	@AfterClass
	public static void afterClass() {
		DriverContext.getDriver().quit();

	}
}
