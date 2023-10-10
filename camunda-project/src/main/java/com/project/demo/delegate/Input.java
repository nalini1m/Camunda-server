package com.project.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component(value = "input")
public class Input implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Calling input Delegate --");
        String name = (String) delegateExecution.getVariable("name");
        String service = (String) delegateExecution.getVariable("service");

        System.out.println("Name ::"+ name);
        System.out.println("Service ::"+ service);

    }
}
