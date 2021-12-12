This is a springboot ePHI system where any health service provider could get, create, update and delete patient ePHI
System is connected with mongoDb where we store the records
server port: 8081

you need only to run the system and use swagger to test all the apis, you will find the apis and their documentation.

System divided into two main packages
- com.example.ePHI
- mongoHelpers : this is a package i use to help creating MongoEntityInformation.

 in com.example.ePHI we have 5 main layers:
 - constants: which contain all the system constants and enums.
 - controller: handler for external request
 - model: where we define system base models and document for database.
 - repositories: which i use to do the database logic here i got help form mongoDb to implement the methods.
 - service: which we use to do the business logic. To be implemented soon when we implements the service layer we should
 not talk directly from controller with repository service layer should come between these two layers.

i need to implement custom exception to handle some exceptions which may occur in the system.

Plus we need to remove the redundant to decrease the tightly coupling in the system will find this in the reops impl.