package com.java.basic.design;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternYoutubeApp {

    //Observer patterns defines a one-to-many relationships dependency between
   // objects so that when one object[subject] changes state.
   // all its dependencies observers are notified automatically

    //One object changes-> many updates get updated
    public static void main(String[] args) {

        TechJavaChannel tjc = new TechJavaChannel();

        Subscriber pradeep = new YoutubeUser("pradeep");
        Subscriber prasad = new YoutubeUser("prasad");

        tjc.addSubscriber(pradeep);
        tjc.addSubscriber(prasad);

        tjc.uploadNewVideo("Java 8 streams");

    }

}



interface Subscriber{
    void notifyNewVideo(String videoTitle);
}

interface YoutubeChannel{

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
}

 class TechJavaChannel implements YoutubeChannel{

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideoTitle;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadNewVideo(String videoTitle){
        this.latestVideoTitle=videoTitle;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber:subscribers){
            subscriber.notifyNewVideo(latestVideoTitle);
        }
    }
}

class YoutubeUser implements Subscriber{
    private String name;
    public YoutubeUser(String name){
        this.name=name;
    }

    @Override
    public void notifyNewVideo(String videoTitle) {
        System.out.println(name+" received notification about "+videoTitle);
    }
}

