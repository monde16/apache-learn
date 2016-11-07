package org.ngam.emailSender;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.ArrayList;
import java.util.Collection;

class EmailSender {
	public static void main(String[] args) {
		if (args.length != 3) return;
		String from=args[0],to=args[1],msg=args[2];
		if (!isEmail(from) || !isEmail(to)) System.exit(1);
		SimpleEmail sm = new SimpleEmail();
		try {
            Collection<InternetAddress> recipients = new ArrayList<>();
            recipients.add(new InternetAddress(to));
			sm.setFrom(from);
			sm.setTo(recipients);
			sm.setMsg(msg);
		} catch (EmailException e) {
            System.err.println("Error : "+e);
        } catch (AddressException e) {
            System.err.println("Error : "+e);
        }
    }
	private static boolean isEmail(String str) {
		return str.indexOf('@')!=-1 && str.indexOf(' ')==-1;
	}
}
