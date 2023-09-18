package com.project.demo.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.logging.Logger;

@Component(value ="PrintValues")
public class PrintValues implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        Logger logger = Logger.getLogger(PrintValues.class.getName());
        logger.warning("--String PrintValues Delegate");

        Map<String, Object> stringMap =  delegateExecution.getVariables();
        String businessKey = delegateExecution.getProcessBusinessKey();
        logger.info("Printing Keys & Values");
        logger.info("Business Key {} "+ businessKey);
        for(Map.Entry<String,Object> map:stringMap.entrySet()){
            logger.info(map.getKey() + map.getValue());
        }
        logger.warning("--Ending Print Values Delegate--");


    }
}
