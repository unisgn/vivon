package com.sink.domain.util;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Message {
    private User owner;
    private Date draft;
    private Date sent;
    private User sender;
    private Set<User> receivers;
    private Set<MessageLabel> labels = new HashSet<MessageLabel>();
    private String title;
    private String content;
}
