package br.com.accenture.sampleapp.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.accenture.sampleapp.util.DriverContext;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter ações de clique.
 */

public interface TecladoAction {

	default void selecionarByVisibleText(By element, String valor) {
		Select sel = new Select(DriverContext.getDriver().findElement(element));
		sel.selectByVisibleText(valor);
	}

	default void selecionarByValue(By elemet, String valor) {
		Select sel = new Select(DriverContext.getDriver().findElement(elemet));
		sel.selectByValue(valor);
	}

	default void escrever(By element, String texto) {
		DriverContext.getDriver().findElement(element).clear();
		DriverContext.getDriver().findElement(element).sendKeys(texto);
		;

	}

}
