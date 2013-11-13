package com.sink.domain.core;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Attachment extends EntityBase {
    
    private String urn;
    
    private String originalName;
    private String mime;
    private int size;        // in byte
    
    private Date dateOfUpload;
    private User uploadedBy;
    private Date dateOfLastDownload;
    private User lastDownloadedBy;
    
    private int totalDownloads;
    
    
    private Set<AttachmentAccessJournal> accessJournals = new HashSet<AttachmentAccessJournal>();
}
