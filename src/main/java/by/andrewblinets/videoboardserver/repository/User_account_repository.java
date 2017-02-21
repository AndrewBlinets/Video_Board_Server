package by.andrewblinets.videoboardserver.repository;

import by.andrewblinets.videoboardserver.entity.User_account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface User_account_repository extends JpaRepository<User_account,Long> {
}
