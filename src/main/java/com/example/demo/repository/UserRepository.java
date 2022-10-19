package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    List<User> findByName(String name);
    List<User> findByNameIgnoreCase(String name);
    User findByNameAndId(String name, Integer id);
//    List<User> findByIsActiveTrue();
//    User findBySalary(Integer salaryId);
   List<User> findByNameOrName(String name1, String name2);
    List<User> findByIdIn(List<Integer> ids);
//
//    List<User> findByIdAndNameInAndIsActive(Integer id, List<String> names, Boolean isActive);
}
