package arogyasetuapplication;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import arogyasetuapplication.driversfactory.BrowsersList;
import arogyasetuapplication.driversfactory.DriverFactory;
import arogyasetuapplication.exceptions.BrowserNotSupportedException;

public class BaseTestArogyaSetuApp {

	WebDriver driver;
	Logger log;

	@BeforeTest
	public void setUp() throws BrowserNotSupportedException {

		log = LogManager.getLogger(BaseTestArogyaSetuApp.class);
		driver = DriverFactory.getDriverInstance(BrowsersList.CHROME);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
		log = null;
	}
}
