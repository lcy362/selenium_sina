/**
 * 
 */
package weibo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.accessibility.internal.resources.accessibility;

import sun.print.resources.serviceui;

import SeleniumMethod.SeleniumUtil;

/**
 * Title: SeleniumDemo
 * Description:ʹ��Selenium��ȡ���˵�һҳ��΢������
 * @author lichuanyang
 * @version 1.0 2013-11-6
 * @since JDK 1.6
 */

public class Spider {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      run();

   }

   public static void run() {
      WebDriver driver = SeleniumUtil.init();
      driver.get("http://weibo.com");
      
      WebElement e=driver.findElement(By.name("username"));
      e.sendKeys(""); //΢���û���
      wait(1000);
      e=driver.findElement(By.name("password"));
      e.sendKeys(""); //΢������
      wait(1000);
      e=driver.findElement(By.className("W_btn_g"));
      wait(1000);
      e.click();  //�ҵ���½��ť�����
      
      
      List<WebElement> weibos= driver.findElements(By.cssSelector("div.WB_detail"));   //һ��΢����������Ϣ����<div class="WB_detail"></div>�� 
      System.out.println(weibos.size());
      
      for (WebElement weibo:weibos){
//         System.out.println(weibo.getText());
         WebElement info=weibo.findElement(By.cssSelector("a.WB_name.S_func1"));
         String name=info.getAttribute("nick-name");
         String id=info.getAttribute("usercard");
         System.out.println("�����ǳ�:"+name);
         System.out.println(id);
         
         WebElement content=weibo.findElement(By.className("WB_text"));
         String text=content.getText();
         System.out.println(text);
         
         WebElement count=weibo.findElement(By.cssSelector("a[action-type=\"feed_list_forward\"]"));
         System.out.println(count.getText());
      }
      
      
      
      SeleniumUtil.quitDrvier(driver);

   }
   
   public static void wait(int num) {
      try {
         Thread.sleep(num);
      } catch (InterruptedException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
