package arogyasetuapplication.driversfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverManager implements DriverInstance {

	@Override
	public WebDriver createDriver() {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}

}
