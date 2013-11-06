package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * Title: Selenium����
 * Description:�������ر�chromedriver����
 * @author lichuanyang
 * @version 1.0 2013-11-6
 * @since JDK 1.6
 */

public class SeleniumUtil {

   public static WebDriver init() {
      String webBrowserPath = "chromedriver.exe";     //����chrmedriver.exeλ��
      System.setProperty("webdriver.chrome.driver", webBrowserPath);
      WebDriver driver = null;
      driver = new ChromeDriver();
      return driver;
   }

   public static void quitDrvier(WebDriver driver) {
      if (null != driver) {
         driver.quit();         //�ر�chromedriver����
      }
   }
   
   

}
