package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon ana sayfaya giin
        driver.get("https://www.amazon.com.tr");
        //arama kutusuna Nutella yazdırıp

        /*
        test otomasyonu yaparken bır webelementı kullanmak ıstersek
        iki eye ıhtıyacmız var
        1-o webelementı benzersız olarak tarıf rfrbilecegımız bir locator
        2-bu locatoru soyledıgımızde bıze web elementıı bulup getırecek method

        ornegın amazon sıtesındekı arama kutusunun unıq tarıf edıcısı olarak ID ="twotabsearchtextbox"
        kullanabiliriz

         */
        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
        //data türü  objenin adi             findElement= webelem.bulan method
        //                                   By=webelementi bulacagımız locatorun turunu yazdıgımız
        //                                   method
        //                                  twotabseacrhtextbox=unique tarif için id attribute degeri

        aramaKutusuElementi.sendKeys("Nutella");
        //istenen webelemente istenen yazıyı gonderır
        //Enter tusuna basarak arama yapın
        aramaKutusuElementi.submit();
        //istenen webelementı uzerınde enter tusuna basar
        Thread.sleep(7000);
        driver.close();

    }
}
