package org.xfl.frameWork.mvc.dao;

import org.xfl.frameWork.mvc.pojo.User;

public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser(User user) {
        System.out.println("Save user info success. " + user.toString());
    }
}
