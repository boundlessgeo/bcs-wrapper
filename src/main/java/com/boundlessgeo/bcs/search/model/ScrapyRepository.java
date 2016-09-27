package com.boundlessgeo.bcs.search.model;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ScrapyRepository extends ElasticsearchRepository<Scrapy, String> {
	
	public Scrapy findByCategory(String category);
	public Scrapy findByDescription(String description);
	public Scrapy findByName(String name);

}
