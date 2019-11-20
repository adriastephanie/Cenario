// import cucumber.api.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AddCarrinho {
	private WebDriver driver; 
	
	// acessar o site homepage
	@Dado("^que estou acessando a aplicação$")
	public void que_estou_acessando_a_aplicação() throws Throwable {
	driver = new ChromeDriver();
	driver.get("https://www.magazineluiza.com.br");
	}
	
	// informar produto no campo de busca
	@Quando("^informar o produto \"([^\"]*)\" no campo buscar$")
	public void informar_o_produto_no_campo_buscar(String arg1) throws Throwable {
		driver.findElement(By.id("inpHeaderSearch")).sendKeys("fone de ouvido");
	
	}

	// buscar produto
	@Quando("^seleciono buscar$")
	public void seleciono_buscar() throws Throwable {
	driver.findElement(By.id("btnHeaderSearch")).click();
	}
	// validar existe o produto buscado
	@Quando("^retorna a busca$")
	public void retorna_a_busca() throws Throwable {
	assertThat(driver.findElement(By.id("main-title")).getText(), is("fone de ouvido"));
		
	}
	private void assertThat(String text, Object object) {
		// TODO Auto-generated method stub
		
	}

	private Object is(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	// selecionar produto
	@Quando("^seleciono o produto \"([^\"]*)\"$")
	public void seleciono_o_produto(String arg1) throws Throwable {
	driver.findElement(By.cssSelector("#product_218608200 .nm-product-img")).click();
		
	}
	// adicionar na sacola
	@Quando("^clicar no botão adicionar na sacola$")
	public void clicar_no_botão_adicionar_na_sacola() throws Throwable {
	driver.findElement(By.cssSelector(".js-main-add-cart-button"));  
	}

	@Então("^deve adicionar produto no carrinho com sucesso$")
	public void deve_adicionar_produto_no_carrinho_com_sucesso() throws Throwable {
	driver.findElement(By.cssSelector(".js-main-add-cart-button")).click();    
	
}
}
