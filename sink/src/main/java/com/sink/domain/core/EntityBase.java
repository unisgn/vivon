package com.sink.domain.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@MappedSuperclass
@JsonAutoDetect
public class EntityBase {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Version
    private Integer version;
    
    private boolean active;
    
    public Integer getId() {
        return id;
    }
    private void setId(Integer id) { // should only be accessed by Hibernate
        this.id = id;
    }
    public Integer getVersion() {
        return version;
    }
    private void setVersion(Integer version) { // should only be accessed by Hibernate
        this.version = version;
    }

    
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}
