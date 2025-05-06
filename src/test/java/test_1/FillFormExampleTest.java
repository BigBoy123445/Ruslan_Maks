package test_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormExampleTest {

    private WebDriver driver;
    // Метод для ініціалізації WebDriver перед кожним тестом

    @Before
    public void setUp() {
        // Автоматичне завантаження та налаштування chromedriver
        WebDriverManager.chromedriver().setup();
        // Ініціалізація WebDriver
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    // Метод для заповнення iм'я
    public void fillFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(By.xpath("//*[@id='firstName']"));
        firstNameField.sendKeys(firstName);
    }

    // Метод для заповнення прізвища
    public void fillLastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.xpath("//*[@id='lastName']"));
        lastNameField.sendKeys(lastName);
    }
    @Test
    public void testFillForm() {
        // Заповняю
        fillFirstName("Ruslan");
        fillLastName("Solodkiy");
    }
    @After
    public void tearDown() {
            driver.quit();
    }
}
