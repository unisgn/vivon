package com.sink.service.core;

public interface ContactService {
	public Contact findContactById(int id);
	public Contact findContactByName(String name);

	public List<Contact> findContactsByPartner(Partner partner);

	public int addContact(Contact contact);

	public void updateContact(Contact contact);


}
