package api.chatop.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DBUser {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String username;
  private String password;
  private String role;

  // Getter pour 'id'
  public Integer getId() {
    return id;
  }

  // Setter pour 'id'
  public void setId(Integer id) {
    this.id = id;
  }

  // Getter pour 'username'
  public String getUsername() {
    return username;
  }

  // Setter pour 'username'
  public void setUsername(String username) {
    this.username = username;
  }

  // Getter pour 'password'
  public String getPassword() {
    return password;
  }

  // Setter pour 'password'
  public void setPassword(String password) {
    this.password = password;
  }

  // Getter pour 'role'
  public String getRole() {
    return role;
  }

  // Setter pour 'role'
  public void setRole(String role) {
    this.role = role;
  }
}
