package com.sink.domain.core;

import javax.persistence.*;

import com.sink.lib.core.BuildInUser;


/**
 * !!important: for some particular reason, there are some build in users, see {@link BuildInUser};
 * @author root
 *
 */
@Entity
@Table
public class User extends EntityBase {

    private String username;
    private String password;
    
    private DroidAssistant assistant;
    
    public User() {}
    
    public User(String name, String pw) {
        this.username = name;
        this.password = pw;
    }
    
    
}
