package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Material extends EntityAuditable {

    @Column(nullable=false, unique=true, updatable=false)
    private String number;
    
    private String code;
    
    @Column(nullable=false)
    private String name;
    private String searchKey;
    
    private String searchField;
    

    private MaterialCategory category;
    private Set<MaterialPropertyValue> propertySet = new HashSet<MaterialPropertyValue>();
    
    private Bom bom;
    private boolean assembly;    // true if bom is not null;
    
    private Set<MaterialStorageInfo> storageInfo = new HashSet<MaterialStorageInfo>();

    private Uom uom;
    private int totalStock;     // stock in uom
    private BigDecimal currentValuePerUom;
    private BigDecimal currentTotalStockValue;
}
