package com.example.demo.service.impl;

import com.example.demo.bean.UserDtoRequest;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return repository.findAll();
    }

    @Override
    public User getIdUser(Integer id) {
        return  repository.getById(id);
    }

    @Override
    public void deleteIdUser(Integer id) {
         repository.deleteById(id); ;
    }

    @Override
    public void deleteAllIdUser(Integer id) {
        repository.deleteById(id);
    }
    @Override
    public List<User> updateUser(User user) {
        return null;
    }

    @Override
    public List<User> getUserByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<User> findByNameOrName(UserDtoRequest request) {
        return repository.findByNameOrName(request.getName1(),request.getName2());

    }

    @Override
    public User findByNameAndId(String name, Integer id) {
        return repository.findByNameAndId(name,id);
    }

    @Override
    public List<User> findByIdIn(UserDtoRequest request) {
        return repository.findByIdIn(request.getId());
    }

    @Override
    public List<User> findByNameIgnoreCase(String name) {
        return repository.findByNameIgnoreCase(name);
    }


}
