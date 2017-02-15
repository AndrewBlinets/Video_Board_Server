package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Андрей on 14.02.2017.
 */

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_account;

    @OneToOne(mappedBy = "id_account")
    private User_account id_user;

    @Column(name = "Login", nullable = false)
    private String Login;

    @Column(name = "Password", nullable = false)
    private String Password;

    @Transient
    private String confirmPassword;

    @ManyToMany
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> role;

    public Account() {
    }

    public long getId_account() {
        return Id_account;
    }

    public void setId_account(long id_account) {
        Id_account = id_account;
    }

    public User_account getId_user() {
        return id_user;
    }

    public void setId_user(User_account id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
