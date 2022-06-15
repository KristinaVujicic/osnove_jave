package Domaci_14_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import org.openqa.selenium.OutputType;


import java.io.IOException;
import java.time.Duration;


public class BootstrapTableTests {


    private String baseUrl = "https://s.bootsnipp.com";
    private WebDriver driver;

    //Kreirati BootstrapTableTests klasu koja ima:
    //Base url: https://s.bootsnipp.com

    @BeforeClass
    public void beforeClass () {
            System.setProperty("webdriver.chrome.driver",
                    "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod () {
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test (priority = 1)
    //Test #1: Edit Row
    //Podaci:
    //First Name: ime polaznika
    //Last Name: prezime polaznika
    //Middle Name: srednje ime polanzika
    //Koraci:
    //Ucitati stranu /iframe/K5yrx
    //Verifikovati naslov stranice Table with Edit and Update Data - Bootsnipp.com
    //Klik na Edit dugme prvog reda
    //Sacekati da dijalog za Editovanje bude vidljiv
    //Popuniti formu podacima.
    //Bice potrebno da pre unosa tekst pobrisete tekst koji vec postoji,
    //za to se koristi metoda clear. Koristan link
    //Klik na Update dugme
    //Sacekati da dijalog za Editovanje postane nevidljiv
    //Verifikovati da se u First Name celiji prvog reda tabele javlja uneto ime
    //Verifikovati da se u Last Name celiji prvog reda tabele javlja uneto prezime
    //Verifikovati da se u Middle Name celiji prvog reda tabele javlja uneto srednje ime
    //Za sve validacije ispisati odgovarajuce poruke u slucaju greske

    public void editRaw () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String name = "Kristina";
        String lastName = "Vujicic";
        String middleName = "Kris";

        driver.get(baseUrl+ "/iframe/K5yrx");

        Assert.assertTrue(driver.getTitle().contains("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR], there is no such a name on this page! ");

        driver
                .findElement(By.xpath("//  button [contains (@type, 'button')]"))
                .click();


        wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(By.
                        xpath("//  div [contains (@class, 'modal-header')]")));

        driver.
                findElement( By.xpath("// input [contains (@id, 'fn')]")).clear();
        driver.
                findElement( By.xpath("// input [contains (@id, 'ln')]")).clear();
        driver.
                findElement( By.xpath("// input [contains (@id, 'mn')]")).clear();

        Thread.sleep(1000);

        driver.
                findElement( By.xpath("// input [contains (@id, 'fn')]"))
                .sendKeys(name);
        driver.
                findElement( By.xpath("// input [contains (@id, 'ln')]"))
                .sendKeys(lastName);
        driver.
                findElement( By.xpath("// input [contains (@id, 'mn')]"))
                .sendKeys(middleName);

        Thread.sleep(1000);

        driver.findElement(By.id("up")).click();

        wait.until(ExpectedConditions
                .invisibilityOfElementLocated(By.
                        xpath("//  div [contains (@class, 'modal-header')]")));

        Assert.assertTrue(driver.findElement(By.id("f1")).getText().contains("Kristina"),
                "[Error] the name is not correct." );

        Assert.assertTrue(driver.findElement(By.id("l1")).getText().contains("Vujicic"),
                "[Error] the last name is not correct." );

        Assert.assertTrue(driver.findElement(By.id("m1")).getText().contains("Kris"),
                "[Error] the middle name is not correct." );

    }

    @Test (priority = 2)
    public void deleteRow () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String name = "Kristina";
        String lastName = "Vujicic";
        String middleName = "Kris";

        driver.get(baseUrl+ "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().contains("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR], there is no such a name on this page! ");

        driver.findElement(By.xpath("// button [contains (@data-target, '#delete')]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("del")));

        driver.findElement(By.id("del")).click();
        Thread.sleep(1000);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("del")));

    }

    @Test (priority = 3)

    public void takeASkreenshoot() throws IOException {
            driver.get(baseUrl + "/iframe/K5yrx");
            Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                    "[ERROR] The title does not contain this text");
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("src/main/resources/screenshot.png");
            FileHandler.copy(srcFile,destFile);


    }


    @AfterClass
    private void afterClass () {
        driver.quit();
    }


}
