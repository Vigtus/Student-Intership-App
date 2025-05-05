package com.kacpercz.studentintership.Controller;

import com.kacpercz.studentintership.Model.AppUser;
import com.kacpercz.studentintership.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/app-users")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAllAppUsers() {
        return appUserService.findAll();
    }

    @GetMapping("/{id}")
    public AppUser getAppUser(@PathVariable Long id) {
        return appUserService.findById(id);
    }

    @PostMapping
    public AppUser createAppUser(@RequestBody AppUser user) {
        return appUserService.save(user);
    }

    @PutMapping("/{id}")
    public AppUser updateAppUser(@PathVariable Long id, @RequestBody AppUser newData) {
        return appUserService.update(id, newData);
    }

    @DeleteMapping("/{id}")
    public void deleteAppUser(@PathVariable Long id) {
        appUserService.delete(id);
    }
}
