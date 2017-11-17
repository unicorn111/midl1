import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<String> list;
    List<Integer> list2;
    public MailBox(){
        this.list = new ArrayList<String>();
    }
    public void addMaillinfo(MailInfo inf){
        list.add(inf.info);
    }
    public void sendAll(){
        for(int i = 0; i < this.list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
