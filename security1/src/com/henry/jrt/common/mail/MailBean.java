package com.henry.jrt.common.mail;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MailBean {

	private String fromAddress = "";

	private String replyTo = "";

	private String subject = "";
	
	private String  toAddress="";

	private List<String> mailListForTO = null;

	private List<String> mailListForCC = null;

	private List<String> mailListForBCC = null;

	private String attachmentPath = "";

	private String mailContent = "";

	private String mailTemplate = "";

	private List<String> contentParams = null;

	private MultipartFile attachment1 = null;

	private MultipartFile attachment2 = null;

	private MultipartFile attachment3 = null;

	private MultipartFile attachment4 = null;

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<String> getMailListForTO() {
		return mailListForTO;
	}

	public void setMailListForTO(List<String> mailListForTO) {
		this.mailListForTO = mailListForTO;
	}

	public List<String> getMailListForCC() {
		return mailListForCC;
	}

	public void setMailListForCC(List<String> mailListForCC) {
		this.mailListForCC = mailListForCC;
	}

	public List<String> getMailListForBCC() {
		return mailListForBCC;
	}

	public void setMailListForBCC(List<String> mailListForBCC) {
		this.mailListForBCC = mailListForBCC;
	}

	public String getAttachmentPath() {
		return attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public String getMailTemplate() {
		return mailTemplate;
	}

	public void setMailTemplate(String mailTemplate) {
		this.mailTemplate = mailTemplate;
	}

	public List<String> getContentParams() {
		return contentParams;
	}

	public void setContentParams(List<String> contentParams) {
		this.contentParams = contentParams;
	}

	public MultipartFile getAttachment1() {
		return attachment1;
	}

	public void setAttachment1(MultipartFile attachment1) {
		this.attachment1 = attachment1;
	}

	public MultipartFile getAttachment2() {
		return attachment2;
	}

	public void setAttachment2(MultipartFile attachment2) {
		this.attachment2 = attachment2;
	}

	public MultipartFile getAttachment3() {
		return attachment3;
	}

	public void setAttachment3(MultipartFile attachment3) {
		this.attachment3 = attachment3;
	}

	public MultipartFile getAttachment4() {
		return attachment4;
	}

	public void setAttachment4(MultipartFile attachment4) {
		this.attachment4 = attachment4;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

}
