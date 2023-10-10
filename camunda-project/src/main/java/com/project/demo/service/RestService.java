package com.project.demo.service;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.demo.model.CamundaVariable;
import com.sun.net.httpserver.Headers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;


@Service
public class RestService {

//    @Autowired
//    RestTemplate restTemplate;




    public   void getCall(){
        String request = "http://localhost:8080/engine-rest/process-definition/key/Event-Listeners/start";
       ResponseEntity<String> response =  new RestTemplate().postForEntity(request,prepareJsonForRest(getVariables()),String.class);
        System.out.println(response.getStatusCode());

    }
    public HttpEntity<String> prepareJsonForRest(Object object){
        String json = null;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES,false);
            objectMapper.configure(MapperFeature.USE_STD_BEAN_NAMING,false);
            json =objectMapper.writeValueAsString(object);
            System.out.println("json::"+json);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        HttpEntity<String> httpEntity = new HttpEntity<>(json,httpHeaders);
       return  httpEntity;
    }

//    {
//        "variables": {
//        "aVariable": {
//            "value": "aStringValue",
//                    "type": "String"
//        },
//        "anotherVariable": {
//            "value": true,
//                    "type": "Boolean"
//        }
//    },
//        "businessKey": "myBusinessKey"
//    }
    public HashMap<String,Object>  getVariables(){
        HashMap<String,Object> map = new HashMap<>();
        HashMap<String,Object> variable = new HashMap<>();
        CamundaVariable camundaVariable = new CamundaVariable();
        camundaVariable.setType("String");
        camundaVariable.setValue("abc123");
        map.put("businessKey","123");
        variable.put("externalVariable",camundaVariable);
        map.put("variables",variable);
       return map;
    }
}
