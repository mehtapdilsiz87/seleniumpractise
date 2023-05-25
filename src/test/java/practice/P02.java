package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) throws InterruptedException {

//1-Driver oluşturalim
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
//2-Java class'imiza chnomedriver. exetyi tanitalim
        WebDriver driver=new ChromeDriver();
//3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();
//4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
// Egen oncesinde sqyfq Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//5-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
//6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle= driver.getTitle();
        System.out.println("ottoTitle="+ottoTitle);
        String ottoUrl=driver.getCurrentUrl();
        System.out.println("ottoUrl="+ottoUrl);
//7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (ottoUrl.contains("OTTO")&&ottoUrl.contains("OTTO")){
            System.out.println("OTTO yazisi her ikisinde de vardır.Test PASSED");
        }else {
            System.out.println("En az birinde OTTO yoktur.Test FAILED");
        }
        System.out.println("===============================");
//8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");
//9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wqTitle=driver.getTitle();
        System.out.println("wqTitle="+wqTitle);

        boolean isTrue=wqTitle.contains("Quarter");
        if (isTrue){
            System.out.println("Your test PASSED");
        }else {
            System.out.println("Your test FAILED");
        }
//10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        Thread.sleep(2000);
//11-Sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(2000);
//12-Daha sonra web sgyfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
//13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();



    }
}
