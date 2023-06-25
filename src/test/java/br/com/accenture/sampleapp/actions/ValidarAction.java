package br.com.accenture.sampleapp.actions;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import br.com.accenture.sampleapp.util.DriverContext;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter ações de validação
 * Existe diferente tipos de métodos para realizar validações, textos, campos e etc.
 */

public interface ValidarAction {

	default void marcaElementNotaFinal(By byElement) {

		JavascriptExecutor js = (JavascriptExecutor) DriverContext.getDriver();

		WebElement element = DriverContext.getDriver().findElement(byElement);
		js.executeScript("arguments[0].style.border = arguments[1]", element, "solid 4px red");
	}

	default void validarValue(By elemento, String valor) {
		assertTrue(DriverContext.getDriver().findElement(elemento).getAttribute("value").equals(valor));

	}

	default void validarSeElementoExiste(By elemento) {
		try {
			DriverContext.getDriver().findElement(elemento);
		} catch (NoSuchElementException e) {
			Assert.fail("Elemento: " + elemento + "não encontrado");
		}
	}

	default void validarTextoContido(By elemento, String valorEsperado) {
		String texto = DriverContext.getDriver().findElement(elemento).getText();
		if (!texto.contains(valorEsperado)) {
			Assert.fail("Elemento: " + elemento + "não contém o texto: " + valorEsperado);
		}
	}

	default void validarrCampoPopulado(By element, String atributo) {

		boolean campoPreenchido = false;

		if (DriverContext.getDriver().findElement(element).getAttribute(atributo).length() > 0) {
			campoPreenchido = true;

		} else {
			Assert.fail("CAMPO NÃO PREENCHIDO");
		}

		Assert.assertTrue(campoPreenchido);

	}

	public default String CaptuarTextoAttribute(By elemento, String atributo) {
		String atributoValor = DriverContext.getDriver().findElement(elemento).getAttribute(atributo);
		return atributoValor;
	}
	
	public default void validarMensagemModal(By msg, String mensagem) {
		String mensagemModal = DriverContext.getDriver().findElement(msg).getText();
		Assert.assertTrue(mensagemModal.equals(mensagem));
		
	}

}
