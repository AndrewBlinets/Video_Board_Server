package by.andrewblinets.videoboardserver.repository;

import by.andrewblinets.videoboardserver.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Андрей on 16.02.2017.
 */
public interface Categories_repository extends JpaRepository<Categories,Long> {
}
