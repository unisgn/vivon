package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Category extends EntityBase {
    
    @JsonProperty("text")
    private String name;
    
    private boolean leaf;
    
    @JsonIgnore
    @ManyToOne(fetch=FetchType.EAGER, cascade={CascadeType.PERSIST})
    @JoinColumns(value={@JoinColumn(name="parent_id")})
    private Category parent;
    
    @OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.ALL}, targetEntity=Category.class)
    @JoinColumns(value={@JoinColumn(name="child_id")})
    private Set<Category> children = new HashSet<Category>();
    
    public Category() {}
    public Category(String s) { this.name =s; }
    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Category> getChildren() {
        return children;
    }
    public void setChildren(Set<Category> children) {
        this.children = children;
    }
    public boolean isLeaf() {
        return leaf;
    }
    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }
    public Category getParent() {
        return parent;
    }
    public void setParent(Category parent) {
        this.parent = parent;
    }
    
    
}
