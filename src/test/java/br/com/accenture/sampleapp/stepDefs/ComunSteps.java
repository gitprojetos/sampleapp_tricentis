package br.com.accenture.sampleapp.stepDefs;

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.HomePage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps que são comuns entre outros steps.
 */

public class ComunSteps implements En {

	InteractionsWeb i = new InteractionsWeb();

	public ComunSteps() {
		Given("que acesso a url {string}", (String url) -> {
			i.abrirUrl(url);
			Screen.takeScreenshot();
		});

		Then("clico na aba Automobile", () -> {
			i.marcaElementNotaFinal(HomePage.AUTOMOBILE);
			Screen.takeScreenshot();
			i.clicar(HomePage.AUTOMOBILE);
		});

	}

}
