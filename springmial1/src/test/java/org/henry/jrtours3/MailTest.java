package org.henry.jrtours3;

import org.junit.Test;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailTest {

	
	
	@Test
	public void sendMial(){
		
		
		
		JavaMailSenderImpl mail = 	new JavaMailSenderImpl();
		mail.setPassword("smnh63SyT8");
		mail.setUsername("yang.h@zenith-cz.com");
		
		mail.setHost("localhost");
        mail.setPort(25);
        mail.setDefaultEncoding("UTF-8");
        
        
        
        SimpleMailMessage ssm = new SimpleMailMessage();
        ssm.setFrom("yang.h@zenith-cz.com");
        ssm.setTo("995821881@qq.com");
        ssm.setText("123test");
        
        mail.send(ssm);
        
		
	}
}
