package com.sink.domain.core;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@MappedSuperclass
public class EntityAuditable extends EntityBase {
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreate;
    public Date getDateOfCreate() { return this.dateOfCreate; }
    @JsonIgnore public void setDateOfCreate(Date date) { this.dateOfCreate = date; }
    
    private User createdBy;
    public User getCreatedBy() { return this.createdBy; }
    @JsonIgnore public void setCreatedBy(User user) { this.createdBy = user; }
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfLastUpdate;
    public Date getDateOfLastUpdate() { return this.dateOfLastUpdate; }
    @JsonIgnore public void setDateOfLastUpdate(Date date) { this.dateOfLastUpdate = date; }
    
    private User lastUpdatedBy;
    public User getLastUpdatedBy() { return this.lastUpdatedBy; }
    @JsonIgnore public void setLastUpdatedBy(User user) { this.lastUpdatedBy = user; }
}
