package GmailSending.GmailSending;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException, IOException 
    {	
		/*
		 * Email email = new SimpleEmail(); email.setHostName("smtp.gmail.com");
		 * email.setSmtpPort(587); email.setAuthenticator(new
		 * DefaultAuthenticator("dineshdalai03@gmail.com", ""));
		 * email.setSSLOnConnect(true); email.setFrom("dinesh@gmail.com");
		 * email.setSubject("TestMail"); email.setMsg("This is a test mail ... :-)");
		 * email.addTo("dineshkumardalai03@gmail.com"); email.send();
		 */
		 
    	GEmailSender gmailsender = new GEmailSender();
    	
    	
    	String to = "dineshkumardalai03@gmail.com";
    	String from = "dineshdalai03@gmail.com";
    	String subject = "Screenshot";
    	String text = "This is Third mail";
    	//String file = "D:\\Screeenshot"
    	File file = new File("D:\\Screeenshot\\dinesh1.png");
 
    	
    	// Boolean b = gmailsender.SendEmail(to, from, subject, text);
    	gmailsender.OpenBrowser();
    	Boolean b = gmailsender.sendEmailWithAttachment(to, from, subject, text,file);
    	
    	
    	if(b) {
    		System.out.println("Email send sucessfully");
    	}else {
    		System.out.println("Email send unsucessfully");
    	}
    }

    }


