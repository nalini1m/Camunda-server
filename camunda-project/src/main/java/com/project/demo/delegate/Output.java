package com.project.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component(value = "output")
public class Output implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("Calling Output Delegate --");
        String name = (String) delegateExecution.getVariable("name");
        String service = (String) delegateExecution.getVariable("service");
        String age = (String) delegateExecution.getVariable("age");

        System.out.println("Name ::"+ name);
        System.out.println("Service ::"+ service);
        System.out.println("age ::"+ age);

    }
}
