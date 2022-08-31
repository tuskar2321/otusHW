import java.util.HashMap;
import java.util.Map;

public class Bank {
    HashMap<Client, Account> clientsInfo;

    public Bank(HashMap <Client, Account> clients) {
        this.clientsInfo = clients;
    }

    public void getAccounts(Bank clients, Client match){
        int counter = 0;
        for (Map.Entry<Client, Account> entry : clients.clientsInfo.entrySet()){
            if (entry.getKey().equals(match)){
                System.out.println("Клиент " + match.getName() + " найден! А вот и его доступные счета: " + entry.getValue().accounts.toString());
                ++counter;
            }
        }
        if (counter == 0) {
        System.out.println("Клиент с именем " + match.getName() + " не обнаружен :с");
        }
    }

    public void findClient(Bank clients, Account match){
        int counter = 0;
        int accId = match.accounts.get(0);

        for(Map.Entry<Client, Account> entry : clients.clientsInfo.entrySet()){
            if (entry.getValue().getAccounts().contains(accId)){
                System.out.println("Найден клиент с номером счета " + match.getAccounts() + " . Его имя - " + entry.getKey().getName());
            ++counter;
            }
        }
        if (counter == 0) {
            System.out.println("Клиент с номером счета " + match.getAccounts() + " не обнаружен :с");
        }
    }
}
