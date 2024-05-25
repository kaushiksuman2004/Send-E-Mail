package com.email.email_api.Model;

public class EmailRequest {

    public String subject;
    public String message;
    public String to;

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public EmailRequest(String subject, String message, String from, String to) {
        this.subject = subject;
        this.message = message;
        this.to = to;
    }

    public EmailRequest() {
    }
    @Override
    public String toString() {
        return "EmailRequest [subject=" + subject + ", message=" + message + ", to=" + to + "]";
    }
    
}
