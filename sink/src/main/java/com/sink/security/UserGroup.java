package com.sink.domain.core;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table
public class UserGroup extends EntityBase {

    private String name;

    @ManyToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST})
    @JoinTable(
            name="usergroup_members",
            joinColumns=@JoinColumn(name="usergroup_id"),
            inverseJoinColumns=@JoinColumn(name="user_id") )
    private Set<User> members = new HashSet<User>();
    
    @ManyToMany(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST})
    @JoinTable(
            name="usergroup_permissions",
            joinColumns=@JoinColumn(name="usergroup_id"),
            inverseJoinColumns=@JoinColumn(name="permission_id"))
    private Set<Permission> permissions = new HashSet<Permission>();
    
    public UserGroup() {}
    
    public UserGroup(String name) { this.name = name; }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getMembers() {
        return members;
    }

    public void setMembers(Set<User> members) {
        this.members = members;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
    

    
    
}
