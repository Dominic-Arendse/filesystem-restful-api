# Filesystem RESTful API
The Filesystem RESTful API is a Java-based Web Service built with Jersey (2.2) allowing you to expose a RESTful interface for interactacting with your filesystem.

**Setup Your Environment**

This project is built with Eclipse IDE Mars Release (4.5.0) and Jersey (2.2).
All that is required for you to get your environment up and running is as follows:
1.  Clone the repository into a location of your choice.
2.  Open the project in Eclipse IDE or any other IDE of your choice.
3.  Export a `WAR` file to your `tomcat` (and/or equivalent open-source Java Servlet Container) `webapps` directory.

**Building/Compiling The Project**

There consists various ways to setup this web service (i.e. actual web server setup), but to keep things simple all that is required to build this application is to run `tomcat` or equivalent, this will deploy the app.

Once your `tomcat` server is up and running you can access the RESTful Web Service by means of your `localhost` port and the project name (`filesystem-restful-api`), i.e. `http://localhost:8080/filesystem-restful-api/rest/Filesystem/`.

**Consuming the RESTful Web Service**

There are only two method available for consumption that this Web Service offers.


* **/root**

**Request Method Type:** GET

**Request Response Produces:** XML

This allows you retrieve the filesystem's root directory information.

**Example:**`http://localhost:8080/filesystem-restful-api/rest/Filesystem/root`


* **/path/{path}**

**Request Method Type:** GET

**Request Response Produces:** XML

This allows you retrieve the specified path's filesystem directory information.

**Example:**`http://localhost:8080/filesystem-restful-api/rest/Filesystem/path/C:\`


**Want to Contribute?**

Feel free to fork this project, it's the start of something that could turn into the next big thing!
