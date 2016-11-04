package com.henry.jrt.common.mail;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.henry.jrt.common.StringUtils;

public class SpringMail {

	private final static ApplicationContext ac = new ClassPathXmlApplicationContext("mailConfig.xml");
	private final static JavaMailSender mailSender = (JavaMailSender) ac.getBean("mailSender");

	public static boolean sentMail(MailBean mailBean) {

		SimpleMailMessage mail = new SimpleMailMessage();
		boolean flag = true;

		try {
			String defaultFrom = ((JavaMailSenderImpl) mailSender).getUsername();
			if (!StringUtils.isEmpty(mailBean.getFromAddress())) {

				defaultFrom = mailBean.getFromAddress();
			}

			
			//from
			mail.setFrom(defaultFrom);
			
			//
			if (!StringUtils.isEmpty(mailBean.getReplyTo())) {

				mail.setReplyTo(mailBean.getReplyTo());
			}

			//to
			mail.setTo(mailBean.getToAddress());

			
			//date
			mail.setSentDate(new Date());
			// mail.setCc();

			
			//title
			if (!StringUtils.isEmpty(mailBean.getSubject())) {
				mail.setSubject(mailBean.getSubject());
			}

			//content
			if (!StringUtils.isEmpty(mailBean.getMailContent())) {

				mail.setText(mailBean.getMailContent());
			}

			mailSender.send(mail);
		} catch (MailException e) {

			flag = false;
			e.printStackTrace();
		}

		return flag;
	}

	public static void sendMailWithAttachment() {

		MimeMessage createMimeMessage = mailSender.createMimeMessage();
		// ...........
	}
}
