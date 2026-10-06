package com.mymonkmindset.health.model;

import com.mymonkmindset.health.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//    @Query("SELECT s FROM users s WHERE s.age = ?1")
//    Optional<User> findByAge(int age);

}
