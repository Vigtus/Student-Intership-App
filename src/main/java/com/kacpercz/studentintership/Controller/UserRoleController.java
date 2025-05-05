package com.kacpercz.studentintership.Controller;


import com.kacpercz.studentintership.Model.UserRole;
import com.kacpercz.studentintership.Service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user-roles")
public class UserRoleController {

    private final UserRoleService userRoleService;

    @Autowired
    public UserRoleController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @GetMapping
    public List<UserRole> getAllUserRoles() {
        return userRoleService.findAll();
    }

    @GetMapping("/{id}")
    public UserRole getUserRole(@PathVariable Long id) {
        return userRoleService.findById(id);
    }

    @PostMapping
    public UserRole createUserRole(@RequestBody UserRole userRole) {
        return userRoleService.save(userRole);
    }

    @PutMapping("/{id}")
    public UserRole updateUserRole(@PathVariable Long id, @RequestBody UserRole newData) {
        return userRoleService.update(id, newData);
    }

    @DeleteMapping("/{id}")
    public void deleteUserRole(@PathVariable Long id) {
        userRoleService.delete(id);
    }
}
