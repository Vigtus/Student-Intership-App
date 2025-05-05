package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.UserRole;
import com.kacpercz.studentintership.Repo.UserRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserRoleService {

    private final UserRoleRepo userRoleRepo;

    @Autowired
    public UserRoleService(UserRoleRepo userRoleRepo) {
        this.userRoleRepo = userRoleRepo;
    }

    public List<UserRole> findAll() {
        return userRoleRepo.findAll();
    }

    public UserRole findById(Long id) {
        return userRoleRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("UserRole with id " + id + " not found."));
    }

    public UserRole save(UserRole userRole) {
        return userRoleRepo.save(userRole);
    }

    public UserRole update(Long id, UserRole newData) {
        UserRole existing = findById(id);
        existing.setRoleType(newData.getRoleType());
        return userRoleRepo.save(existing);
    }

    public void delete(Long id) {
        if (!userRoleRepo.existsById(id)) {
            throw new RuntimeException("UserRole with id " + id + " not found.");
        }
        userRoleRepo.deleteById(id);
    }
}
