package apibanco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Client implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String name;
  private String old;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "account_id")
  private Account account;
}

