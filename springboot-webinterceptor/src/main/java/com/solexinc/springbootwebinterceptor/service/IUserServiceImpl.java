package com.solexinc.springbootwebinterceptor.service;

import com.solexinc.springbootwebinterceptor.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Override
    public Boolean dologin(String username, String password) {
        if("abc".equals(username) && "123".equals(password))
        {
            return true;
        }

        return false;
    }
}
