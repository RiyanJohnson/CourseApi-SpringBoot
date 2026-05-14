package com.example.spring_app.CourseApi;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","description"),
            new Topic("wassup","gang","wassup description"),
            new Topic("hello","world","hello description")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }
}
