package week4.Day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		int rowcount=0;
		int colcount=0;
		List<String> list=new ArrayList<String>(); 
		//List<String> list1=new ArrayList<String>();
		//Identify Table WebElement
		WebElement tableElement=driver.findElement(By.tagName("table"));
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++) {
			WebElement eachRow = rows.get(i);
			rowcount=rowcount+1;
			List<WebElement> cols = eachRow.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				WebElement colscount = cols.get(j);
				colcount=colcount+1;
				list.add(colscount.getText());
				
				}
			}
	System.out.println("The number of Rows:"+rowcount);
	System.out.println("The number of cols:"+colcount);
	System.out.println("The table values are"+list);
	//for(int x=3;x<)
	//System.out.println("The Progress:"+);
	//if(colscount.getText().contains("Learn to interact with Elements")) {
	int i=3;
	//int j=2;
	System.out.println("The Progress for learn to Interact:");
	for(i=3;i<rows.size();i++) {
		String progPath="//table//tr["+i+"]/td[2]";
	List<WebElement> progElement= driver.findElements(By.xpath(progPath));
//WebElement earchRow1=progElement.get(i);
		for(int j=0;j<progElement.size();j++) {
System.out.println(progElement.get(j).getText());
	}
	}
System.out.println("Least Vital Check:");
int x=2;
String least="//table//tr["+x+"]/td[3]/input[@name='vital']";
for(x=2;x<rows.size();x++) {
	//WebElement lcols=driver.findElement(By.xpath(least));
	//for(int j=0;j<lRows.getSize();j++) {
	driver.findElement(By.xpath(least)).click();
	WebElement progress=driver.findElement(By.xpath(prog));
		if(progress.getText().contains("20%")) {
		System.out.println("This is the least Vital check to enable");
		if(driver.findElement(By.xpath(least)).isEnabled()) {
			System.out.println("The Least Vital is clicked");
	}
	}
		
		}
	
}
}



	

	