package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		String exePath = "./drivers/chromedriver.exe"; //Especificar la ruta del chromedriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregar o asigna la propiedad del chromedriver
		WebDriver driver = new ChromeDriver(); //Objeto de webdriver
		
		driver.get("https://www.google.com");

	}

}
