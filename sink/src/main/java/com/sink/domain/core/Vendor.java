package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Vendor extends EntityAuditable {
    
    private Partner partner;
    private String number;
    private String code;
    private String name;
    private String searchKey;
    private String searchField;
        
    private Set<VendorLabel> labels = new HashSet<VendorLabel>();
    
    private Set<Note> privateNotes = new HashSet<Note>();
    private Set<Note> publicNotes = new HashSet<Note>();
    
    private Set<Attachment> privateAttachments = new HashSet<Attachment>();
    private Set<Attachment> publicAttachments = new HashSet<Attachment>();
    
    private Set<CustomProperty> privateCustomProperty = new HashSet<CustomProperty>();
    private Set<CustomProperty> publicCustomProperty = new HashSet<CustomProperty>();

}
