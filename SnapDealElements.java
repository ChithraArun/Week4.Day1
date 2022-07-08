package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		WebElement clickMens = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(clickMens).perform();
		Thread.sleep(2000);
		WebElement clickShoes = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		//clickShoes.sendKeys("",Keys.);();
	//	action.moveToElement(clickShoes).perform();
		clickShoes.click();
	WebElement numShoes=driver.findElement(By.xpath("//span[@class='category-name category-count']"));
	String sportShoeN= numShoes.getText();
	System.out.println("The number of sport shoes"+sportShoeN);
	 WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
	trainingShoes.click();
	
	WebElement sortDropdwn=driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]"));
	Select ddValue=new Select(sortDropdwn);
	ddValue.selectByIndex(1);
	//System.out.println("The selected Value is"+ddValue.deselectByIndex(1));*/
}
}
