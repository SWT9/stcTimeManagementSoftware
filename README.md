# stcTimeManagementSoftware

Program for time management in Java


# Requirements and Installation:

MySQL [Download page](https://dev.mysql.com/downloads/)

 - For **Windows** Download the [Windows Installer](https://dev.mysql.com/downloads/installer/),  and Install the **Workbench**, **Shell**, and **MySQL Server**.


 - For macOS or linux, download and install the [MySQL Workbench](https://dev.mysql.com/downloads/workbench/), [MySQL Shell](https://dev.mysql.com/downloads/shell/), and [MySQL Server](https://dev.mysql.com/downloads/mysql/).


Gradle [Download page](https://gradle.org/install/)

# Commands for creating the MySQL database:


First we have to open the MySQL shell, for for macOS use `mysql -u root -p`

Once we are inside **MySQL Shell**, we create the database:

    create database swtDatabase;

Then we create the user:

    create user 'manager'@'%'
    identified by '0123456789';

Then we grant the user all the privileges:

    grant all on swtDatabase.* to 'manager'@'%';


Command for exiting the MySQL server `exit;`


# Commands for running the server:

Use this command inside the project folder `~/stcTimeManagementSoftware`:

    graddlew bootRun

# Commands for using the website:

Open [localhost:8080](localhost:8080) in your browser


# HELP Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
