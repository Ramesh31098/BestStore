package com.RajIt.BestStore.model;

import java.util.Date;

import org.hibernate.annotations.Collate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.websocket.Decoder.Text;

@Entity
 @Table(name = "Products")
public class Product {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
	private String name; 
	private String brand;  
	private String  category; 
	private String    price;
	 @Column(columnDefinition = "TEXT")
	  private String dscription;
	   private Date createdDate;
	    private String imageFileName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getDscription() {
			return dscription;
		}
		public void setDscription(String dscription) {
			this.dscription = dscription;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public String getImageFileName() {
			return imageFileName;
		}
		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}
	   
}
