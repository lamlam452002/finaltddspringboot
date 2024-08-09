package stucturalpatterns.facade;

public class EmailService {
    public void SendMail(String mailTo)
    {
        System.out.println("Send an email to "+ mailTo);
    }
}
