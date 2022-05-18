package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Contact;

public interface ContactService {

	
	//interface methods are by default public and abstract
	
	
	String upsert(Contact contact) ;
	List<Contact> getAllContacts();
	Contact getContact(int cid);
	String deleteContact(int cid);
	
}
