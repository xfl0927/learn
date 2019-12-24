package org.xfl.frameWork.mvc.controller;

import org.xfl.frameWork.mvc.pojo.User;
import org.xfl.frameWork.mvc.service.IUserService;

public class UserApi {
    private IUserService userService;

    public UserApi(IUserService userService) {
        this.userService = userService;
    }

    public void saveUser(User user){
        userService.saveUser(user);
    }
}
