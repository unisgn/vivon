package com.sink.repository.core;

import com.sink.domain.core.User;

public interface UserRepository extends AdvancedGenericRepository<User> {
    public User findUserByName(String name);
}
