package by.andrewblinets.videoboardserver.repository;

import by.andrewblinets.videoboardserver.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Андрей on 19.02.2017.
 */
public interface Account_repository extends JpaRepository<Account, Long> {
}
