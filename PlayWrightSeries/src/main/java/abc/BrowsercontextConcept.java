package abc;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowsercontextConcept {

	public static void main(String[] args) {
		
		Playwright playwright =  Playwright.create();
		LaunchOptions option = new LaunchOptions();
		option.setChannel("chrome");
		option.setHeadless(false);
		
		Browser browser = playwright.chromium().launch(option);
		
		BrowserContext browsercontext = browser.newContext();
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=2248977022076665665&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		page.fill("#twotabsearchtextbox", "mobie");
		System.out.println(page.title());
		
		
		BrowserContext browsercontext2 = browser.newContext();
		Page page2 = browser.newPage();
		page2.navigate("https://www.orangehrm.com/en/book-a-free-demo/");
		page2.fill("#Form_getForm_FullName", "dinesh");
		System.out.println(page2.title());
		
		
		BrowserContext browsercontext3 = browser.newContext();
		Page page3 = browser.newPage();
		page3.navigate("https://www.google.com/");
		page3.fill("#APjFqb", "maven");
		System.out.println(page3.title());
		
		browsercontext.close();
		page.close();
		
		browsercontext2.close();
		page2.close();
		
		browsercontext3.close();
		page3.close();
		
		browser.close();
		playwright.close();
	}

}
