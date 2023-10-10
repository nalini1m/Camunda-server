BPM :

1. A BPM is a where an organisation will look in total and individually about the task.
2. Can also identify & analyse the task.
3. There are two roles MAKER & CHECKER.

Workflow :
1.  A workflow is consists of technologies and tools.
2. It can enables the document, information, activites and tasks to flow a process in an organisation.
3. It consists of symbols to identify the task of the process and you can also design the own process.
4. It hepls people who are commited to the process to Roles and Respobilities and sequence of excution.
5. It can also provide the security.

BPMN : Business process Management & Notation

1. BPMN is a graphical representation for process.

DMN :
Decision MOdel & Notation.

CMMN:
Case Management Model and Notation.



Camunda :

1. It is one of the most popular BPM tool to automate our process.
2. It is the vendor of supporting BPMN & DMN.
3. It is an open source and it was developed based on the java framework.
4. Camunda has more functionality of COCKPIT / TASKLIST.


COCKPIT:
It is a web application we can also monitor the process and modify the request(create/edit)
TASKLIST:
It is a web application we can perform user tasks.
ADMIN:
It is a web application we can config the properties and gives the access.

Camunda - Springboot

Project -

1. Application Layer(React JS/ Angular)(X ->Y)
2. Service Layer(SpringBoot)(Y -> Z)
3. Engine Layer(Camunda) (Rest Calls z)
4. Extension Layer


   Workbench/GitHub/

   Postman (we can call rest api's)

Camunda-Workflow

Rest Endpoint:
https://docs.camunda.org/rest/camunda-bpm-platform/7.20-SNAPSHOT/

1. Message Start Event

API : http://localhost:8080/engine-rest/message
Body:
{
"messageName":"demo"
}



Start Process :

http://localhost:8080/engine-rest/process-definition/key/ProcessID/start

{
"businessKey": "myBusinessKey"
}



Claim :

http://localhost:8080/engine-rest/task/bb340427-6710-11ee-8ae7-00919e9b59fb/claim
{
"userId": "abc"
}

unclaim:

http://localhost:8080/engine-rest/task/ID/unclaim
NOBody

Complete:

http://localhost:8080/engine-rest/task/ID/complete

{

"withVariablesInReturn": true
}


GetTasks:

http://localhost:8080/engine-rest/task?taskAssignee




Get Task count:
http://localhost:8080/engine-rest/task/count?taskAssignee