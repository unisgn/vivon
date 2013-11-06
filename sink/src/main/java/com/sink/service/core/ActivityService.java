package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Activity;
import com.sink.domain.core.Customer;
import com.sink.domain.core.Vendor;
import com.sink.lib.core.ActivityType;
import com.sink.lib.core.TimePeriod;

public interface ActivityService {

    public List<Activity> findAllActivitiesByCustomer(Customer customer, TimePeriod period);
    public List<Activity> findAllActivitiesByVendor(Vendor vendor, TimePeriod period);
    public List<Activity> findAllActivitiesByType(ActivityType type, TimePeriod period);
}
