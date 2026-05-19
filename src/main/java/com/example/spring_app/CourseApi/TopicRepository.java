package com.example.spring_app.CourseApi;

import org.springframework.data.repository.CrudRepository;

//JPA takes care of all the basic crud operations so a interface is enough for this, these are build in methods 
public interface TopicRepository extends CrudRepository<Topic, String> {
     
}
