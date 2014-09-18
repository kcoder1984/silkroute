package models;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Customer extends Model {
	
	String userId;
	String password ;
	
	String firstName;
	String middleName;
	String lastName;
	
	String address1;
	String address2;
	String city;
	String state;
	String zipcode;
	//TODO later when we want to store multiple addresses.
	//Address homeAddress;
	//Address billingAddress;
	
	 @OneToMany(mappedBy="customer",targetEntity=Asset.class,
     fetch=FetchType.LAZY)
	 List<Asset> resources;

}
