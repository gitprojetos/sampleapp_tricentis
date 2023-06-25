package br.com.accenture.sampleapp.actions;

import java.time.Duration;

/**
 * @author José Cristiano - Engineer de Test
 * @Descricao Classe responsável por conter ações de espera.
 */


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.accenture.sampleapp.util.DriverContext;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter ações de clique.
 */


public interface MouseAction {

	default void clicar(By elemento) {
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		DriverContext.getDriver().findElement(elemento).click();
	}

	default void clicarTitle(String title, By mr, By mrs) {
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(60));
		By elemento = (title.equals("Mr.")) ? mr : mrs;
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		DriverContext.getDriver().findElement(elemento).click();
	}

	default void clicar(By elemento, Boolean click) {
		WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
		if (click) {
			DriverContext.getDriver().findElement(elemento).click();
		}
	}

}
