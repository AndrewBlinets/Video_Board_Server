package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Андрей on 10.02.2017.
 */

@Entity
@Table(name = "Advertisement")
public class Advertisement {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_advertisement;

    @Column(name = "Title", nullable = false)
    private String Title;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "User_id", nullable = false)
    private User_account User_id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "Subcategory_id", nullable = false)
    private Subcategory Subcategory_id;

    @Column(name = "Price", nullable = false)
    private String Price;

    @Column(name = "Information")
    private String Information;

    @Column(name = "URL", nullable = false)
    private String URL;

    @Column(name = "Add_date", nullable = false)
    private Date Add_date;

    @Column(name = "Rating", nullable = false)
    private String Rating;

    public Advertisement() {
    }

    public User_account getUser_id() {
        return User_id;
    }

    public void setUser_id(User_account user_id) {
        User_id = user_id;
    }

    public Subcategory getSubcategory_id() {
        return Subcategory_id;
    }

    public void setSubcategory_id(Subcategory subcategory_id) {
        Subcategory_id = subcategory_id;
    }

    public long getId_advertisement() {
        return Id_advertisement;
    }

    public void setId_advertisement(long id_advertisement) {
        Id_advertisement = id_advertisement;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Date getAdd_date() {
        return Add_date;
    }

    public void setAdd_date(Date add_date) {
        Add_date = add_date;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}
