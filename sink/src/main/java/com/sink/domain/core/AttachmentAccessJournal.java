package com.sink.domain.core;

import java.util.Date;

import com.sink.lib.core.AttachmentAccessStatus;

public class AttachmentAccessJournal extends EntityBase {

	private Attachment attachment;
	
	private Date accessDate;
	private User accessBy;
	private String lanIp;
	private String wanIp;
	
	private AttachmentAccessStatus status;
	
}
