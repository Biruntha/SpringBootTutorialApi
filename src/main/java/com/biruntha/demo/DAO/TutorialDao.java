package com.biruntha.demo.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.biruntha.demo.Model.Tutorial;

public interface TutorialDao extends MongoRepository<Tutorial, String>{
	List<Tutorial> findByTitleContaining(String title);
	List<Tutorial> findByPublished(boolean published);
}
