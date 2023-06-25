package br.com.accenture.sampleapp.stepDefs;

import java.util.Map;

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.SendQuotePage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps referente a tela Send Quote.
 */


public class SendQuoteSteps implements En {

	InteractionsWeb i = new InteractionsWeb();

	public SendQuoteSteps() {
		Given("preencher os campo da aba send quote", (io.cucumber.datatable.DataTable dados) -> {
			Map<String, String> map = dados.asMap(String.class, String.class);
			i.marcaElementNotaFinal(SendQuotePage.ABA_SEND_QUOTE);
			Screen.takeScreenshot();
			i.escrever(SendQuotePage.EMAIL, map.get("EMAIL"));
			i.escrever(SendQuotePage.PHONE, map.get("PHONE"));
			i.escrever(SendQuotePage.USERNAME, map.get("USERNAME"));
			i.escrever(SendQuotePage.PASSWORD, map.get("PASSWORD"));
			Screen.takeScreenshot();
			i.escrever(SendQuotePage.CONFIRM_PASSWORD, map.get("CONFIRM_PASSWORD"));
			i.escrever(SendQuotePage.COMMENTS, map.get("COMMENTS"));
			i.marcaElementNotaFinal(SendQuotePage.BTN_SEND_QUOTE);
			Screen.takeScreenshot();
			i.clicar(SendQuotePage.BTN_SEND_QUOTE);
			i.esperaImplicitaWait25Seconds();
			i.validarTextoContido(SendQuotePage.MSG_SENDING_EMAIL_SUCESS, "Sending e-mail success!");
			System.out.println();
			Screen.takeScreenshot();

		});

	}

}
