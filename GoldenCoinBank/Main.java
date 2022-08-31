import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Bank clients = new Bank(new HashMap<Client, Account>()
        {{
            put(new Client("�������"), new Account(866352, 647291));
            put(new Client("��������"), new Account(164953, 604849, 102742));
            put(new Client("��������"), new Account(872450));
            put(new Client("�������"), new Account(431270, 452178));
            put(new Client("���������"), new Account(279459));
        }});

        clients.getAccounts(clients, new Client("��������"));
        clients.findClient(clients, new Account(164953));
    }
}
