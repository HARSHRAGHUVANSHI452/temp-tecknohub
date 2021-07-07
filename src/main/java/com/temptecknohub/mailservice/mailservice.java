package com.temptecknohub.mailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class mailservice {
	
	@Autowired
	private JavaMailSender mailsender;

	public void simplemail(String emailto,String message,String subject) {
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setFrom("amitnegi@techno-hub.org");
		simpleMailMessage.setTo(emailto);
		simpleMailMessage.setText(message);
		simpleMailMessage.setSubject(subject);
		
		mailsender.send(simpleMailMessage);
		System.out.println("mail send......");
	}
}
