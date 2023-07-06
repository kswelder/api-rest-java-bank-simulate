package apibanco.service;

import apibanco.model.Account;
import apibanco.model.Transaction;
import apibanco.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private AccountService accountService;
    public void saveTransaction(String username, Transaction transaction) {
        Account account = accountService.findAccount(username);
        transaction.setAccount(account);
        transaction.setCreatedAt(LocalDateTime.now());
        transactionRepository.save(transaction);
    }
    public List<Transaction> getListTransaction(String username) {
        Account account = accountService.findAccount(username);
        return account.getTransactions();
    }
}
