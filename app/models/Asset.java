package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Asset extends Model {
	
	
	String title;
	String description;
	//TODO later images
	
	@ManyToOne(optional=false)
    @JoinColumn(name="id",referencedColumnName="CUST_ID")
    MasterProduct product;
}
