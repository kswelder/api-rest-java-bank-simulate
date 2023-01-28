package apibanco.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ExceptionMessage implements Serializable {
  private HttpStatus status;
  private String message;
  private LocalDateTime date;

  public ExceptionMessage(
      HttpStatus status,
      LocalDateTime date,
      String message
  ) {
    this.status = status;
    this.date = date;
    this.message = message;
  }
}
