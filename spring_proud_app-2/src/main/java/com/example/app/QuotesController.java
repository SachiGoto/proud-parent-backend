package com.example.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="api/quotes")
public class QuotesController {
	private final QuotesService quotesService;
	
	public QuotesController(QuotesService quoteService) {
		this.quotesService = quoteService;
	}
	
	@GetMapping(path="test")
	public String test() {
		return "Hello World";
	}
		
	
	
	@GetMapping(path = "getQuotes")
    public List<Quotes> getQuotes(){
		return quotesService.getQuotes();
		
		
	}
	
	@PostMapping(path = "addQuote")
	public void addNewQuote(@RequestBody Quotes quotes) {quotesService.addQuote(quotes);
	}
}