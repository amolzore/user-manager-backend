package com.amolzore.cloud.usermanager.dataaccess.repository;

import com.amolzore.cloud.usermanager.controller.filter.UserFilterBody;
import com.amolzore.cloud.usermanager.dataaccess.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class UserRepository implements CrudRepository {
    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public Iterable save(Iterable iterable) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void delete(Iterable iterable) {

    }

    @Override
    public void deleteAll() {

    }

    public User findById(int id) {
        User user = null;
        if (id == 190919) {
            user = new User(190919, "zore.amol@gmal.com", "Welcome@1");
        }
        return user;
    }

    public User findByFilter(UserFilterBody findByFilter) {
        User user = null;
        if (findByFilter.getUsername().equals("zore.amol@gmail.com") && findByFilter.getPassword().equals("Welcome@1")) {
            user = new User(190919, "zore.amol@gmal.com", "Welcome@1");
        }
        return user;
    }
}