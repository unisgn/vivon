package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Material extends EntityAuditable {

    @Column(nullable=false)
    private String number;
    
    private String code;
    
    @Column(nullable=false)
    private String name;
    private String searchKey;
    
    private String searchField;
    

    private MaterialCategory category;
    private Set<MaterialPropertyValue> propertySet = new HashSet<MaterialPropertyValue>();
    
    private Uom uom;
    
    private Bom bom;
    
    // assembly also means has a bom;
    private boolean assembly;
    
    private Set<MaterialStorageInfo> storageInfo = new HashSet<MaterialStorageInfo>();
    
    private BigDecimal instantValue;
    
    private Set<Note> privateNotes = new HashSet<Note>();
    private Set<Note> publicNotes = new HashSet<Note>();

    private Set<Attachment> privateAttachments = new HashSet<Attachment>();
    private Set<Attachment> publicAttachments = new HashSet<Attachment>();
    
    private Set<CustomProperty> privateCustomProperty = new HashSet<CustomProperty>();
    private Set<CustomProperty> publicCustomProperty = new HashSet<CustomProperty>();

}
