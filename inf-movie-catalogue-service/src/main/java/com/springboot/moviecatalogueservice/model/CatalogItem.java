package com.springboot.moviecatalogueservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CatalogItem {
	
	private String name;
	private String desc;
	private int rating;

}
