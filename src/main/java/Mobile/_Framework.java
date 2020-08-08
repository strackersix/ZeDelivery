package Mobile;

import org.openqa.selenium.By;

import _Core.BasePageMobile;
import io.appium.java_client.MobileBy;

public class _Framework extends BasePageMobile {

	
	public void permitirDuranteUsoApp () {
		
		waitToBeClickable("//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']", 20);
		driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")).click();
	
	}
	
	public void pularIntroducao () throws InterruptedException {
					
		waitToBeVisibility("//android.view.ViewGroup[@content-desc = 'onboarding-primary-action-button']", 10);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text = 'Pular introdução']")).click();
					
	}
		
	public void entrarNaConta () {
		
		waitToBeClickable("//android.view.ViewGroup[@content-desc = 'already-have-an-account']", 10);
		driver.findElement(MobileBy.AccessibilityId("already-have-an-account")).click();
		
	}

	public void email (String email) {
		
		waitToBeClickable("//android.widget.TextView[@text = 'ENTRAR']", 5);
		driver.findElement(MobileBy.AccessibilityId("email")).sendKeys(email);
		
	}
	
	public void senha (String senha) {
		
		driver.findElement(MobileBy.AccessibilityId("password")).sendKeys(senha);
		
	}
	
	public void entrar () {
		
		driver.findElement(MobileBy.AccessibilityId("enter")).click();
		
	}
	
	public void selecionarEndereco () {
		
		waitToBeClickable("//android.widget.TextView[@text = 'Onde você quer suas bebidas?']", 5);
		driver.findElement(MobileBy.AccessibilityId("address-card-HISTORIC")).click();
		
	}
	
	public void selecionarCasa () {
		
		waitToBeClickable("//android.widget.TextView[@text = 'ENDEREÇO']", 5);
		driver.findElement(MobileBy.AccessibilityId("home-button")).click();
		
	}
	
	public void continuar () {
		
		driver.findElement(MobileBy.AccessibilityId("continue")).click();
		
	}
	
	public void verProdutosDisponiveis () {

		waitToBeClickable("//android.widget.TextView[@text = 'DETALHES DO PEDIDO']", 5);
		driver.findElement(MobileBy.AccessibilityId("see-products")).click();
		
	}
	
	public void verSacola () {
		
		try {
			
			Thread.sleep(2000);
			waitToBeClickable("//android.widget.TextView[@text = 'EU QUERO!!']", 10);
			driver.findElement(MobileBy.xpath("//android.widget.TextView[@text = 'EU QUERO!!']")).click();
						
		} catch (Throwable e) {}
		
		try {
	
			waitToBeClickable("//android.view.ViewGroup[@content-desc = 'bag-on-press']", 10);
			driver.findElement(MobileBy.AccessibilityId("bag-total-of-products")).click();
			
		} catch (Throwable e) {

			System.out.println("Não há produtos na Sacola para serem exlcuidos.");
			
		}
		
	}
	
	public void excluirProdutos () {
		
		String descExcluir;
		try {
			
			do {
				
				waitToBeClickable("//android.widget.TextView[@text = 'SACOLA']", 10);
				driver.findElement(MobileBy.AccessibilityId("delete-product")).click();
				waitToBeClickable("//android.widget.TextView[@text = 'Sacola']", 10);
				driver.findElement(MobileBy.AccessibilityId("primary-modal-button")).click();
				Thread.sleep(2000);
				descExcluir = driver.findElement(MobileBy.AccessibilityId("delete-product")).getAttribute("content-desc");
							
			} while (descExcluir.contentEquals("delete-product"));
			
		} catch (Throwable e) {}
	
		try {
		
			driver.findElement(MobileBy.AccessibilityId("Go Back")).click();
			
		} catch (Throwable e) {}
			
	}
		
}
