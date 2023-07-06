package apibanco.controller;

import apibanco.model.Account;
import apibanco.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/list")
    public ResponseEntity<List<Account>> listAccounts() {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.list());
    }
    @GetMapping("/find/{username}")
    public ResponseEntity<Account> findAccount(@PathVariable("username") String username) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.findAccount(username));
    }
    @PostMapping("/save")
    public ResponseEntity<Void> saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
    @PutMapping("/{username}/update")
    public ResponseEntity<Void> updateAccount(@PathVariable("username") String username, @RequestBody Account account) {
        accountService.updateAccount(username, account);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
