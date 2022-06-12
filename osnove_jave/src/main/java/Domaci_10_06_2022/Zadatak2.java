package Domaci_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//2.Zadatak
//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!

        String url = "https://geodata.solutions/";

        driver.manage().window().maximize();
        driver.get(url);

        Select selectCountry = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> country = selectCountry.getOptions();
        Random randomCountry = new Random();
        int randomIndex1 = randomCountry.nextInt(country.size());
        country.get(randomIndex1).click();
        Thread.sleep(1000);


        Select selectState = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> state = selectState.getOptions();
        Random randomState = new Random();
        int randomIndex2 = randomState.nextInt(state.size());
        state.get(randomIndex2).click();
        Thread.sleep(1000);

        Select selectCity = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> city = selectCity.getOptions();
        Random randomCity = new Random();
        int randomIndex3 = randomCity.nextInt(city.size());
        city.get(randomIndex3).click();
        Thread.sleep(1000);


        driver.quit();

    }
}
