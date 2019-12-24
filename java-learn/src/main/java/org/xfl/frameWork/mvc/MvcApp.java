package org.xfl.frameWork.mvc;

import org.xfl.frameWork.mvc.controller.UserApi;
import org.xfl.frameWork.mvc.dao.UserDao;
import org.xfl.frameWork.mvc.dao.UserDaoImpl;
import org.xfl.frameWork.mvc.pojo.User;
import org.xfl.frameWork.mvc.service.IUserService;
import org.xfl.frameWork.mvc.service.UserServiceImpl;

public class MvcApp {
    public static void main(String[] args){
        UserDao dao = new UserDaoImpl();
        IUserService userService = new UserServiceImpl(dao);
        UserApi userApi = new UserApi(userService);
        User user = new User();
        user.setAge(18);
        user.setName("Java");
        user.setSex('男');
        userApi.saveUser(user);
    }
}
