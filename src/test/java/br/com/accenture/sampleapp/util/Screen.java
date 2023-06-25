package br.com.accenture.sampleapp.util;

import java.io.File;



/**
 * @author José Cristiano - Engenheiro de teste.
 * @Descricao Classe responsável por conter método de screenshot(Geração de evidência).
 */

import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Screen {

	public static void takeScreenshot() {
		File screenshotFile = ((TakesScreenshot) DriverContext.getDriver()).getScreenshotAs(OutputType.FILE);
		try {

			String fileName = LocalDateTime.now().toString().replace(" ", "-").replace("T", " Time ").replace(":", "-");

			Files.copy(screenshotFile, new File("src\\test\\resources\\evidencias\\" + fileName + ".jpg"));

		} catch (Exception e) {
			System.out.println("Error:  " + e);
		}

	}

}
