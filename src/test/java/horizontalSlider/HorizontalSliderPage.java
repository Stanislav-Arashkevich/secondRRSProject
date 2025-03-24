package horizontalSlider;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalSliderPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    // Локаторы
    private final By slider = By.cssSelector("input[type='range']");
    private final By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
    }

    public void setSliderValue(double value) {

        WebElement sliderElement = wait.until(ExpectedConditions.elementToBeClickable(slider));
        // Используем JavaScript, т.к. Selenium плохо двигает слайдер мышью
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
                sliderElement, value);
    }

    public String getSliderValue() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sliderValue)).getText();
    }

    public void moveSlider(double targetValue) {
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(sliderValue));
        int width = slider.getSize().getWidth();

        // Рассчитываем смещение
        double percent = targetValue / 5.0; // Максимум 5.0
        int xOffset = (int) (width * percent);

        // Действия с мышью
        new Actions(driver)
                .dragAndDropBy(slider, xOffset, 0)
                .perform();
    }

    public String getCurrentValue() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sliderValue)).getText();
    }

    // Альтернативный метод через клавиши
    public void setExactValue(double value) {
        WebElement slider = driver.findElement(sliderValue);
        double current = Double.parseDouble(getCurrentValue());

        while (Math.abs(current - value) > 0.01) {
            if (current < value) {
                slider.sendKeys(Keys.ARROW_RIGHT);
                current += 0.5;
            } else {
                slider.sendKeys(Keys.ARROW_LEFT);
                current -= 0.5;
            }
        }
    }
}