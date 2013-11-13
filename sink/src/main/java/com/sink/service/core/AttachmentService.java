

publi interface AttachmentService 
{
    public void addPrivateNote(Note note);
    public void addPublicNote(Note note);
    public void addPrivateAttachment(Attachment attachment);
    public void addPublicAttachment(Attachment attachment);

    public List<Note> findAllPrivateNotes();
    public List<Note> findAllPublicNotes();
    public List<Attachment> findAllPrivateAttachments();
    public List<Attachment> findAllPublicAttachments();
    
}
