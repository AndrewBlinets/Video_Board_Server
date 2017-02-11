package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Андрей on 10.02.2017.
 */

@Entity
@Table(name = "Admin_account")
public class Admin_account {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_admin;

    @Column(name = "Name_admin", nullable = false)
    private String Name_admin;

    @Column(name = "Password", nullable = false)
    private String Password;

    @Column(name = "Login", nullable = false)
    private String Login;

    public Admin_account() {
    }

    public long getId_admin() {
        return Id_admin;
    }

    public void setId_admin(long id_admin) {
        Id_admin = id_admin;
    }

    public String getName_admin() {
        return Name_admin;
    }

    public void setName_admin(String name_admin) {
        Name_admin = name_admin;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }
}
