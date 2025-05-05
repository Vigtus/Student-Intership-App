package com.kacpercz.studentintership.Service;

import com.kacpercz.studentintership.Model.TEST;
import com.kacpercz.studentintership.Repo.TESTRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TESTService {

    @Autowired
    TESTRepo repo;

    public List<TEST> getUsers(){
        return repo.findAll();
    }

    public TEST getUserById(Long id){
        return repo.findById(id).orElse(new TEST());
    }

    public void addUser(TEST personKurwa){
        repo.save(personKurwa);
    }

    public void updateUser(TEST personKurwa){
        repo.save(personKurwa);
    }
    public void deleteUser(Long id){
        repo.deleteById(id);
    }

}
