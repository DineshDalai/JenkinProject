package abc;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class playwrightBasic {

	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions ip = new LaunchOptions();
		ip.setChannel("chrome");
		ip.setHeadless(false);
     // Playwright playwright = Playwright.create();
            //Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Browser browser = playwright.chromium().launch(ip);
            Page page = browser.newPage();
            page.navigate("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=2248977022076665665&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415");
            System.out.println(page.title());
            browser.close();
            playwright.close();
            
        }
    }

