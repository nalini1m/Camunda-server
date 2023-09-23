package com.project.demo.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.util.Map;
import java.util.logging.Logger;

@Component(value = "logValues")
public class LogValues implements JavaDelegate {

    Logger logger = Logger.getLogger(LogValues.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.warning("--Starting Log Value Delegate --");

        Map<String,Object> objectMap =  delegateExecution.getVariables();

        for(Map.Entry<String,Object> map:objectMap.entrySet()){
            logger.info(map.getKey() +" -- " +  map.getValue());
        }


        logger.warning("--Ending Log Value Delegate --");

    }
}
