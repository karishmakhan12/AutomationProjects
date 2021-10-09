package Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import common.CommonConstant;


public class CommonService {

	public static WebDriver getChromeDriver() {
		System.setProperty(CommonConstant.WEB_CHROME_DRIVER, CommonConstant.WEB_CHROME_DRIVER_PATH);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
