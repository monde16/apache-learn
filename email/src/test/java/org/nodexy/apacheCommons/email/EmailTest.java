package org.nodexy.apacheCommons.email;

import junit.framework.TestCase;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by phoenix on 11/7/16.
 */
public class EmailTest extends TestCase {
    public void testSimpleEmail() {
        Email email = new SimpleEmail();
        email.setHostName("smtp.mail.yahoo.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("ndeoligent21","asdf"));
        email.setSSLOnConnect(true);
        try {
            email.setFrom("ndeoligent21@yahoo.com","Infinity");
            email.setSubject("TestMail: commons mail");
            email.setMsg("This is a test mail ... :-)");
            email.addTo("monde.ngalo@gmail.com");
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
