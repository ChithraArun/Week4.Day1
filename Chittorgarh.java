package week4.Day1;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		WebElement stkMarkt = driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']"));
		stkMarkt.click();
		WebElement nseBulk = driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']"));
		nseBulk.click();
		List<String> stockNames=new ArrayList<String>();
		WebElement tableElement = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']"));
		List<WebElement> rows=tableElement.findElements(By.tagName("tr"));
		String security;
		for(int i=0;i<rows.size();i++) {
			
			WebElement eachrow=rows.get(i);
			List<WebElement> cols=eachrow.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				security = cols.get(2).getText();
				stockNames.add(security);
			}
		}
		System.out.println("The list of Securities are");
		System.out.println(stockNames);
/*		for(int k=0;k<list.size();k++) {
//			String colpath="(//div[@class='table-responsive/table/tbody/tr["+k+"]/td[3])']";
			List<WebElement> findElements = driver.findElements(By.xpath(colpath));
		//	for(int j=0;j<findElements.size();j++) {
				String Security=findElements.get(2).getText();
				stockNames.add(Security);
				
			}
		System.out.println("The list of "+list.size()+"are:");
		System.out.println(stockNames);	
	}*/

	}

}
