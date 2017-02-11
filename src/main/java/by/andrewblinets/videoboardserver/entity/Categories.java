package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Андрей on 10.02.2017.
 */

@Entity
@Table(name = "Category")
public class Categories {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_Category;


    @Column(name = "Name_Category", nullable = false)
    private String Name_Category;

    @Column(name = "sort_id")
    private int Sort_id;

    public Categories() {
    }

    public long getId_Category() {
        return Id_Category;
    }

    public void setId_Category(long id_Category) {
        Id_Category = id_Category;
    }

    public String getName_Category() {
        return Name_Category;
    }

    public void setName_Category(String name_Category) {
        Name_Category = name_Category;
    }

    public int getSort_id() {
        return Sort_id;
    }

    public void setSort_id(int sort_id) {
        Sort_id = sort_id;
    }
}
