# Build

## Pre-requisite

* Java 8

* Maven 3.x

* Firefox web browser

* Create or update **<USER_HOME>\\.gradle\\gradle.properties** to have the following properties:

    ```properties
    archivaUsername=<VALID_USERNAME>
    archivaPassword=<VALID_PASSWORD>
    ```
    
    > If you don't have access to my **archiva**, update all the **repositories section** in the **build.gradle** file **after cloning** from:
    >
    > ```
    > repositories {
    >  maven {
    >      url 'https://repo.ronella.xyz/archiva/repository/internal/'
    >      credentials {
    >          username "${archivaUsername}"
    >          password "${archivaPassword}"
    >      }
    >  }
    >  maven {
    >      url 'https://repo.ronella.xyz/archiva/repository/snapshots/'
    >      credentials {
    >          username "${archivaUsername}"
    >          password "${archivaPassword}"
    >      }
    >  }
    > }
    > ```
    >
    > to
    >
    > ```
    > repositories {
    >  mavenCentral()
    > }
    > ```
