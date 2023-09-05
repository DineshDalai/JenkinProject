package abc;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TracerInspection {

	public static void main(String[] args) {
		
		
		  try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      
		   // Start tracing before creating / navigating a page.
		      context.tracing().start(new Tracing.StartOptions()
		        .setScreenshots(true)
		        .setSnapshots(true)
		        .setSources(true));
		      
		      Page page = context.newPage();
		      page.navigate("https://www.orangehrm.com/en/book-a-free-demo/");
		      page.getByPlaceholder("Your Full Name*").click();
		      
		      page.getByPlaceholder("Your Full Name*").fill("din@gmail.com");
		      page.getByPlaceholder("Business Email*").click();
		      page.getByPlaceholder("Business Email*").fill("dine");
		      page.getByLabel("Country").selectOption("Australia");
		      page.getByPlaceholder("Phone Number*").click();
		      page.getByPlaceholder("Phone Number*").fill("58521458");
		      
		   // Stop tracing and export it into a zip archive.
		      context.tracing().stop(new Tracing.StopOptions()
		        .setPath(Paths.get("trace.zip")));
		    }

	}

}
