package horizontalSlider;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.DoubleStream;

public class HorizontalSliderTest extends BasePage {
    private HorizontalSliderPage sliderPage;

    @BeforeMethod
    public void initPage() {
        sliderPage = new HorizontalSliderPage(getDriver(), getWait());
        sliderPage.open();
    }

    @Test
    public void testSetSliderValue() {
        // Устанавливаем значение 3.5 и проверяем
        sliderPage.setSliderValue(3.5);

        String actualValue = sliderPage.getSliderValue();
        Assert.assertEquals(actualValue, "3.5", "Слайдер не установил значение 3.5! Получено: " + actualValue);
    }

    @Test
    public void testMinSliderValue() {
        // Проверяем минимальное значение (0)
        sliderPage.setSliderValue(0);

        String actualValue = sliderPage.getSliderValue();
        Assert.assertEquals(actualValue, "0", "Слайдер не установил минимальное значение 0! Получено: " + actualValue);
    }

    @Test
    public void testMaxSliderValue() {
        // Проверяем максимальное значение (5)
        sliderPage.setSliderValue(5);

        String actualValue = sliderPage.getSliderValue();
        Assert.assertEquals(actualValue, "5", "Слайдер не установил максимальное значение 5! Получено: " + actualValue);
    }

    @Test
    public void testSliderStep1() {
        // Проверяем шаг 0.5
        String[] steps = {"0.5", "1", "1.5", "2", "2.5", "3", "3.5", "4", "4.5", "5"};

        for (String step : steps) {
            sliderPage.setSliderValue(Double.parseDouble(step));
            String actualValue = sliderPage.getSliderValue();
            System.out.println("Установили значение: " + step + ", получили: " + actualValue);
            Assert.assertEquals(actualValue, step,
                    "Слайдер не поддерживает шаг 0.5! Ожидали: " + step + ", получили: " + actualValue);
        }
    }

    @Test
    public void testSliderStep2() {
        DoubleStream.of(0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5)
                .forEach(step -> {
                    sliderPage.setSliderValue(step);
                    String actualValue = sliderPage.getSliderValue();
                    double actualDouble = Double.parseDouble(actualValue);
                    System.out.println("Проверяем шаг: " + step + ", получили: " + actualValue);
                    Assert.assertEquals(actualDouble, step,
                            "Слайдер не поддерживает шаг 0.5! Ожидали: " + step + ", получили: " + actualValue);
                });
    }
}