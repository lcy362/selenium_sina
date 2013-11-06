package SeleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * Title: Selenium方法
 * Description:启动及关闭chromedriver进程
 * @author lichuanyang
 * @version 1.0 2013-11-6
 * @since JDK 1.6
 */

public class SeleniumUtil {

   public static WebDriver init() {
      String webBrowserPath = "chromedriver.exe";     //设置chrmedriver.exe位置
      System.setProperty("webdriver.chrome.driver", webBrowserPath);
      WebDriver driver = null;
      driver = new ChromeDriver();
      return driver;
   }

   public static void quitDrvier(WebDriver driver) {
      if (null != driver) {
         driver.quit();         //关闭chromedriver进程
      }
   }
   
   

}
