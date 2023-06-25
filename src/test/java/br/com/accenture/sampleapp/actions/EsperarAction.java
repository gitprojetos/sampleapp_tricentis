package br.com.accenture.sampleapp.actions;

import java.time.Duration;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter ações de espera.
 */

import br.com.accenture.sampleapp.util.DriverContext;

public interface EsperarAction {

	default void esperaImplicitaWait25Seconds() {
		DriverContext.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	}

}
