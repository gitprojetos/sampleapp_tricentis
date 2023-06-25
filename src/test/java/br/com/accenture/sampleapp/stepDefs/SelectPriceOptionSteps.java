package br.com.accenture.sampleapp.stepDefs;

import br.com.accenture.sampleapp.iteracao.InteractionsWeb;
import br.com.accenture.sampleapp.page.PriceOptionPage;
import br.com.accenture.sampleapp.util.Screen;
import io.cucumber.java8.En;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os steps referente a tela Select Price Option.
 */



public class SelectPriceOptionSteps implements En{
	
	InteractionsWeb i = new InteractionsWeb();
	
	public SelectPriceOptionSteps() {
		
		Given("selecionar um tipo de plano", () -> {
			i.marcaElementNotaFinal(PriceOptionPage.ABA_SELECT_PRICE_OPTION);
			Screen.takeScreenshot();
			i.clicar(PriceOptionPage.SELECT_PLANO_UTIMATE);
		    i.marcaElementNotaFinal(PriceOptionPage.NEXT_SELECT_OPTION);
		    Screen.takeScreenshot();
			i.clicar(PriceOptionPage.NEXT_SELECT_OPTION);
		});
		
		Given("que clico na aba select price sem cadastro realizado", () -> {
				i.clicar(PriceOptionPage.ABA_SELECT_PRICE_OPTION);
		});

		Then("exibe mensagem {string}", (String msg) -> {
			i.esperaImplicitaWait25Seconds();
			i.validarMensagemModal(PriceOptionPage.MSG_PELASE_COMPLETE_THE_FIRST_STEPS, msg);
			Screen.takeScreenshot();
		});
	}

}
