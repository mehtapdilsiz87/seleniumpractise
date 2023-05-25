package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_AutomationExercise {
    public static void main(String[] args) {
        /*
        1- Bir test class’i olusturun ilgili ayarlari yapin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      //  2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement>sayfadakiLinkElementleri=driver.findElements(By.tagName("a"));

        int expectedLinkSayisi=147;
        int actualLinksayisi=sayfadakiLinkElementleri.size();
        if (expectedLinkSayisi==actualLinksayisi){
            System.out.println("PASSED");
        }else {
            System.out.println("FAİLED");



        }

        //4- Products linkine tiklayin

        //5- special offer yazisinin gorundugunu test edin
        //6- Sayfayi kapatin
    }
}
