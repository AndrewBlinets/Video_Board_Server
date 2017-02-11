package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Андрей on 10.02.2017.
 */

@Entity
@Table(name = "Subcategory")
public class Subcategory {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id_Subcategory;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "Categories_id", nullable = false)
    private Categories Categories_id;

    @Column(name = "Name_Subcategory", nullable = false)
    private String Name_Subcategory;

    @Column(name = "sort_id")
    private int Sort_id;

    public Subcategory() {
    }

    public Categories getCategories_id() {
        return Categories_id;
    }

    public void setCategories_id(Categories categories_id) {
        Categories_id = categories_id;
    }

    public long getId_Subcategory() {
        return Id_Subcategory;
    }

    public void setId_Subcategory(long id_Subcategory) {
        Id_Subcategory = id_Subcategory;
    }

    public String getName_Subcategory() {
        return Name_Subcategory;
    }

    public void setName_Subcategory(String name_Subcategory) {
        Name_Subcategory = name_Subcategory;
    }

    public int getSort_id() {
        return Sort_id;
    }

    public void setSort_id(int sort_id) {
        Sort_id = sort_id;
    }
}
