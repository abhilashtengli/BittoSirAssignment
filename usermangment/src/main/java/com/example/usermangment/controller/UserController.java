package com.example.usermangment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usermangment.model.UserModel;
import com.example.usermangment.service.UserService;

@RestController
@RequestMapping("api/userMangement")
public class UserController {
@Autowired
private UserService userService;

@GetMapping("/UserId/{userId}")
public UserModel getUser(@PathVariable int userId){
    return userService.getUser(userId);
}
@PostMapping("/addUser")
public void addUser(@RequestBody UserModel userModel){
    userService.addUser(userModel);

}
@GetMapping("/getAllUser")
public List<UserModel> getAllUser(){
    return userService.getAll();
}
@PutMapping("/Update/UserId/{userId}")
public void updateUser(@PathVariable int userId, @RequestBody UserModel userModel){
    userService.updateUser(userId,userModel);
}
@DeleteMapping("Delete/userId/{userId}")
public void deleteUser(@PathVariable int userId){
    userService.deleteTheUser(userId);
}
}
