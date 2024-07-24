# CRUD TO MANAGE TASKS

I have developed a CRUD in Spring Boot to manage tasks, implementing a RESTful API that follows REST design principles. 
It uses the appropriate HTTP verbs (GET, POST, PUT, DELETE) to perform CRUD operations, and has efficient error handling 
that provides clear messages and HTTP status codes that reflect the result of each operation. Additionally, I have performed 
extensive testing with Postman to ensure proper functioning of all endpoints.

## What tools have I used?
1. Java - Spring Boot
3. Postman
4. MySQL Workbench
5. Vscode
## Dependencies used
1. Spring Boot
2. Spring Data JPA
3. Spring Boot Dev Tools
4. Spring Web
5. MySQL Driver

## Create the database in MySQL Workbench: 
create database task_db;

## Testing endpoints with postman:
1. GET /tasks:
Method: GET
URL: http://localhost:8080/tasks
Verify that you receive a list of tasks.

2. GET /tasks/{id}:
Method: GET
URL: http://localhost:8080/tasks/1
Verify that you receive the details of a specific task.

3. POST /tasks:
Method: POST
URL: http://localhost:8080/tasks
Body (JSON):
{
 "title": "New Task",
 "description": "Task description",
 "completed": false
}
Verify that the task is created correctly.

4. PUT /tasks/{id}:
Method: PUT
URL: http://localhost:8080/tasks/1
Body (JSON):
{
 "title": "Updated Task",
 "description": "Updated description",
 "completed": true
}
Verify that the task is updated.

5. DELETE /tasks/{id}:

Method: DELETE
URL: http://localhost:8080/tasks/1
Verify that the task is deleted correctly.
