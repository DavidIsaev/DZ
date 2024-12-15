import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test{
    WebDriver driver = new ChromeDriver();
   @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void start (){
    driver.get("https://www.mts.by/");
    }

    @org.junit.jupiter.api.Test
    void test1 () {
        new WebDriverWait(driver,20).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")),"Онлайн пополнение"));
        new WebDriverWait(driver,20).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2")),"без комиссии"));
    }
    @org.junit.jupiter.api.Test
    void test2 () {
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"))));
    }

    @org.junit.jupiter.api.Test
    void test3 () {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul"))));
        

    }
    @org.junit.jupiter.api.Test
    void test4() {
    WebElement phonenum = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
    WebElement sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
    WebElement em = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
    WebElement cont = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
    phonenum.click();
    phonenum.sendKeys("297777777");
    sum.click();
    sum.sendKeys("200");
    em.click();
    em.sendKeys("davidisaevq@gmail.com");
    new WebDriverWait(driver,40).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"))));
    }
}   