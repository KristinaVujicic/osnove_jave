package Domaci_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;


public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException  {

            System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //Napisati program koji:
        //Ucitava stranicu https://s.bootsnipp.com/iframe/Dq2X
        //Klikce na svaki iks da ugasi obavestenje i proverava da li se nakon klika element obrisao
        //sa stranice i ispisuje odgovarajuce poruke (OVO JE POTREBNO RESITI KORISCENJEM PETLJE)
        //POMOC: Brisite elemente odozdo.
        //(ZA VEZBANJE)Probajte da resite da se elemementi brisu i odozgo

        String url = "https://s.bootsnipp.com/iframe/Dq2X";

        driver.manage().window().maximize();
        driver.get(url);

        List<WebElement> close = driver.findElements(By.className("close"));

        for (int i = 0; i < close.size() ; i++) {

            Thread.sleep(1000);

            if (elementExist(driver, By.className("close"))) {
                System.out.println("Element postoji");
                 close.get(i).click();
            } else {
                System.out.println("Element ne postoji");
            }

        }

        Thread.sleep(2000);

        driver.quit();


    }

    private static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }
}


