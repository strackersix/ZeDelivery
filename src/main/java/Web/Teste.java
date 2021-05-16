package Web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import _Core.DriverFactory;

public class Teste extends DriverFactory {
	
	
	@Test
	public void test () {
		
		
		driver.manage().window().maximize();
		driver.get("https://www.lista.com/en/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0, 4000)");
		
		
		int count = 1;
		String text1 = driver.findElement(By.xpath("(//div[@class = 'col-lg-3 col-md-6 subfooter']//ul/li/a)["+count+"]")).getText().substring(0,1);
		String text2 = "";
		
		try {

			for (int i = 0; i < 50; i++) {
				
				text2 = driver.findElement(By.xpath("(//div[@class = 'col-lg-3 col-md-6 subfooter']//ul/li/a)["+count+"]")).getText().substring(0,1);
				System.out.println(text2);
				count++;
				
			}
			
			if ( !text1.equalsIgnoreCase(text2)) {
				
				System.out.println("Comportamento correto: " + text1 + " é igual ou anterior a: " + text2);
				
			} else {

				System.out.println("Comportamento incorreto: " + text1 + " é diferente ou posterior a: " + text2);
				
			}
			
		} catch (Exception e) {}
		
	}

}
