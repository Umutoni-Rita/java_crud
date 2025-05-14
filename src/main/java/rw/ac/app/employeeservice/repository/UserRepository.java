package rw.ac.app.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.ac.app.employeeservice.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
