package arogyasetuapplication.listeners;

import org.apache.logging.log4j.Logger;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ArogyaSetuAppListener implements ITestListener {

	Logger log = LoggerInstances.getLoggerInstance();

	@Override
	public void onTestSuccess(ITestResult result) {
		log.info(" Test case Passed : " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
//
//		FileUtils.copyFile(file, new File("") );
		log.error(" Test case Failed : " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		log.warn(" Test case Skipped : " + result.getName());
	}
}
