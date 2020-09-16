import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:/chrome/chrome/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
     
   	    chrome.get("http://www.google.com");    
	}

}
