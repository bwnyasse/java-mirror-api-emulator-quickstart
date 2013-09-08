java-mirror-api-emulator-quickstart
===================================

We modify the Google Mirror Api's Quickstart to use the MarcosBermudez/java-mirror-api-emulator. The purpose is to provide a quick start project for java developers and non-glass-explorers.

### Description

This is an attempt to run the google glass quick start projet ( java edition) for java developer and non glass explorer.
The project is actually based on the [official quick start projet](https://developers.google.com/glass/quickstart/java)

### Emulator

The quick start project uses the [java-mirror-api-emulator]() as Mirror API and the mirror emulator is available at https://mirroremul.appspot.com

### Running this quick start

1.  Clone (or fork and clone) this repository

    ```
    git clone https://github.com/bwnyasse/java-mirror-api-emulator-quickstart.git
    ```
    
2.  Configure the project (recommanded)
    
    Import the project in your favorite IDE , and modify the oauth.properties file.
    Set your own message for the variable quick_start_hello_world
    For the moment ,don't change other variables.

3.  Running the quick start
    
    ```
    cd java-mirror-api-emulator-quickstart
    mvn clean install
    mvn jetty:run
    ```
    
    Launch your favorite browser at `localhost:8080` to see the quick start.
    

### Running in your own mirror emulator

1.  All you have to do , is to follow the [Scarygami/mirror-api](https://github.com/Scarygami/mirror-api)

2.  After installing your own emulator , edit the oauth.properties file and change `client_id` , `client_secret` and  `application_url` 

Have fun!
