package com.example.demo.controller;

import com.example.demo.bean.UserDtoRequest;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save/user")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user) ;
    }
    @GetMapping("/get/all/users/")
    public List<User> getAll(){
        return userService.getAllUser();
    }
    @GetMapping("/get/id/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return  userService.getIdUser(id);
    }
    @DeleteMapping("/delete/by/id/{id}")
    public void deleteUserById(@PathVariable Integer id){
          userService.deleteIdUser(id);
    }
    @DeleteMapping("/delete/all/{id}")
    public void deleteAllUserById(@PathVariable Integer id){
        userService.deleteAllIdUser(id);
    }
    @PutMapping("/update/user")
    public List<User> updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/get/user/by/name/{name}")
    public List<User> getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/user/by/two/name")
    public List<User> findByNameOrName(@RequestBody UserDtoRequest request ){
        return userService.findByNameOrName(request);
    }
    @PostMapping("/user/by/two/id/name")
    public User findByNameAndId(@RequestParam String name,@RequestParam Integer id){
        return userService.findByNameAndId(name,id);
    }
    @GetMapping("/get/by/id/{id}")
    public List<User> findByIdIn(@RequestBody UserDtoRequest request) {
        return userService.findByIdIn(request);
    }
    @GetMapping("/get/user/by/ignore/name/case")
    public List<User> findByNameIgnoreCase(@PathVariable String name){
        return userService.findByNameIgnoreCase(name);
    }
    

}
