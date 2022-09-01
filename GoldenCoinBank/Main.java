import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Bank clients = new Bank(new HashMap<>() {{
            put(new Client("Алексей"), new Account(866352, 647291));
            put(new Client("Владимир"), new Account(164953, 604849, 102742));
            put(new Client("Всеволод"), new Account(872450));
            put(new Client("Евгений"), new Account(431270, 452178));
            put(new Client("Константин"), new Account(279459));
        }});

        clients.getAccounts(clients, new Client("Евгений"));
        clients.findClient(clients, new Account(604849));
    }
}
