package banco.repository;

import banco.model.ContaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long>{
  /*
  @Query(name = "SELECT u FROM crud u WHERE u.nome=?1")
  Optional<Pessoa> findByNome(@Param(value = "nome") String nome);
  */
}
