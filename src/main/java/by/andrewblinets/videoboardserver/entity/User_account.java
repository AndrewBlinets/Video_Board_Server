package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Андрей on 14.02.2017.
 */

@Entity
@Table(name = "User_table")
public class User_account {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_user;


    @OneToOne
    @JoinColumn(name = "Id_account")
    private Account id_account;


    @Column(name = "Name_User", nullable = false)
    private String Name;

    @Column(name = "Surname_user", nullable = false)
    private String Surname;

    @Column(name = "phone", nullable = false)
    private String Phone;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "Country", nullable = false)
    private long Country;

    @Column(name = "City", nullable = false)
    private long City;

    @Column(name = "Language", nullable = false)
    private long Language;

    @Column(name = "Rating", nullable = false)
    private long Rating;

    @Column(name = "Datareg", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date Data_time_reg;

    @Column(name = "Token_kod")
    private String Token;

    public User_account() {
    }

    public long getId_user() {
        return Id_user;
    }

    public void setId_user(long id_user) {
        Id_user = id_user;
    }

    public Account getId_account() {
        return id_account;
    }

    public void setId_account(Account id_account) {
        this.id_account = id_account;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getCountry() {
        return Country;
    }

    public void setCountry(long country) {
        Country = country;
    }

    public long getCity() {
        return City;
    }

    public void setCity(long city) {
        City = city;
    }

    public long getLanguage() {
        return Language;
    }

    public void setLanguage(long language) {
        Language = language;
    }

    public long getRating() {
        return Rating;
    }

    public void setRating(long rating) {
        Rating = rating;
    }

    public Date getData_time_reg() {
        return Data_time_reg;
    }

    public void setData_time_reg(Date data_time_reg) {
        Data_time_reg = data_time_reg;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
