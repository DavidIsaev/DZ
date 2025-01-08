import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

public class Test{
    WebDriver driver = new ChromeDriver();
    PageObject project = new PageObject(driver);
   @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void start (){
    driver.get("https://www.mts.by/");
try {
    driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    
    
} catch (Exception e) {
    
}
    }
    @Step("Тест 1")
    @org.junit.jupiter.api.Test
    @Description(" Наличие текста (Online пополнение и без комиссии)")
    void test1 () {
        project.test1("Онлайн пополнение");
        project.test1("без комиссии");
    }

    @Step("Тест 2")
    @org.junit.jupiter.api.Test
    @Description(" Наличие логотипов платежных систем")
    void test2 () {
        project.test2("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a");
    }

    @Step("Тест 3")
    @org.junit.jupiter.api.Test
    @Description("Работа ссылки (Подробнее о сервисе)")
    void test3 () {
        project.test3("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul");
        

    }
    @Step("Тест 4")
    @org.junit.jupiter.api.Test
    @Description("Работа ссылки (Подробнее о сервисе)")
    void test4() {
        project.test4("297777777","200","davidisaevq@gmail.com");
    }

    @Step("Тест 5")
    @org.junit.jupiter.api.Test
    @Description("Работа ссылки (Подробнее о сервисе)")
    void test5(){
        project.wov("connection-phone");
        project.wov("connection-sum");
        project.wov("connection-email");
        project.qov("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p");
        project.wov("internet-phone");
        project.wov("internet-sum");
        project.wov("internet-email");
        project.qov("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]/p");
        project.wov("score-instalment");
        project.wov("instalment-sum");
        project.wov("instalment-email");
        project.qov("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]/p");
        project.wov("score-arrears");
        project.wov("arrears-sum");
        project.wov("arrears-email");
    }
    @Step("Тест 6")
    @org.junit.jupiter.api.Test
    @Description("Работа ссылки (Подробнее о сервисе)")
    void test6(){
        project.test6();
    }
}  