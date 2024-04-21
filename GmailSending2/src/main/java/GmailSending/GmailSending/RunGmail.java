package GmailSending.GmailSending;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class RunGmail 
{
    public static void main( String[] args ) throws InterruptedException, IOException 
    {	

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
    
    
    
    
    public boolean SendEmail(String to,String from,String Subject,String text) {
    	
    	boolean flag= false;
    	
    	//logic
        //smtp properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");
    	
    	
       
    	
    	//session
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            	 String username = "dineshdalai03";
     	        String password = "izaigavbigrofiua";
            	return new PasswordAuthentication(username,password);
                
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(Subject);
            message.setText(text);
            Transport.send(message);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return flag;
    }
 
 
 
 public boolean sendEmailWithAttachment(String to, String from, String subject, String text,File file) throws InterruptedException, IOException {
	 

        boolean flag = false;
        //smtp properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");

      


        //session
        Session session = Session.getInstance(properties, new Authenticator() {
        	
        	String username = "dineshdalai03";
 	        String password = "izaigavbigrofiua";
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(from));
            message.setSubject(subject);

            MimeBodyPart part1 = new MimeBodyPart();
            part1.setText(text);

            MimeBodyPart part2 = new MimeBodyPart();
            part2.attachFile(file);

            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(part1);
            mimeMultipart.addBodyPart(part2);

            message.setContent(mimeMultipart);

            Transport.send(message);
            flag = true;


        } catch (Exception e) {
            e.printStackTrace();
        }

        return flag;

    }
 
 public void OpenBrowser() throws InterruptedException, IOException {
	 
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--headless");
	 
	 WebDriver driver = new ChromeDriver(options);
 		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
 		
 		driver.findElement(By.name("proceed")).click();
 		Thread.sleep(3000);
 		Alert alert = driver.switchTo().alert();
 		System.out.println(alert.getText());
 		driver.switchTo().alert().accept();
 		Thread.sleep(3000);
 		
 		//TakeScreenshot for some portion of the page
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("D:\\Screeenshot\\dinesh1.png");
		FileUtils.copyFile(scr, trg);
 }

    }


