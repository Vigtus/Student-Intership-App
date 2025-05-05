package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long> {
    // ewentualne metody customowe
}