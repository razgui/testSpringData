package com.vermeg.rest.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.vermeg.rest.entities.Book;



@Service("commandService")
public class CommandService {
	
	public  double calculateTotalPrice(List<Book> t) {
		Double totalPrice = 0.0;

		for (Book b : t) {
			totalPrice+= b.getPrice();
        }
		return totalPrice;
	}

}
