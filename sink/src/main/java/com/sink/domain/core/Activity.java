package com.sink.domain.core;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.MappedSuperclass;

import com.sink.lib.core.ActivityStatus;
import com.sink.lib.core.ActivityType;
import com.sink.lib.core.PartnerRoleLabel;

@MappedSuperclass
public class Activity extends EntityAuditable {

    private Date activityDate;
    private ActivityType activityType;
    private String universalActivityNumber;
    private ActivityStatus universalActivityStatus;
    private Partner principal;
    private PartnerRoleLabel principalRole;
    private DroidAssistant assistant;
    private User operator;
    private User supervisor;
    
    private String activityDescription;
    
    private Date dateOfSubmit;
    private User submitBy;
    private Date dateOfApprove;
    private User approvedBy;

}
