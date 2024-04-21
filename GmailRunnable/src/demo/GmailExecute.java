package demo;

import java.io.File;
import java.io.IOException;

import GmailSending.GmailSending.RunGmail;



public class GmailExecute {

	public static void main(String[] args) throws InterruptedException, IOException {
		
RunGmail gmailsender = new RunGmail();
    	
    	
    	String to = "dineshkumardalai03@gmail.com";
    	String from = "dineshdalai03@gmail.com";
    	String subject = "Screenshot";
    	String text = "This is Third mail";
    	
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


