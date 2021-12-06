import java.util.ArrayList;
public class Clinic {
    public static void main(String[] args) {
        Client client = new Client (Type.КОТ, "Барсик", 9);
        Client client1 = new Client (Type.ПОПУГАЙ, "Кеша", 12);
        Client client2 = new Client (Type.СОБАКА, "Шарик", 7);
        Client client3 = new Client (Type.КОТ, "Васька", 5);
        client.print ();
        client1.print ();
        client2.print ();
        client3.print ();
        System.out.println ("ВСЕГО животных прошедших осмотр  " + Admin.sum ());
        ArrayList<Client> clients = new ArrayList<> ();
        clients.add (client);
        clients.add (client1);
        clients.add (client2);
        clients.remove (client3);
        System.out.println ("ЖИВОТНЫХ В СТАЦИОНАРЕ : " + "\n" +clients);
        System.out.println ("ИТОГО В СТАЦИОНАРЕ ОСТАЛОСЬ " + clients.size () + " животных");
    }
}


