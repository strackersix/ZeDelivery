package Web;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import _Core.BasePageWeb;
import _Core.Constantes;
import io.appium.java_client.touch.WaitOptions;

public class _Framework extends BasePageWeb implements Constantes {

	@FindBy(xpath = "//button[@id = 'age-gate-button-yes']")
	private WebElement maiorIdade;
	
	@FindBy(xpath = "//button[@id = 'welcome-button-sign-in']")
	private WebElement entrar;
	
	@FindBy(xpath = "//div[@class = 'optanon-alert-box-button optanon-button-allow']")
	private WebElement aceitarCookies;	
	
	@FindBy(xpath = "//input[@id = 'login-mail-input-email']")
	private WebElement campoUsuario;
	
	@FindBy(xpath = "//input[@id = 'login-mail-input-password']")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//button[@id = 'login-mail-button-sign-in']")
	private WebElement logar;
	
	@FindBy(xpath = "//div[@class = 'css-162x1q9-textBase-UserProfileCard']")
	private WebElement validarLogin;
	
	@FindBy(xpath = "//div[@id = 'category-Cervejas']")
	private WebElement cervejas;
		
	@FindBy(xpath = "(//div[@class = 'css-94zwmk-productsSingleListContainer']/a)[1]")
	private WebElement selecionarPrimeiraCerveja;
	
	@FindBy(xpath = "//label[@class = 'css-ev311a-label']")
	private WebElement possuoGarrafasRetornaveis;
	
	@FindBy(xpath = "//div[@id = 'plus-button']")
	private WebElement adicionarCervejas;

	@FindBy(xpath = "//button[@id = 'add-product']")
	private WebElement adicionar;
	
	@FindBy(xpath = "//div[@class = 'css-6k9kan-header']/*[@id = 'sidebar-header-close-button']")
	private WebElement fecharSacola;
	
	@FindBy(xpath = "//div[@id = 'header-user-badge']")
	private WebElement perfil;

	@FindBy(xpath = "//div[@id = 'logout-button']/div")
	private WebElement sair;
	
	@FindBy(xpath = "//button[@id = 'primary-modal-button']")
	private WebElement simQueroSair;
	
	@FindBy(xpath = "//p[text() = 'ENTRAR NA CONTA COM E-MAIL']")
	private WebElement validarLogout;

	public void url (String url) {
	
		driver.manage().window().maximize();
		driver.get(url);
	}
		
	public void logar (String usuario, String senha) {
				
		click(maiorIdade);	
		click(entrar);
		sendKeys(campoUsuario, usuario);
		sendKeys(campoSenha, senha);
		click(logar);
	}

	public String validaLogin() {
		
		return getText(validarLogin);
	}

	public void sextou (String marca1, int qtde1,  String marca2, int qtde2, String marca3, int qtde3) {

		click(cervejas);
		click(aceitarCookies);
		
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
			
				waitToBeClickable(By.xpath("//div[@class = 'css-v2ahk8-customShelfCardContainer']/a[@title = '"+produtoConvertido+"']/.."));
				driver.findElement(By.xpath("//div[@class = 'css-v2ahk8-customShelfCardContainer']/a[@title = '"+produtoConvertido+"']/..")).click();
				click(selecionarPrimeiraCerveja);
					
				try {
					clickEtimeReduzido(possuoGarrafasRetornaveis);
				} catch (Exception e) {}
								
				if (qtde > 1) {
					
					while (qtde > 1) {
						
						click(adicionarCervejas);
						--qtde;				
					}
					
					indicador++;
					click(adicionar);
					click(fecharSacola);
					click(cervejas);
					
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
	
//	public void sextou ( String pronto1, Integer qtde1 ) {
//		
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
//			
//	}
	
	public void perfil () {
		
		click(perfil);
	}
	
	public void sair () {
		
		click(sair);
		click(simQueroSair);
	}
	
	public String validaLogout () {
		
		return getText(validarLogout);
	}
	
}
