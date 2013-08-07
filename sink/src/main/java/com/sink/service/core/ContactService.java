package com.sink.service.core;

import java.util.List;

import com.sink.domain.core.Contact;
import com.sink.domain.core.Partner;

public interface ContactService {
	public Contact findContactById(int id);
	public Contact findContactByName(String name);

	public List<Contact> findContactsByPartner(Partner partner);

	public int addContact(Contact contact);

	public void updateContact(Contact contact);


}
