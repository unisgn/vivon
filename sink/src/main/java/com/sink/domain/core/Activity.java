package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.MappedSuperclass;

import com.sink.lib.core.ActivityStatus;
import com.sink.lib.core.ActivityType;

@MappedSuperclass
public class Activity extends EntityAuditable {

    private Date actDate;
    private ActivityType actType;
    private String gblActNo; // global activity number
    private ActivityStatus gblActStat; // global activity status
    
    private Partner principal;
    private DroidAssistant assistant;
    private User operator;
    private User supervisor;
    
    private String summary;
    
    private Date dateOfSubmit;
    private User submitBy;      // operator
    private Date dateOfApprove;
    private User approvedBy;    // supervisor

}
