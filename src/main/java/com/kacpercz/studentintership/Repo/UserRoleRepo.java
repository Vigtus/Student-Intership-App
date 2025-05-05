package com.kacpercz.studentintership.Repo;

import com.kacpercz.studentintership.Model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long> {
}
