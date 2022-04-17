package io.shem.springboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic>topics = new ArrayList<>(Arrays.asList 
		(
				new Topic("Spring", "Spring Framework", "Spring Description"),
				new Topic("Java","Core Java", "Java Description" ),
				new Topic("Javascript", "NodeJS", "javascript Description")
				));
	public List<Topic> getAllTopics () {
		
		return topics;
}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

}
