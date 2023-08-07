package com.example.demo.model;



import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="goods")
public class Item {

//	@Id
//	@Generated
//	int id;

	
	String name;
	
	
	float weight;
	
	
	int totalUnit;
	
	
	int consumeUnit;
	
	
	String brand;
	
	
	Boolean availabe;

	enum availabe {
		True, False
	}
}
