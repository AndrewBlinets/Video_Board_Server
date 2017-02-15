package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Андрей on 14.02.2017.
 */

@Entity
@Table (name = "Role")
public class Role {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_role;

    @Column (name = "Name_rol", nullable = false)
    private String Name_rol;

    @ManyToMany(mappedBy = "role")
    private Set<Account> accounts;

    public Role() {
    }

    public long getId_role() {
        return Id_role;
    }

    public void setId_role(long id_role) {
        Id_role = id_role;
    }

    public String getName_rol() {
        return Name_rol;
    }

    public void setName_rol(String name_rol) {
        Name_rol = name_rol;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }
}
