public class MailInfo {
    Client client;
    int mailcode;
    String info;
    public MailInfo(Client client, int mailcode){
        this.client = client;
        this.mailcode = mailcode;
        this.info = info;
        this.addinf();
    }
    public void addinf(){
        if (this.mailcode == 1) {
            if (this.client.sex == false) {
                if (this.client.age < 18) {
                    this.info = "Happy birthday girl";
                } else {
                    this.info = ("Happy birthday woman");
                }
            }
            if (this.client.sex == true) {
                if (this.client.age < 18) {
                    this.info = "Happy birthday boy";
                } else {
                    this.info = "Happy birthday man";
                }
            }
        }
        else if (this.mailcode == 2) {
            if (this.client.sex == false) {
                if (this.client.age < 18) {
                    this.info = "Hello, there is a great discount on dolls at toys r us";
                } else {
                    this.info = "Hello, there is a great discount on all cosmetic at lorea`l";
                }
            }
            if (this.client.sex == true) {
                if (this.client.age < 18) {
                    this.info = "Hello, there is a great discount on cars at toys r us";
                } else {
                    this.info = "Hello, there is a great discount on all laptops at amazone";
                }
            }
        }

        else{
            System.out.println("INVALIDE CODE");
        }

    }
}
