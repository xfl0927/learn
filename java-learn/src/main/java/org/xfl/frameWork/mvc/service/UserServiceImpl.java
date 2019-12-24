package org.xfl.frameWork.mvc.service;

import org.xfl.frameWork.mvc.dao.UserDao;
import org.xfl.frameWork.mvc.pojo.User;

public class UserServiceImpl implements IUserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
