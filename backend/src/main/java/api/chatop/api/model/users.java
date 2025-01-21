package api.chatop.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "dbuser")
public class users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true, nullable = false)
  private String username;

  private String password;
  private String role;
}
