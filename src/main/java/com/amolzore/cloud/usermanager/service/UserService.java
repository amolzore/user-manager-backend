package com.amolzore.cloud.usermanager.service;

import com.amolzore.cloud.usermanager.controller.filter.UserFilterBody;
import com.amolzore.cloud.usermanager.dataaccess.entity.User;
import com.amolzore.cloud.usermanager.dataaccess.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public User findById(int id) {
        return userRepository.findById(id);
    }

    public User findByFilter(UserFilterBody findByFilter) {
        return userRepository.findByFilter(findByFilter);
    }
}