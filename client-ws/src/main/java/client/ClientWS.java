package client;

import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        final BankService proxy = new BankWS().getBankServicePort();
        System.out.println("Convert Euro to MAD: " + proxy.conversionEuroToMAD(100));

        final Account acc = proxy.getAccount(1);
        System.out.println("*********");
        System.out.println(acc.getBalance());
        System.out.println(acc.getCreationDate());
        System.out.println("*********");

        List<Account> accounts = proxy.getAccounts();
        accounts.forEach(account -> {
            System.out.println("*********");
            System.out.println("Code: "+account.getId());
            System.out.println("Balance: "+account.getBalance());
            System.out.println("Creation Date: "+account.getCreationDate());
            System.out.println("*********");
        });
    }
}
