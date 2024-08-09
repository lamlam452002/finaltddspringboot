package stucturalpatterns.facade;

public class ShopFacade {
    private static ShopFacade instance;
    public static ShopFacade getInstance()
    {
        if(instance==null)
            instance = new ShopFacade();
        return instance;
    }

    private AccountService accountService;
    private EmailService emailService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private SmsService smsService;

    private ShopFacade()
    {
        accountService = new AccountService();
        emailService = new EmailService();
        paymentService =new PaymentService();
        shippingService = new ShippingService();
        smsService = new SmsService();
    }

    public void buyProductByCashWithFreeShipping(String email)
    {
        accountService.GetAccount(email);
        paymentService.PaymentByCash();
        shippingService.FreeShipping();
        emailService.SendMail(email);
        System.out.println("Done");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone)
    {
        accountService.GetAccount(email);
        paymentService.PaymentByPaypal();
        shippingService.StandardShipping();
        emailService.SendMail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done");
    }
}
