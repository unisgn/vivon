package com.sink.domain.core;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Bom extends EntityBase {

    @JsonIgnore
    private Material material;
    
    @Transient
    private String partName;
    
    private Set<BomItem> items = new HashSet<BomItem>();
    
    private Bom parentNode;
    private Set<Bom> childNodes = new HashSet<Bom>();
    private boolean leaf;       // true if have no child node
    
}
