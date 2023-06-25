package br.com.accenture.sampleapp.actions;

import java.time.Duration;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter a instancia do Webdriver.
 * Fica a escolha do profissional em decidir qual Browser vai executar
 * a autoamção.
 * 
 * Esse projeto pode ser executado com três browsers diferentes, chrome, firefox e edge.
 */

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.accenture.sampleapp.util.DriverContext;

public interface WebDriverAction {

	default void abrirUrl(String url) {
		WebDriver driver = DriverContext.getDriver();
		if (driver == null) {
			switch (System.getProperty("navegador")) {
			case "chrome":

				driver = new ChromeDriver();
				break;

			case "firefox":

				driver = new FirefoxDriver();
				break;

			case "edge":

				driver = new EdgeDriver();
				break;

			default:
				Assert.fail("Navegador inválido!");
				break;
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get(url);
			DriverContext.setDriver(driver);
		} else {
			driver.get(url);
			DriverContext.setDriver(driver);
		}
	}

}
