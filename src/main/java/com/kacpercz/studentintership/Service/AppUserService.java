package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.AppUser;
import com.kacpercz.studentintership.Repo.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppUserService {

    private final AppUserRepo appUserRepo;

    @Autowired
    public AppUserService(AppUserRepo appUserRepo) {
        this.appUserRepo = appUserRepo;
    }

    public List<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    public AppUser findById(Long id) {
        return appUserRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("AppUser with id " + id + " not found."));
    }

    public AppUser save(AppUser user) {
        return appUserRepo.save(user);
    }

    public AppUser update(Long id, AppUser newData) {
        AppUser existing = findById(id);
        existing.setPesel(newData.getPesel());
        existing.setFirstName(newData.getFirstName());
        existing.setLastName(newData.getLastName());
        existing.setEmail(newData.getEmail());
        existing.setPassword(newData.getPassword());
        existing.setRole(newData.getRole());
        return appUserRepo.save(existing);
    }

    public void delete(Long id) {
        if (!appUserRepo.existsById(id)) {
            throw new RuntimeException("AppUser with id " + id + " not found.");
        }
        appUserRepo.deleteById(id);
    }
}
