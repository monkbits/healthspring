package com.mymonkmindset.health.User;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//    @Query("SELECT s FROM users s WHERE s.age = ?1")
//    Optional<User> findByAge(int age);

}
