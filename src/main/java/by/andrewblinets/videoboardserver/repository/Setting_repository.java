package by.andrewblinets.videoboardserver.repository;

import by.andrewblinets.videoboardserver.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Setting_repository extends JpaRepository<Setting,Long> {
}
