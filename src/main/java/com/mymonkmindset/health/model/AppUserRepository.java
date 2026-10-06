package com.mymonkmindset.health.model;

import com.mymonkmindset.health.entity.AppUser;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@Transactional( )
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
