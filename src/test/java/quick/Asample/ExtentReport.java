package quick.Asample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	
	public static ExtentReports generate() {
		
		String path = System.getProperty("user.dir")+"\\reports+\\index.html";
	
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	
	reporter.config().setDocumentTitle("Ashish");
	reporter.config().setReportName("Krz");
	
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	
	return extent;
	

}
}
