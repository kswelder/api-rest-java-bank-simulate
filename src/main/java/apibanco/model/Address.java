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
public class Address implements Serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String uf;
  private String city;
  private String street;
  private Integer number;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "account_id")
  private Account account;
}

