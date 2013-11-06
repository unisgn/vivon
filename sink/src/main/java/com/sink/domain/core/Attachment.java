package com.sink.domain.core;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Attachment extends EntityBase {
    
    private String urn;
    
    private String originalFileName;
    private String mime;
    private String size;
    
    private Date dateOfUpload;
    private User uploadedBy;
    private Date dateOfLastDownload;
    private User lastDownloadedBy;
    
    private int totalDownload;
    
    
    private Set<AttachmentAccessJournal> accessJournals = new HashSet<AttachmentAccessJournal>();
}
