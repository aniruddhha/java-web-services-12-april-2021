package com.ani.training;

import org.springframework.data.jpa.repository.JpaRepository;

 /*
    - What is ORM ? -> Orm is object relation mapping.
 *  - What is JPA ? -> JPA is a ORM.It is Java Persistence API.
    - What is DAO ? -> it is Data Access Object. It communicates with db for performing db operations.
    - How do you save the data ? -> by calling save method on the dao and passing object to it.
    - How do you get All records from db ? -> by calling findAll method on dao object
    - Which annotation you will use for setting primary key ? we use @Id
    - What is @Entity annotation ? Entity is a Table in a database. it is class to table mapping.
    - How do you configure database properties ? We write configuration in application.properties file.
 * */
public interface BankAccountDao extends JpaRepository<BankAccount, Integer> {
}
