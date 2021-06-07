
# Genesis-Spring-Graphql
A GraphQL server with Spring Boot and MySQL

### How to setup Application
* Used Java 11 and Import maven project into Eclipse.
* Set Server port in Application.properties file.

#### How to Setup Database
* Set Data Source Url in Application.properties file.
* Set Data Source Username and Data Source Password in Application.properties file.

#### Lombok Setup
Reference link 
```https://www.baeldung.com/lombok-ide```

#### How to execute query

##### Used Postman for Hit Request
* /graphql is the REST resource which can fetch information and Modify data

Request body for Create User with Custom Input

**QUERY**
```
mutation createUser($req: UserInput) {
        createUser(input: $req) {
          userId
          firstName
          lastName
          dob
          address
          postId
      }
}
```

**GRAPHQL VARIABLES**
```
{
    "req" : {
           "firstName": "test2",
           "lastName": "test2",
           "dob": "1997-07-11",
          "address": "testaddress"
    }
}
```
##### Request body for Get All Users
***Query***
```
query {
    getAllUsers{
      userId  
      firstName
      address
    }
}
```
##### Request body for Update User address

***QUERY***
```
mutation {
        updateUserAddress(userId: 1,address: "testaddress1") {
          userId
          firstName
          lastName
          address
      }
}
```
##### Request body for Create Post with Custom Input

**QUERY**
```
mutation createPost($req: PostInput) {
        createPost(input: $req) {
          postId
          postName
          dateCreated
      }
}
```
**GRAPHQL VARIABLES**
```
{
            "req" : {
                   "postName": "posttest",
                   "dateCreated": "2021-06-07"
            }
}
```

##### Request body for Get All Posts
**QUERY**
```
query {
    getAllPosts{
      postId  
      postName
      dateCreated
    }
}
```
