package Web;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import _Core.BasePageWeb;
import _Core.Constantes;
import io.appium.java_client.touch.WaitOptions;

public class _Framework extends BasePageWeb implements Constantes {
	
	public void url (String url) {
	
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void maiorIdade () {
		
		waitToBeClickable("//button[@id = 'age-gate-button-yes']" , 10);
		driver.findElement(By.xpath("//button[@id = 'age-gate-button-yes']")).click();
		
	}
	
	public void entrar () {
		
		waitToBeClickable("//button[@id = 'welcome-button-sign-in']", 20);
		driver.findElement(By.xpath("//button[@id = 'welcome-button-sign-in']")).click();
		
	}
	
	@Deprecated
	public void entrarComEmail () {
		
		waitToBeClickable("//button[@id = 'login-home-email-button-sign-in']", 10);
		driver.findElement(By.xpath("//button[@id = 'login-home-email-button-sign-in']")).click();
		
	}
	
	public void usuario (String usuario) {
		
		waitToBeClickable("//input[@id = 'login-mail-input-email']", 10);
		driver.findElement(By.xpath("//input[@id = 'login-mail-input-email']")).sendKeys(usuario);
		
	}
	
	public void senha ( String senha ) {
		
		driver.findElement(By.xpath("//input[@id = 'login-mail-input-password']")).sendKeys(senha);
		
	}
	
	public void logar () {
		
		driver.findElement(By.xpath("//button[@id = 'login-mail-button-sign-in']")).click();
		
	}
	
	public String validaLogin () {
		
		waitToBeClickable("//div[@class = 'css-162x1q9-textBase-UserProfileCard']", 10);
		return driver.findElement(By.xpath("//div[@class = 'css-162x1q9-textBase-UserProfileCard']")).getText();
		
	}
	
	
	public void sextouOld (String marca1, int qtde1,  String marca2, int qtde2, String marca3, int qtde3) {
		
		waitToBeClickable("//div[@id = 'category-Cervejas']", 10);
		driver.findElement(By.xpath("//div[@id = 'category-Cervejas']")).click();
		
		List<String> listaMarca = new ArrayList<String>();
		listaMarca.add(marca1);
		listaMarca.add(marca2);
		listaMarca.add(marca3);
			
		int n = listaMarca.size();
		int qtde = qtde1;
		int indicador = 1;
			
		for (int i = 0; i < n; i++) {
						
			String produto = listaMarca.get(i);
			String produtoConvertido = produto.substring(0,1).toUpperCase() + produto.substring(1).toLowerCase();
							
			try {
				
				waitToBeClickable("//div[@class = 'css-v2ahk8-customShelfCardContainer']/a[@title = '"+produtoConvertido+"']/..", 10);
				driver.findElement(By.xpath("//div[@class = 'css-v2ahk8-customShelfCardContainer']/a[@title = '"+produtoConvertido+"']/..")).click();
				waitToBeClickable("(//div[@class = 'css-94zwmk-productsSingleListContainer']/a)[1]", 10);
				driver.findElement(By.xpath("(//div[@class = 'css-94zwmk-productsSingleListContainer']/a)[1]")).click();

				try {
					
					waitToBeClickable("//label[@class = 'css-ev311a-label']", 0);
					driver.findElement(By.xpath("//label[@class = 'css-ev311a-label']")).click();
					
				} catch (Exception e) {}
								
				if (qtde > 1) {
					
					while (qtde > 1) {
						
						waitToBeClickable("//div[@id = 'plus-button']", 10);
						driver.findElement(By.xpath("//div[@id = 'plus-button']")).click();
						--qtde;				
												
					}
					
					indicador++;
					driver.findElement(By.xpath("//button[@id = 'add-product']")).click();
				
					try {
						waitToBeClickable("//button[@id = 'primary-modal-button']", 10);
						driver.findElement(By.xpath("//button[@id = 'primary-modal-button']")).click();
					} catch (Exception e) {}
					
					waitToBeClickable("//div[@class = 'css-6k9kan-header']/*[@id = 'sidebar-header-close-button']", 10);
 					driver.findElement(By.xpath("//div[@class = 'css-6k9kan-header']/*[@id = 'sidebar-header-close-button']")).click();
					waitToBeClickable("//div[@id = 'category-Cervejas']", 10);
					driver.findElement(By.xpath("//div[@id = 'category-Cervejas']")).click();
					
					if (qtde2 > 1 && indicador == 2) {
						
						qtde = qtde2;
												
					}
														
					if (qtde3 > 1 && indicador == 3) {
						
						qtde = qtde3;
						
					}
				}
			} catch (Exception e) {}
		}
	}
	
	public void sextou ( String pronto1, Integer qtde1 ) {
		
//		waitToBeClickable("//div[@id = 'category-Cervejas']", 10);
//		driver.findElement(By.xpath("//div[@id = 'category-Cervejas']")).click();
//				
//		switch (pronto1) {
//			case "brahma": 
//				
//				break;
//				
//			case "skoll": 
//				
//				break;
//	
//			default:
//				break;
//			}
//		
		
		
	}
	
	public void perfil () {
		
		driver.findElement(By.xpath("//div[@id = 'header-user-badge']")).click();
		
	}
	
	public void sair () {
		
		waitToBeClickable("//div[@id = 'logout-button']/div", 5);
		driver.findElement(By.xpath("//div[@id = 'logout-button']/div")).click();
		waitToBeClickable("//button[@id = 'primary-modal-button']", 5);
		driver.findElement(By.xpath("//button[@id = 'primary-modal-button']")).click();
				
	}
	
	public String validaLogout () {
		
		waitToBeClickable("//p[text() = 'ENTRAR NA CONTA COM E-MAIL']", 10);
		return driver.findElement(By.xpath("//p[text() = 'ENTRAR NA CONTA COM E-MAIL']")).getText();
		
	}
	
}
