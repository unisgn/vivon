package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Contact extends EntityAuditable {

    private String title;
    private String name;
    
    @JsonIgnore
    private Partner partner;
    private String jobTitle;
    
    private Set<Scn> scns = new HashSet<Scn>();

}
