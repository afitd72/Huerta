package com.udem.huerto.controller;

import com.udem.huerto.entity.Users;
import com.udem.huerto.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {
    @Autowired
    private UsersServices usersServices;
    @GetMapping("/Users/(idUser)")
    public List<Users> findAll(){
        return usersServices.findAll();

    }
    @GetMapping("/(idUser)")
    public Optional<Users> findById(@PathVariable int idUser){
        return usersServices.findById( idUser);

    }
    @PostMapping("/")
    public void save (@RequestBody Users users){
        usersServices.save( users);

    }
    @DeleteMapping("/(idUser)")
    public void delete (Users users){
        usersServices.delete(users);

    }
    @PutMapping("/(idUser)")
    public void update (@RequestBody Users users, @PathVariable int idUser){
        usersServices.update(users);

    }

}
