package com.boundlessgeo.bcs.wrapper.controller.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boundlessgeo.bcs.search.model.Scrapy;
import com.boundlessgeo.bcs.search.model.ScrapyRepository;

@RestController

public class SearchController {
	@Autowired
	ScrapyRepository sr;
	@RequestMapping(value = "/api/v1/search/{category}")
	public Scrapy searchByCategory(@PathVariable String category){
		return sr.findByCategory(category);
	}
	

}
