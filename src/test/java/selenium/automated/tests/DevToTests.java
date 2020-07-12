






import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
public class DevToTests {
    WebDriver driver;
    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kasia\\Downloads\\Nowy folder\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void OpenDevTo(){
        String url = "https://dev.to/";
        driver.get(url);
        String currentUrl = driver.getCurrentUrl();
        assertTrue("The current url isn't dev.to",url.equals(currentUrl));
    }
}