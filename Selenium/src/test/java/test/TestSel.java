package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
  @Test
  public void Selenium_test01() {
			String exePath = "./drivers/chromedriver.exe"; //Especificar la ruta del chromedriver
			System.setProperty("webdriver.chrome.driver", exePath); //Agregar o asigna la propiedad del chromedriver
			WebDriver driver = new ChromeDriver(); //Objeto de webdriver
			
			driver.get("https://www.google.com");

		
  }
  
}
