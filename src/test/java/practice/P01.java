package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

        //....Exercise-1:...
      //  Create a new class with main method
        public static void main(String[] args) throws InterruptedException {



             //  Set Path
            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
               //Create a chrome driver
            WebDriver driver=new ChromeDriver();//calisacagımız tarayıcıyı belirledik

               // Maximize window
            driver.manage().window().maximize();//acılan penceremızı max boyuta ulastırdık

              //  Open google home page https://www.google.com
            driver.get("https://www.google.com");//gıdecegımız adresi belirledik
              //get ile navitage komutlarını kullanırken get komutu daha hızlı calıstıı ıcın
            //tercıh edılır.navıgate komutu ıse daha cok bagımlı durumlarda terıh edılır

        //On the same class, navigate to amazon home page https://www.amazon.com and

            driver.navigate().to("https://www.amazon.com.tr");
            Thread.sleep(2000);
        //navigate back to google
            driver.navigate().back();
            //Wait about 4 sn
            Thread.sleep(4000);



        //Navigate forward to amazon
            driver.navigate().forward();
       // Refresh page
            driver.navigate().refresh();


      // Close/quit the browser
            driver.quit();//close dersek son acık sayfayı kapatır.quit ise tum sayfaları yani
            //pencreyi kapatır

     //   And Last step print "All is well" on console
            System.out.println("All is well");




    }
}
