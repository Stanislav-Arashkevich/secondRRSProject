package horizontalSlider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class MaxSliderValueTest {

    private WebDriver driver;

    private Actions actions;

    private WebDriverWait wait5;
    private WebDriverWait wait10;

    protected Actions getActions() {
        if (actions == null) {
            return new Actions(getDriver());
        }

        return actions;
    }

    protected WebDriverWait getWait5() {
        if (wait5 == null) {
            wait5 = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        }

        return wait5;
    }

    protected WebDriverWait getWait10() {
        if (wait10 == null) {
            wait10 = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        }

        return wait10;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    protected void start() {
        driver = new ChromeDriver();
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    protected void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
            actions = null;
            wait5 = null;
            wait10 = null;

        }
    }

    @Test
    public void testMaxSliderValue() {

        getDriver().get("https://the-internet.herokuapp.com/horizontal_slider");

        final By slider = By.cssSelector("input[type='range']");
        final By sliderValue = By.id("range");

        WebElement sliderElement = getWait10().until(ExpectedConditions.elementToBeClickable(slider));
        // Используем JavaScript, т.к. Selenium плохо двигает слайдер мышью
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
                sliderElement, 5);

        String actualValue = getWait10().until(ExpectedConditions.visibilityOfElementLocated(sliderValue)).getText();

        Assert.assertEquals(actualValue, "5", "Слайдер не установил максимальное значение 5! Получено: " + actualValue);
    }

    @Test
    public void testTPlus() {

        getDriver().get("https://www.tplusgroup.ru/");

        getWait10().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='website-menu']/ul/li[1]/a"))).click();

        String value = getDriver().findElement(By.xpath("//*[@id='content-header']/h1")).getText();
        Assert.assertEquals(value, "О компании");

    }

    @Test
    public void testHorizontalSliderTBank() throws InterruptedException {

        getDriver().get("https://www.tbank.ru/loans/cash-loan/realty/form/autoloan/");

        getWait5().until(d -> getDriver().getTitle() != null); //  проверка загрузки страницы

        WebElement slider = getDriver().findElement(By.xpath("//div[@data-field-name='cashloan_calculator_term_field']//div[@data-qa-type='uikit/Draggable']"));

        Actions actions = new Actions(getDriver());

        actions.dragAndDropBy(slider, 100, 0).perform();

        WebElement sliderValue2 = getDriver().findElement(By.xpath("//div[@data-field-name='cashloan_calculator_term_field']//div[@data-qa-type = 'uikit/inlineInput.text']"));

        // Проверка значения
        Assert.assertEquals(sliderValue2.getText(), "15 лет");
    }

    @Test
    public void testLoanParameters() throws InterruptedException {

        // Открываем страницу
        getDriver().get("https://www.tbank.ru/loans/cash-loan/realty/form/autoloan/");

        System.out.println(driver.getPageSource());
        // Ожидаем полной загрузки страницы
        getWait10()
                .until(webDriver -> ((JavascriptExecutor) getDriver())
                        .executeScript("return document.readyState").equals("complete"))
        ;

        // Ожидаем появления хотя бы одного поля ввода
        getWait10().until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[data-qa-type='uikit/inlineInput.input']")));

        // Отладка: сколько слайдеров на странице?
        System.out.println("Количество слайдеров: " + getDriver().findElements(By.cssSelector("input[type='range']")).size());

        // Отладка: есть ли выпадающее меню?
        System.out.println("Количество выпадающих меню: " + getDriver().findElements(By.cssSelector("select[data-qa-type='uikit/select']")).size());

        // 1. Установка суммы кредита через слайдер (2 000 000 ₽)
        By loanAmountSlider = By.cssSelector("input[type='range'][min='200000'][max='30000000']");
        WebElement amountSlider = getWait10().until(ExpectedConditions.elementToBeClickable(loanAmountSlider));

        // Перетаскиваем слайдер суммы
        int sliderWidth = amountSlider.getSize().getWidth();
        int targetAmount = 2000000;
        int minAmount = 200000;
        int maxAmount = 30000000;
        // Вычисляем смещение для 2 000 000 ₽
        double offset = ((double)(targetAmount - minAmount) / (maxAmount - minAmount)) * sliderWidth;

        actions.clickAndHold(amountSlider)
                .moveByOffset((int) offset, 0)
                .release()
                .build()
                .perform();

        // 2. Установка срока кредита через слайдер (3 года)
        By loanTermSlider = By.cssSelector("input[type='range'][min='1'][max='7']");
        WebElement termSlider = getWait10().until(ExpectedConditions.elementToBeClickable(loanTermSlider));

        // Перетаскиваем слайдер срока
        int termSliderWidth = termSlider.getSize().getWidth();
        double termOffset = ((double)(3 - 1) / (7 - 1)) * termSliderWidth; // 3 года из диапазона 1-7

        actions.clickAndHold(termSlider)
                .moveByOffset((int) termOffset, 0)
                .release()
                .build()
                .perform();

        // 3. Выбор цели кредита (Покупка автомобиля)
        By goalDropdown = By.cssSelector("select[data-qa-type='uikit/select']");
        WebElement dropdown = getWait10().until(ExpectedConditions.elementToBeClickable(goalDropdown));
        Select goalSelect = new Select(dropdown);
        goalSelect.selectByVisibleText("Покупка автомобиля");

        // 4. Ввод номера телефона (+7 900 123-45-67)
        By phoneInput = By.cssSelector("input[type='tel'][data-qa-type='uikit/input']");
        WebElement phoneField = getWait10().until(ExpectedConditions.elementToBeClickable(phoneInput));
        phoneField.sendKeys("+79001234567");

        // Проверки
        // 5.1 Сумма кредита
        By loanAmountInput = By.xpath("//input[@data-qa-type='uikit/inlineInput.input' and contains(@value, '₽')]");
        String actualAmount = getWait10().until(ExpectedConditions.visibilityOfElementLocated(loanAmountInput))
                .getAttribute("value");
        String expectedAmount = "2 000 000 ₽";
        Assert.assertEquals(actualAmount, expectedAmount,
                "Ожидали сумму кредита '" + expectedAmount + "', но получили '" + actualAmount + "'");

        // 5.2 Срок кредита
        By loanTermInput = By.xpath("//input[@data-qa-type='uikit/inlineInput.input' and (contains(@value, 'года') or contains(@value, 'лет'))]");
        String actualTerm = getWait10().until(ExpectedConditions.visibilityOfElementLocated(loanTermInput))
                .getAttribute("value");
        String expectedTerm = "3 года";
        Assert.assertEquals(actualTerm, expectedTerm,
                "Ожидали срок кредита '" + expectedTerm + "', но получили '" + actualTerm + "'");

        // 5.3 Ежемесячный платеж
        By monthlyPayment = By.xpath("//span[@data-qa-type='uikit/typography' and contains(@class, '_1Dmlg') and contains(text(), '₽')]");
        String actualPayment = getWait10().until(ExpectedConditions.visibilityOfElementLocated(monthlyPayment))
                .getText();
        Assert.assertTrue(actualPayment.contains("₽"),
                "Ожидали ежемесячный платеж в рублях, но получили '" + actualPayment + "'");
    }
}