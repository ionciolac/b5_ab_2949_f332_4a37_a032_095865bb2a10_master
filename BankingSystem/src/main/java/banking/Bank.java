package banking;

import java.util.HashMap;
import java.util.Map;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
    private Map<Long, Account> accounts;

    public Bank() {
        // complete the function
        this.accounts = new HashMap<>();
    }

    public Account getAccount(Long accountNumber) {
        // complete the function
        return accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        CommercialAccount commercialAccount = new CommercialAccount(company, , pin, startingDeposit);
        accounts.put(commercialAccount.getAccountNumber(), commercialAccount);
        return commercialAccount.getAccountNumber();
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // complete the function
        ConsumerAccount consumerAccount = new ConsumerAccount(person, null, pin,startingDeposit);
        accounts.put(consumerAccount.getAccountNumber(), consumerAccount);
        return consumerAccount.getAccountNumber();
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // complete the function
        return accounts.containsKey(accountNumber);
    }

    public double getBalance(Long accountNumber) {
        // complete the function
        return accounts.get(accountNumber).getBalance();
    }

    public void credit(Long accountNumber, double amount) {
        // complete the function
        accounts.get(accountNumber).creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
        // complete the function
        return accounts.get(accountNumber).debitAccount(amount);
    }
}
