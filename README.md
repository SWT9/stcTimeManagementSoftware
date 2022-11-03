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
