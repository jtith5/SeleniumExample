import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Brian\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.runescape.com/community");
        //WebElement playButton = driver.findElement(By.id("play"));
        //playButton.click();
        WebElement playerCount = driver.findElement(By.id("playerCount"));
        System.out.println(playerCount.getText());
        WebElement signInJoin = driver.findElement(By.id("header-login"));
        signInJoin.click();
        WebElement loginUsername = driver.findElement(By.id("login-username"));
        loginUsername.sendKeys("Basgolfer");

        WebElement logIn = driver.findElement(By.id("rs-login-submit"));
        logIn.click();

        driver.quit();
    }
}
