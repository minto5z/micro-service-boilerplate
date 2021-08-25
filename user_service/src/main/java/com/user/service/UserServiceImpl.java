package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list = List.of(
            new User(1405L, "Minto", "01733333333"),
            new User(1406L, "Jaman", "01744444444"),
            new User(1407L, "Mahadiur", "01755555555")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
