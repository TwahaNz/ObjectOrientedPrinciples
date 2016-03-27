package srp.disobey.services.implement;

import srp.disobey.domain.Email;
import srp.disobey.services.IDownload;
import srp.disobey.services.IEmailSender;
import srp.disobey.services.IUpload;

/**
 * Created by Admin on 3/27/16.
 */
public class EmailSender implements IEmailSender, IDownload, IUpload {

    private Email email;
    private String uploadContent; //Disobeys the SRP by having a different responsibility such as uploading
    private String downloadContent; //Disobeys the SRP by having a different responsibility such as uploading

    public EmailSender(String to, String from, String message){
        email = new Email(to, from, message);
    }


    public String getAddress(String to) {
        return email.getAddress();
    }

    public String getSender(String from) {
        return email.getFrom();
    }

    public String getMessage(String message) {
        return email.getMessage();
    }

    public String sendMessage(){
        return "Email Successfully Sent To: " + email.getAddress();
    }

    public String getDownloadContent(String download) {
        return download;
    }

    public String getUploadContent(String upload) {
        return uploadContent;
    }
}
