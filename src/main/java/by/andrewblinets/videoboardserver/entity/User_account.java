package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Андрей on 10.02.2017.
 */

@Entity
@Table(name = "User_account")
public class User_account {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_user;

    @Column(name = "Name_user", nullable = false)
    private String Name_user;

    @Column(name = "Telephone", nullable = false)
    private String Telephone;

    @Column(name = "Email", nullable = false)
    private String Email;

    @Column(name = "Password", nullable = false)
    private String Password;

    @Column(name = "Country", nullable = false)
    private String Country;

    @Column(name = "City", nullable = false)
    private String City;

    @Column(name = "Language", nullable = false)
    private String Language;

    @Column(name = "Rating", nullable = false)
    private String Rating;


    public User_account() {
    }

    public long getId_user() {
        return Id_user;
    }

    public void setId_user(long id_user) {
        Id_user = id_user;
    }

    public String getName_user() {
        return Name_user;
    }

    public void setName_user(String name_user) {
        Name_user = name_user;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}
