package com.temptecknohub.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temptecknohub.model.Request;

@Repository
public interface RequestRepository extends MongoRepository<Request, String> {

}
