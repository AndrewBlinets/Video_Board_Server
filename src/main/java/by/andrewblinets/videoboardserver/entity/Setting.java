package by.andrewblinets.videoboardserver.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Андрей on 11.02.2017.
 */

@Entity
@Table(name = "Setting")
public class Setting {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long Id;

    @Column(name = "Size_file", nullable = false)
    private String Size_file;

    @Column(name = "Count_file", nullable = false)
    private String Count_file;

    public Setting() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getSize_file() {
        return Size_file;
    }

    public void setSize_file(String size_file) {
        Size_file = size_file;
    }

    public String getCount_file() {
        return Count_file;
    }

    public void setCount_file(String count_file) {
        Count_file = count_file;
    }
}
