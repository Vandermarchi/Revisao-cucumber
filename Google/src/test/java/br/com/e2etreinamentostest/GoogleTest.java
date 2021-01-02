package br.com.e2etreinamentostest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\Nova Pasta\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Google.com.br");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void PesquisarE2eTreinamentos() {
		
		
		
		WebElement pesquisar = driver.findElement(By.name("q"));
		pesquisar.sendKeys(" E2E Treinamentos ");
		pesquisar.submit();
		String txt = driver.findElement(By.cssSelector("#rhs > div > div.kp-blk.knowledge-panel.Wnoohf.OJXvsb > div > div.ifM9O > div > div.Hhmu2e.mod.NFQFxe.viOShc.LKPcQc > div > div.SPZz6b > h2 > span")).getText();
		assertEquals(txt, "E2E Treinamentos");
	
		
	}

}
