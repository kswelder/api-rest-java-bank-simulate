package apibanco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Transaction implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String operacao;
  private String para;
  private Double valor;
  private LocalDateTime createdAt;

  @ManyToOne
  @JoinColumn(name = "account_id")
  private Account account;
}

