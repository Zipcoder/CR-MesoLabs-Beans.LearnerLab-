package com.example.demo;
import com.example.demo.Learner;

public interface Teacher {
    void teach(Learner learner, double numberOfHours);
    void lecture(Iterable<? extends Learner> learners, double numberOfHours);
}
