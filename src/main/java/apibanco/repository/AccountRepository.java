package apibanco.repository;

import apibanco.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
//import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    Account findByUsername(String username);
}
