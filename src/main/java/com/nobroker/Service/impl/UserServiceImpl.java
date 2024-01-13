package com.nobroker.Service.impl;

import com.nobroker.Entity.User;
import com.nobroker.Payload.UserDto;
import com.nobroker.Repository.UserRepository;
import com.nobroker.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepository userRepository;
    @Override
    public long createUser(UserDto userDto) {
        User user = maptoEntity((userDto));
        User savedUser = userRepository.save(user);
        return savedUser.getId();
    }

    User maptoEntity(UserDto userDto){
        User user = modelMapper.map(userDto, User.class);
return user;
    }
}
