import java.util.ArrayList;

public class BankApplication implements Comparable<BankApplication>{
    public String name;
    public ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void removeAccount(int i) {
        accounts.remove(i);
    }

    public Account getMaxAccount() {
        double maxBalance = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getBalance() > maxBalance) maxBalance = accounts.get(i).getBalance();
        }
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getBalance() == maxBalance) return accounts.get(i);
        }
        return null;
    }

    public double getAverageBalance() {
        double sumBalance = 0;
        for(int i = 0; i < accounts.size(); i++){
            sumBalance = sumBalance + accounts.get(i).getBalance();
        }

        return sumBalance / accounts.size();

    }

    public double getTotalBalance() {
        double sumBalance = 0;
        for(int i = 0; i < accounts.size(); i++){
            sumBalance = sumBalance + accounts.get(i).getBalance();
        }
        return sumBalance;
    }

    public int totalAccounts() {
        return accounts.size();
    }

    String getBankData() {
        return "Name of the bank: " + name + "\n" + "Quantity of accounts: " + totalAccounts() + "\n" +
                "Total balance of all accounts: " + getTotalBalance() + "\n" + "Average balance: " + getAverageBalance() + "\n";
    }

    @Override
    public int compareTo(BankApplication ba) {
        if(getAverageBalance() == ba.getAverageBalance()) return 0;
        if(getAverageBalance() < ba.getAverageBalance()) return 1;
        return -1;
    }
}
