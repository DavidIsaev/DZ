import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {
    private WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }
    void test1(String text){
        new WebDriverWait(driver,20).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("pay")),text));
         
    }
    void test2(String xpath){
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
    }
    void test3(String xpath){
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath(xpath))));
    }
    void test4(String key1, String key2, String key3){
    WebElement phonenum = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
    WebElement sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
    WebElement em = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
    WebElement cont = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
    phonenum.click();
    phonenum.sendKeys(key1);
    sum.click();
    sum.sendKeys(key2);
    em.click();
    em.sendKeys(key3);
    new WebDriverWait(driver,40)
    .until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"))));
    }
    void wov (String id) {
            new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
    void qov (String xpath){
        driver.findElement(By.className("select__header")).click();
        driver.findElement(By.xpath(xpath)).click();
    }
    void test6 (){
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
             driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();
             new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='bepaid-iframe']")));
             WebElement iframe = driver.findElement(By.xpath("//*[@class='bepaid-iframe']"));
             driver.switchTo().frame(iframe);
             new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated((By.xpath("//*[@id=\"gpay-button-online-api-id\"]/div/div[1]"))));
             new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[2]/div/div")));
             new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]")));
             String text =driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")).getText();
             new WebDriverWait(driver,20).until(ExpectedConditions.textToBe((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[1]/span[1]")), "200.00 BYN"));
             new WebDriverWait(driver,20).until(ExpectedConditions.textToBe((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/div/div[2]/span")), "Оплата: Услуги связи Номер:375297777777"));
             new WebDriverWait(driver,20).until(ExpectedConditions.textToBe((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/app-card-input/form/div[1]/div[1]/app-input/div/div/div[1]/comment()")), "Номер карты"));
             new WebDriverWait(driver,20).until(ExpectedConditions.textToBe((By.xpath("/html/body/app-root/div/div/div/app-payment-container/section/div/app-card-page/div/div[1]/button/text()")), "Оплатить 200.00 BYN"));
         }
    }
