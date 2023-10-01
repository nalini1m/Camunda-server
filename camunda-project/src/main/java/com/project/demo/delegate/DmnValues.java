package com.project.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Component(value = "dmnValues")
public class DmnValues implements JavaDelegate {

    Logger logger = Logger.getLogger(DmnValues.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        logger.info("--Calling DMN Values ---");

        List<Map<String,Object>> result  = (List<Map<String, Object>>) delegateExecution.getVariable("result");
        logger.info("result {}"+ result.toString());
//        [{isValidation=YES, isSignature=NO}]

        for(Map<String, Object> map:result){
            delegateExecution.setVariable("isValidation",map.get("isValidation"));
            delegateExecution.setVariable("isSignature",map.get("isSignature"));
        }

        Map<String,Object> map = delegateExecution.getVariables();

        logger.info("map {}"+ map.toString());

        logger.info("--Calling DMN Values ---");


    }
}
