package customdrivers;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by arun on 15/05/2018.
 */
public class CustomChromeDriver implements DriverSource {

    private Logger logger = LoggerFactory.getLogger(CustomChromeDriver.class);

    @Override
    public final WebDriver newDriver() {
        ChromeDriverManager.getInstance().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        ChromeDriver chromeDriver = new ChromeDriver();

        logger.info("Using ChromeDriver with config -> " + chromeDriver.getCapabilities().toString());
        logger.info("Using ChromeDriver with options -> " + options.toString());

        return chromeDriver;
    }

    @Override
    public final boolean takesScreenshots() {
        return true;
    }
}
