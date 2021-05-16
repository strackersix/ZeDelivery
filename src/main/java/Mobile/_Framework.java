package Mobile;

import _Core.BaseScreenMobile;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class _Framework extends BaseScreenMobile {

	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id = 'com.android.permissioncontroller:id/permission_allow_foreground_only_button']")
	private MobileElement permitirDuranteUsoAPP;
		
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "long-splash-animation")
	private MobileElement splash;
		
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "onboarding-secondary-action-button")
	private MobileElement pularIntroducao;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "already-have-an-account")
	private MobileElement entrarNaConta;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "user-login-email")
	private MobileElement escreverEmail;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "user-login-password")
	private MobileElement escreverSenha;	
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "user-login-enterWithEmailAndPassword")
	private MobileElement btnEntrar;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "continue")
	private MobileElement continuar;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "address-card-HISTORIC")
	private MobileElement selecionarEndereco;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "submit-button")
	private MobileElement entendidoZe;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "bag-on-press")
	private MobileElement verSacola;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "bag-total-of-products")
	private MobileElement totalProdutosSacola;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(accessibility = "edit-profile")
	private MobileElement perfil;
	
	@iOSXCUITFindBy(id = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'ENTRAR NA CONTA']")
	private MobileElement validarLogout;
	
	
	boolean permitirConteudo;
	public void permitirDuranteUsoApp () {
		
		try {
			click(permitirDuranteUsoAPP);
		} catch (Exception e) {}
	}	
	
	public void pularIntroducao () throws InterruptedException {

		permitirDuranteUsoApp();
		waitToBeVisibility(splash, 10);
		String attribute = splash.getAttribute("content-desc");
		while (attribute.equalsIgnoreCase("long-splash-animation")) {
			try {
				waitToBeVisibility(splash, 20);
			} catch (Exception e) {
				attribute = "";
			}
		}
		click(pularIntroducao);
	}
		
	public void entrarNaConta () {
		
		click(entrarNaConta);
	}

	public void escreverEmail (String email) {
		
		sendKeys(escreverEmail, email);
	}
	
	public void escreverSenha (String senha) {
		
		sendKeys(escreverSenha, senha);
	}
	
	public void clicarBotaoEntrarEmailESenha () {
		
		click(btnEntrar);
	}
	
	public void clicarBotaoContinuar () {

		click(continuar);
	}
	
	public void selecionarEndereco () {
		
		click(selecionarEndereco);
		clicarBotaoContinuar();
	}
	
	@Deprecated
	public void selecionarCasa () {

		driver.findElement(MobileBy.AccessibilityId("home-button")).click();
	}

	public void verSacola () {
		
		click(entendidoZe);
		click(verSacola);
	}
	
	public void excluirProdutos () {
		
		String descExcluir;
		try {
			do {
				driver.findElement(MobileBy.AccessibilityId("delete-product")).click();
				driver.findElement(MobileBy.AccessibilityId("primary-modal-button")).click();
				Thread.sleep(2000);
				descExcluir = driver.findElement(MobileBy.AccessibilityId("delete-product")).getAttribute("content-desc");
			} while (descExcluir.contentEquals("delete-product"));
		} catch (Throwable e) {}
	
		try {
			driver.findElement(MobileBy.AccessibilityId("Go Back")).click();
		} catch (Throwable e) {}
	}
	
	public void perfil () {

		click(perfil);
	}
	
	public void sair () {

		driver.findElement(MobileBy.AccessibilityId("logout-card")).click();
		driver.findElement(MobileBy.AccessibilityId("primary-modal-button")).click();
	}
	
	public String validarLogout () {
		
		return getText(validarLogout);
	}
		
}
