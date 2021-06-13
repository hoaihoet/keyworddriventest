package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class UIOperation {

    public static WebDriver webDriver;

    public void perform(String keywork, String data, String xpath) throws Exception{
        switch (keywork) {
            case "openBrowser":
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                webDriver = new ChromeDriver();
                break;
            case "navigateURL":
                webDriver.get(data);
                break;

            case "enterKeyword":
                WebElement element = webDriver.findElement(new By.ByXPath(xpath));
                element.sendKeys("java");
                element.sendKeys(Keys.ENTER);
                break;

            case "clickFirstLink":
                List<WebElement> list= webDriver.findElements(new By.ByXPath(xpath));
                for(int i=0;i< list.size();i++){
                    String listItem= list.get(i).getText();
                    if (listItem.contains(data)){
                        list.get(i).click();
                        Thread.sleep(3000);
                        webDriver.close();
                    }
                }
                break;
            default:
                break;
        }
    }
}
