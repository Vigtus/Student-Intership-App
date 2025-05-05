package com.kacpercz.studentintership.Controller;

import com.kacpercz.studentintership.Model.TEST;
import com.kacpercz.studentintership.Service.TESTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TESTController {

    @Autowired
    TESTService userService;

    @GetMapping("/users")
    public List<TEST> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public TEST getUser(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@RequestParam Long id){
        userService.deleteUser(id);
    }

}
