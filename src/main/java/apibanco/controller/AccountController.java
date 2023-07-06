package apibanco.controller;

import apibanco.model.Account;
import apibanco.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/save")
    public ResponseEntity<Void> saveAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }
}
