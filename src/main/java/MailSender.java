public class MailSender {
    MailInfo inf;
    Client client;

    public MailSender(MailInfo inf) {
        this.inf = inf;
    }

    public void sendmail(MailInfo inf) {
        System.out.println(inf.info);
    }
}
