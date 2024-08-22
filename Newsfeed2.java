import java.util.Arrays;
public class Newsfeed2 {
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  public int[] views = {0, 0, 0, 0};
  
  public Newsfeed2(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  // Create getFirstTopic() below
  public String getFirstTopic() {
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    views[topicIndex]++;
  }
  
  public static void main(String[] args) {
    Newsfeed2 sampleFeed = new Newsfeed2();
        
    System.out.println("The top topic is " + sampleFeed.getFirstTopic());
        
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
        
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
  }
}