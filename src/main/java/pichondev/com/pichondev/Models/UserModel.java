package pichondev.com.pichondev.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true,nullable = false)
    private Long id;

    private String name;
    private String password;
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
