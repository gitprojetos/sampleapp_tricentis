package br.com.accenture.sampleapp.iteracao;

import br.com.accenture.sampleapp.actions.EsperarAction;

import br.com.accenture.sampleapp.actions.MouseAction;
import br.com.accenture.sampleapp.actions.TecladoAction;
import br.com.accenture.sampleapp.actions.ValidarAction;
import br.com.accenture.sampleapp.actions.WebDriverAction;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter comandos que executam interações com
 *            a página da web. Os métodos contidos na classe são todos públicos
 *            e para utilizá-la, é necessário passar o WebDriver como parâmetro.
 */
public class InteractionsWeb implements WebDriverAction, ValidarAction, MouseAction, TecladoAction, EsperarAction {

}
