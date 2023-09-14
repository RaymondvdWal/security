package com.example.controllerles10.repository;



import com.example.controllerles10.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
