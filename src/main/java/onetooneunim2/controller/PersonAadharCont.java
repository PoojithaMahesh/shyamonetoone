package onetooneunim2.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetooneunim2.dao.AadharCardDao;
import onetooneunim2.dao.PersonDao;
import onetooneunim2.dto.AadharCard;
import onetooneunim2.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
//	
//	Person person=new Person();
//	person.setId(2);
//	person.setName("Bharani");
//	person.setAddress("bang");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(200);
//    aadharCard.setName("Bharani");
//    aadharCard.setAge(15);
//    
//    
//	person.setAadharCard(aadharCard);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.saveAdharCard(aadharCard);
//	
//	
//	PersonDao personDao=new PersonDao();
//	personDao.savePerson(person);
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setName("poojitha");
//	aadharCard.setAge(16);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.updateAadhar(aadharCard, 100);
	
//
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(100);
//	aadharCard.setName("pooji");
//	aadharCard.setAge(20);
	
//	Person person=new Person();
//	person.setName("bharanirmmmmm");
//	person.setAddress("bangalre");
////	person.setAadharCard(aadharCard);
//	
//	PersonDao personDao=new PersonDao();
//	personDao.updatePerson(2, person);
//	
//	PersonDao personDao=new PersonDao();
//	personDao.findPerson(2);
//	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.findAadhar(200);
	
//	AadharCardDao aadharCardDao=new AadharCardDao();
//	aadharCardDao.deleteAdhar(200);
	
	PersonDao personDao=new PersonDao();
	personDao.deletePerson(2);
	
	
	
	
	
	
	
	
}
}
