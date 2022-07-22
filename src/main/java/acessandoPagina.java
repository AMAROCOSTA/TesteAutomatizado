import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acessandoPagina {
	
	@Test
	public void TextAccessingPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoptime.com.br/?utm_source=rakuten&utm_medium=afiliados&utm_term=3911133&utm_content=Sw7ussWjpGo-lZiQ5.yRj7ci6fp5rDUkvQ&utm_campaign=marca:shop;midia:afiliados;formato:00;subformato:00;idcampanha:shop;franq:3911133&epar=af_00_00_ra_shop&opn=AFLSHOP&franq=3911133&ranMID=42759&ranEAID=Sw7ussWjpGo&ranSiteID=Sw7ussWjpGo-lZiQ5.yRj7ci6fp5rDUkvQ");
		driver.findElement(By.id("trending-departments-item__Item-sc-17d2z8u-0 iGDEzl")).click();
		
		
	}
	
}