package com.udem.huerto.services;

import com.udem.huerto.entity.Users;
import com.udem.huerto.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public Optional<Users> findById(int idUser){
        return usersRepository.findById(idUser);

    }

    public void save (Users user){
        usersRepository.save(user);

    }

    public void delete (Users user){
        usersRepository.delete(user);

    }

    public void update (Users user){
        //usersRepository.update(user);

    }
}
