package by.andrewblinets.videoboardserver.repository;

import by.andrewblinets.videoboardserver.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Андрей on 16.02.2017.
 */
public interface Subcategories_repository extends JpaRepository<Subcategory,Long> {

    @Query("SELECT s FROM Subcategory s where s.Categories_id.Id_Category = :Categories_id")
    List<Subcategory> findByName(@Param("Categories_id") long Categories_id);
}
