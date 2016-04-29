package com.test.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.model.User;
import com.test.mongodb.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "insertUser", method = RequestMethod.GET)
    public int insertUser(User user) {
        try {
            return userService.insertUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 1;
        }
    }

    @RequestMapping(value = "findUserById", method = RequestMethod.GET)
    public User findUserById(String id) {
        try {
            return userService.findUserById(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "addOrUpdateUser", method = RequestMethod.GET)
    public int addOrUpdateUser(User user) {
        try {
            return userService.addOrUpdateUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 1;
        }
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.GET)
    public int updateUser(User user) {
        try {
            return userService.updateUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 1;
        }
    }

    @RequestMapping(value = "deleteUser", method = RequestMethod.GET)
    public int deleteUser(String id) {
        try {
            return userService.deleteUser(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return 0;
        }
    }

}
