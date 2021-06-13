package logingmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UIOperationLoginGmail {
    public static WebDriver webDriver;

    public void perform(String keywork, String data, String xpath) throws Exception{
        WebElement element;
        switch (keywork) {
            case "openBrowser":
                System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
                webDriver = new ChromeDriver();
                break;
            case "navigateURL":
                webDriver.get(data);
                Thread.sleep(3000);
                break;
            case "verifyTextLogin":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextContinueGmail":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextForgotEmailAndClick":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextWarning":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextMore":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyCreateAccountAndClick":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextLanguage":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextHelp":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyTextSecurity":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyRules":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "verifyButtonNext":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                break;
            case "noInputAndEnter":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.sendKeys(Keys.ENTER);
                break;
            case "verifyNoInput":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                Thread.sleep(3000);
                break;
            case "InputInvalid":
                webDriver.navigate().refresh();
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.sendKeys(data);
                element.sendKeys(Keys.ENTER);
                Thread.sleep(3000);
                break;
            case "verifyInputInvalid":
                element = webDriver.findElement(new By.ByXPath(xpath));
                element.getText().contains(data);
                Thread.sleep(3000);
                break;
            case "inputValid":
                webDriver.navigate().refresh();
                Thread.sleep(3000);
                element=  webDriver.findElement(new By.ByXPath(xpath));
                element.sendKeys(data);
                element.sendKeys(Keys.ENTER);
                break;
            case "verifyInputValid":
                String abc = webDriver.getCurrentUrl();
                abc.contains(data);
                Thread.sleep(3000);
                System.out.println("Done");
                break;
            case "closeBrowser":
                webDriver.close();
                break;
            default:
                break;
        }
    }
}
