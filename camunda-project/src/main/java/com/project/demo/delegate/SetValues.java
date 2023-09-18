package com.project.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Named("SetValues")
public class SetValues implements JavaDelegate {
    Logger logger = Logger.getLogger(SetValues.class.getName());
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.warning("--Stating SetValues Delegation--");
        delegateExecution.getParentActivityInstanceId();
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("1","venky");
        stringMap.put("2","camunda");
        stringMap.put("3","Angular");
        stringMap.put("4","SpringBoot");
        logger.info("Setting Values to Delegation");
        delegateExecution.setProcessBusinessKey("BusinessKey123");
//        delegateExecution.setVariables(stringMap);
        for(Map.Entry<String,String> map:stringMap.entrySet()){
            delegateExecution.setVariable(map.getKey(),map.getValue());

        }
        logger.warning("--Ending SetValues Delegation--");

    }
}
