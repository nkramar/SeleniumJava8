package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Lesson1 {
  private WebDriver firefoxDriver;

  @Before
  public void setup() {
    WebDriverManager.firefoxdriver().setup();
    firefoxDriver = new FirefoxDriver();

  }

  @Test
  public void openBrowserWindowUsingGetCommand() {
    firefoxDriver.get("https://www.google.com/");
  }

  @Test
  public void openBrowserWindowUsingNavigateCommand() {
    firefoxDriver.navigate().to("https://www.google.com/");
    firefoxDriver.findElement(By.xpath("//*[@title='Поиск']")).sendKeys("Selenium");
    firefoxDriver.navigate().back();
    firefoxDriver.navigate().forward();

  }

  @After
  public void stop() {
    firefoxDriver.quit();
    firefoxDriver = null;
  }
}

/*  navigate().to() и get() делают одно и то же.
Отличие в том, что интерфейс navigate также предоставляет возможность
перемещаться по истории браузера (вперед и назад),
а также делать рефреш страницы при необходимости
driver.navigate().refresh();*/