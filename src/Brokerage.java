import java.util.ArrayList;
import java.util.Random;

public class Brokerage {

    ArrayList<Client> clients = new ArrayList<>();

    public Brokerage(){
        setClients(clients);
    }
    public static double randomNetworth(int id){
        Random r = new Random();
        if (id >= 0 && id < 3574){ // top 57% , unlimited trades
            return r.nextGaussian() * 5000.0 + 30000.0;
        }else{
            return r.nextGaussian() * 5000.0 + 19999.0;
        }

    }
    public static void setClients(ArrayList<Client> clients) {
        int i = -1;
        while(i++ < 6270){
            clients.add(new Client(i, randomNetworth(i)));
            System.out.println(clients.get(i));
        }

    }
    public static void main (String [] args){
        Brokerage b = new Brokerage();
        setClients(b.clients);
    }
}