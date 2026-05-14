package com.example.spring_app.CourseApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> sayHello(){
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public String addTopic(@RequestBody Topic topic){
        try{
            topicService.addTopic(topic);
            return "Added successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @PutMapping("/topics/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id){
        try{
            topicService.updateTopic(id, topic);
            return "Updated successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @DeleteMapping("/topics/{id}")
    public String deleteTopic(@PathVariable String id){
        try{
            topicService.deleteTopic(id);
            return "Deleted successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }
}
