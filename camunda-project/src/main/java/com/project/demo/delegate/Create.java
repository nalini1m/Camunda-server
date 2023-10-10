package com.project.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component(value = "create")
public class Create implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println(" --- Calling  TaskListener Create Event--");
    }
}
