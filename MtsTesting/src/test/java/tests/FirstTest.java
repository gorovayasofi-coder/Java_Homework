
package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
        driver.get("https://www.mts.by");

        WebElement cookieButton = driver.findElement(By.id("cookie-agree"));
        cookieButton.click();
    }

    @Test
    public void checkPaymentBlockTitle() {
        WebElement title = driver.findElement(By.cssSelector("section.pay h2"));

        String actualTitle = title.getText().replaceAll("\\s+", " ").trim();
        String expectedTitle = "ОНЛАЙН ПОПОЛНЕНИЕ БЕЗ КОМИССИИ";

        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void checkPaymentLogos() {
        List<WebElement> logos = driver.findElements(
                By.cssSelector("section.pay .pay__partners img")
        );

        assertEquals(6, logos.size());

        for (WebElement logo : logos) {
            assertTrue(logo.isDisplayed());
        }
    }

    @Test
    public void checkMoreInfoLink() {
        WebElement link = driver.findElement(By.cssSelector("section.pay a"));

        assertTrue(link.isDisplayed());
        assertEquals("Подробнее о сервисе", link.getText().trim());
        assertTrue(link.getAttribute("href").contains(
                "/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"
        ));
    }

    @Test
    public void checkPaymentForm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement phoneField = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("connection-phone"))
        );
        phoneField.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.sendKeys("100");

        WebElement cardButton = driver.findElement(
                By.cssSelector("#pay-connection button[data-method='card']")
        );
        cardButton.click();

        WebElement paymentFrame = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("iframe.payment-widget-iframe")
                )
        );

        driver.switchTo().frame(paymentFrame);

        WebElement cardNumberField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("cc-number"))
        );

        assertTrue(cardNumberField.isDisplayed());
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
