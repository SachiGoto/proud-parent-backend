package com.example.app;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class QuotesService {

	private final QuotesRepository quotesRepository;
	
	public QuotesService(QuotesRepository quotesRepository) {
		this.quotesRepository = quotesRepository;
	}
	
	public List<Quotes> getQuotes() {
		// TODO Auto-generated method stub
		return  quotesRepository.findAll();
	
	}

	public void addQuote(Quotes quote) {
        System.out.println("quotes from post request"+  quote);
		quotesRepository.save(quote);
		
		
	}

}
