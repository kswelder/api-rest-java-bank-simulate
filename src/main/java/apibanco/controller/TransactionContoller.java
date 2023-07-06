package apibanco.controller;

import apibanco.model.Transaction;
import apibanco.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionContoller {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/{username}/transactions")
    public ResponseEntity<List<Transaction>> listAllTransactions(@PathVariable("username") String username) {
        return ResponseEntity.status(HttpStatus.OK).body(transactionService.getListTransaction(username));
    }
    @PostMapping("/{username}/transaction/save")
    public ResponseEntity<Void> saveTransaction(@PathVariable("username") String username, @RequestBody Transaction transaction) {
        transactionService.saveTransaction(username, transaction);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
