package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	WebDriver driver;

	final String PRODUTO_BUSCA = "#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-small.puis-padding-right-small > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span";
	final String PRECO_PRODUTO = "#corePrice_feature_div > div";

	public ResultadoBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarProduto() {

		driver.findElement(By.cssSelector(PRODUTO_BUSCA)).click();
	}

	public String retornarValorProduto() {

		return driver.findElement(By.cssSelector(PRECO_PRODUTO)).getText();
	}

}
