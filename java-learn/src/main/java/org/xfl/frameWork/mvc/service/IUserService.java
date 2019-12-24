package org.xfl.frameWork.mvc.service;

import org.xfl.frameWork.mvc.dao.UserDao;
import org.xfl.frameWork.mvc.pojo.User;

public interface IUserService {
    void saveUser(User user);
}
