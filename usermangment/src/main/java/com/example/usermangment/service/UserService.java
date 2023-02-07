package com.example.usermangment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.usermangment.model.UserModel;
@Service
public class UserService {

    static ArrayList<UserModel> list = new ArrayList<>();
    static {
        list.add(new UserModel(01, "Abhilash-1", "abhilash01", "bengaluru", "123456789"));
        list.add(new UserModel(02, "Abhilash-2", "abhilash02", "chennai", "6541651615"));
        list.add(new UserModel(03, "Abhilash-3", "abhilash03", "Goa", "5611984894"));
        list.add(new UserModel(04, "Abhilash-4", "abhilash04", "Ahmedabad", "5198498454"));
        list.add(new UserModel(05, "Abhilash-5", "abhilash05", "Delhi", "9849884184"));
    }
    public UserModel getUser(int userId) {
        return list.stream().filter(t -> t.getUserId() == userId).findFirst().get();
    }
    public void addUser(UserModel userModel) {
        list.add(userModel);
    }
    public List<UserModel> getAll() {
        return list;
    }
    public void updateUser(int userId, UserModel newUser) {
        UserModel userModel = getUser(userId);

        // userModel.setUserId(newUser.getUserId());
        userModel.setName(newUser.getName());
        userModel.setUserName(newUser.getUserName());
        userModel.setAddress(newUser.getAddress());
        userModel.setPhnNum(newUser.getPhnNum());

    }
    public void deleteTheUser(int userId) {
        Predicate<? super UserModel> predicate = model -> model.getUserId() == userId;
        list.removeIf(predicate);
    }
}
