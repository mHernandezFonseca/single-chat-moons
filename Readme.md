# Chat MOONS Application

## Utilities used to develop the application

1. Java - 11.0.7
2. Maven - 3.6.3

## Instructions to download and run

## Go to a terminal and execute
git clone https://github.com/mHernandezFonseca/single-chat-moons.git
cd single-chat-moons/

### Create package, inside a terminal execute the following command 
$ mvn package
### Run the application executing the next command
$ java -jar target/single-chat-moons-0.0.1-SNAPSHOT.jar


### Go to internet explorer of your preference and put the link (Google chrome, FireFox etc.) 
http://localhost:8085/index.html
Typing your name to identify in the text box, click on start chatting button.

In the same explorer or other one open a new tab and put the link before mentioned.
Typing your name to identify in the text box and enjoy!
Use the logout button, on the left, to go out the chat.

### Check in the database users with log in and log out
Open a new tab of your internet explorer and put the next link:
http://localhost:8085/h2-console/
Click on connect button.
If you have an error to connect at the database put this on the url database:
jdbc:h2:mem:testdb
Click again on connect button, on the area SQL statement typing the query:
select * from user;
Click on run button to show the records of users that have a login and logout,
the data on the table are ID, CREATED_DATE, LOGGER_TYPE and NAME_USER