import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainClass {
        @Test
    public void FirstTest(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\АННА\\Desktop\\homework\\4\\test\\selenium\\test\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            //1
            driver.get("https://eios.kemsu.ru/a/eios");
            driver.manage().window().setSize(new Dimension(1280, 1025));

            //2
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//*[@name='username']")).sendKeys("stud71738");
            driver.findElement(By.xpath("//*[@name='password']")).sendKeys("QSEFawd123");
            driver.findElement(By.xpath("//*[@class='css-h0m9oy efn4aem0']")).click();

            //3
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            Assertions.assertEquals("Шабалина А.Н.",
                    driver.findElement(By.xpath("//*[@class='css-10pdxt6 efn4aem0']")).getText());

            //4
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//*[@href='https://xiais.kemsu.ru/proc/stud?backToNewEios=https://eios.kemsu.ru/a/eios/personal-area']")).click();

            //5
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//*[@action='/restricted/logoff.htm']")).click();

           // driver.quit();
        }
}
