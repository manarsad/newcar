package caraccessories;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//import com.google.api.services.gmail.model.Message;

public class EmailSender {
	private static boolean isSented=false;
	
//	public static boolean isSented() {
//		return isSented;
//	}
//	
	   public static void sendEmail(String from, String to, String subject, String messageText) {
	        // Set up the properties for the email server
	        Properties properties = System.getProperties();
//	        properties.put("mail.smtp.host", "smtp.gmail.com");
//	        properties.put("mail.smtp.port", "587");
//	        properties.put("mail.smtp.auth", "true");
//	        properties.put("mail.smtp.starttls.enable", "true");
//	        
	        properties.put("mail.smtp.host", "smtp.gmail.com");
	        properties.put("mail.smtp.port", "587");
	        properties.put("mail.smtp.auth", "true");
	        properties.put("mail.smtp.starttls.enable", "true");
	        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        properties.put("mail.smtp.ssl.ciphersuites", "TLS_AES_128_GCM_SHA256");

	        // Create a session with the properties	        
	        Session session = Session.getInstance(properties, new Authenticator() {
	            @Override
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication("s12027821@stu.najah.edu", "pkxf qoxm czzv zknz");
	            } 
	        });

	        try {
	            // Create a MimeMessage object
	            MimeMessage message = new MimeMessage(session);
	            // Set the sender and recipient addresses
	            message.setFrom(new InternetAddress(from));
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	            // Set the subject and text of the email
	            message.setSubject(subject);
	            message.setText(messageText);
	            // Send the email
	            Transport.send(message);
	            System.out.println("Email sent successfully.");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	        }
	    }
	

}
