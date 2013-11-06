package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.CustomerLabel;
import com.sink.domain.core.User;

public interface CustomerLabelService {
    public List<CustomerLabel> findCustomerLabelsByUser(User user);
}
