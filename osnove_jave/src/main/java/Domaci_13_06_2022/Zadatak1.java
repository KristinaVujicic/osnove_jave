package Domaci_13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.windows.ThemeReader;

import java.io.File;
import java.time.Duration;

import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Napisati program koji ima:
        //Podesava:
        //implicitno cekanje za trazenje elemenata od 10s
        //implicitno cekanje za ucitavanje stranice od 10s
        //eksplicitno cekanje podeseno na 10s
        //Podaci:
        //Potrebno je u projektu ukljuciti 4 slike.
        //Imenovanje slika neka bude po pravilu pozicija_ime_prezime_polaznika.ekstenzija
        //Npr: front_milan_jovanovic.jpg, left_milan_jovanovic.jpg …
        //Koraci:
        //Ucitava stranicu https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you
        //Maksimizuje prozor
        //Selektuje Image - Front klikom na tu karticu u dnu ekrana
        //Klik na add photo iz levog navigacionog menia
        //Upload slike. Upload preko File objekta koristeci getAbsolutePath
        //Sacekati da broj prikazanih slika u donjem uglu navigacije bude za 1 veca
        //Kliknuti na poslednje dodatu sliku kako bi bila izabrana za postavljenje
        //Ceka da dijalog bude vidljiv
        //Klik na Use One Side Only dugme
        //Ponoviti proces za Left, Right i Back
        //Zatim iz desnog gornjeg ugla izabrati random jedan od ponudjenih konfeta
        //Kliknuti na Add To Cart dugme
        //Verifikovati postojanje greske Oops! It looks like you`ve not added an text to this field, please add one before continuing.
        //Xpath: //*[@action='error']
        //Zatvorite pretrazivac

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";

        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@class, 'sc-ezWOiH fendym')]")).click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]")).click();

        File slika1 = new File ("src/main/java/Domaci_13_06_2022/front_kris_vujicic.jpg");
        WebElement img1 = driver.findElement(By.id("imageUpload"));
        img1.sendKeys(slika1.getAbsolutePath());

        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]")))
                .click();

        wait.until(ExpectedConditions
                .elementToBeClickable(By.
                        xpath("//div[contains(@class, 'sc-breuTD')]/img")));

        WebElement popUp = driver.findElement(By.xpath("//div[contains(@class, 'sc-breuTD')]/img"));

        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOf(popUp))
                .click();
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();

        driver.findElement(By.xpath("//div[contains(@class, 'sc-ivTmOn')]/div[2]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();



        File slika2= new File("src/main/resources/left_kris_vujicic.jpg");
        WebElement img2 = driver.findElement(By.id("imageUpload"));
        img2.sendKeys(slika2.getAbsolutePath());
        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By
                        .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));
        Thread.sleep(2000);
        wait.until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();
        WebElement popUp2 = driver.findElement(By.xpath("//div[contains(@class, 'sc-iXxrte')]"));
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();



        driver.findElement(By.xpath("//div[contains(@class, 'sc-ivTmOn')]/div[3]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();

        File slika3= new File("src/main/resources/back_kris_vujicic.jpg");

        WebElement img3 = driver.findElement(By.id("imageUpload"));
        img3.sendKeys(slika3.getAbsolutePath());
        wait.until(ExpectedConditions
                .elementToBeClickable(By
                .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));

        Thread.sleep(2000);

        wait.until(ExpectedConditions
                 .elementToBeClickable(By
                .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();

        WebElement popUp3 = driver.findElement(By
                .xpath("//div[contains(@class, 'sc-iXxrte')]"));
        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By
                 .xpath("//div[contains(@class, 'sc-ivTmOn')]/div[4]/div/img"))
                .click();
        driver.findElement(By.xpath("//*[contains(@alt, '+ Add photo')]"))
                .click();


        File slika4= new File("src/main/resources/right_kris_vujicic.jpg");
        WebElement img4 = driver.findElement(By.id("imageUpload"));
        img4.sendKeys(slika4.getAbsolutePath());

        wait.until(ExpectedConditions
                .elementToBeClickable(By
                .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div/img")));

        Thread.sleep(2000);


        wait.until(ExpectedConditions
                 .elementToBeClickable(By
                 .xpath("//div[contains(@class, 'sc-ftvSup')]/div[last()]/div[contains(@class, 'gmXCBU')]/img")))
                .click();

        WebElement popUp4 = driver.findElement(By
                .xpath("//div[contains(@class, 'sc-iXxrte')]"));

        driver.findElement(By.xpath("//button[(text()='Use One Side Only')]"))
                .click();


        driver.findElement(By.xpath("//div[contains(@class, 'emMrhw')]")).click();
        driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();

        Thread.sleep(2000);

        WebElement alert = driver.findElement(By.xpath("//*[@action='error']"));
        System.out.println("Vrednost je " + alert.getAttribute("action"));

        driver.quit();

    }
}
