package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mauli\\Desktop\\selenium\\chrome\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		
System.out.println("log in page open");

	}

}
