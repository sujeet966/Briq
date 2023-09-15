import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintData {

	public static void main(String[] args) {
		System.setProperty("chromedriver", "/Users/sueetkumar/eclipse-workspace/SeleniumJava/");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/challenging_dom");
		String header = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/thead")).getText();
		int rowCount = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table//tr")).size();
		List<String> TableData = new ArrayList<>();
		for (int i=1;i<rowCount;i++) {
			String rowdata = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr["+i+"]")).getText();
			TableData.add(rowdata);
		}
		
		System.out.println(header);
		for(String str : TableData)
			System.out.println(str);
		driver.close();
	}
}