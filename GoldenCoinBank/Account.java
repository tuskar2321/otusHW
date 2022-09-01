import java.util.ArrayList;
import java.util.List;

public class Account {
    private ArrayList<Integer> accounts;

    Account(Integer ... numbers){
        this.accounts = new ArrayList<Integer>();
        this.accounts.addAll(List.of(numbers));
    }

    public ArrayList<Integer> getAccounts() {
        return accounts;
    }
}
