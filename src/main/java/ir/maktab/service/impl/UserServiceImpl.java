package ir.maktab.service.impl;

import ir.maktab.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.domain.User;
import ir.maktab.repository.UserRepository;
import ir.maktab.service.UserService;

import java.util.Objects;

public class UserServiceImpl extends BaseEntityServiceImpl<User, Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User login(String username, String password) throws Exception {
        User user = repository.findByUsername(username);
        if(Objects.isNull(user))
            throw new NullPointerException("\n----------------------------------" +
                    "\nYour username is wrong!\n" +
                    "----------------------------------\n");
        else if(!user.getPassword().equals(password))
            throw new Exception("\n----------------------------------" +
                    "\nYour password is wrong!\n" +
                    "----------------------------------\n");
        else return user;
    }
}
