package br.com.accenture.sampleapp.page;

import org.openqa.selenium.By;


/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter os elements da aba Send Quote.
 */

public class SendQuotePage {

	public static By ABA_SEND_QUOTE = By.id("sendquote");
	public static By EMAIL = By.id("email");
	public static By PHONE = By.id("phone");
	public static By USERNAME = By.id("username");
	public static By PASSWORD = By.id("password");
	public static By CONFIRM_PASSWORD = By.id("confirmpassword");
	public static By COMMENTS = By.id("Comments");
	public static By BTN_SEND_QUOTE = By.id("sendemail");
	public static By ALERT_MSG_SUCESS = By.cssSelector(".sweet-alert.showSweetAlert.visible");
	public static By MSG_SENDING_EMAIL_SUCESS = By.xpath("/html/body/div[4]/h2");
	public static By BTN_OK_MSG_SUCESS = By
			.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
	

}
