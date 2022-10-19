package com.example.demo.service;

import com.example.demo.bean.UserDtoRequest;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();


    User getIdUser(Integer id);

    void deleteIdUser(Integer id);

    void deleteAllIdUser(Integer id);



    List<User> updateUser(User user);

    List<User> getUserByName(String name);


    List<User> findByNameOrName(UserDtoRequest request);

    User findByNameAndId(String name, Integer id);


    List<User> findByIdIn(UserDtoRequest request);

    List<User> findByNameIgnoreCase(String name);
}
