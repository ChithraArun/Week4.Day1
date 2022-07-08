package week4.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		
		List<WebElement> iphoneList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement eachiPhone:iphoneList) {
			String s=eachiPhone.getText();
			if(s.contains("128")) {
				System.out.println(s);
			}
		}
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("geronimos Hilton",Keys.ENTER);
	
	}

}
