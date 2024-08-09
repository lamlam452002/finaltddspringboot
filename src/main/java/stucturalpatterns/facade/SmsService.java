package stucturalpatterns.facade;

public class SmsService {
    public void sendSMS(String mobileNumber)
    {
        System.out.println("Sending an message to "+ mobileNumber);
    }
}
