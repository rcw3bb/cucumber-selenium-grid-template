# Build

## Pre-requisite

* Java 8

* Maven 3.x

* Firefox web browser

* Create or update **<USER_HOME>\\.gradle\\gradle.properties** to have the following properties:

    ```properties
    artifactoryUsername=<VALID_USERNAME>
    artifactoryPassword=<VALID_PASSWORD>
    ```
    
    > If you don't have access to my **artifactory**, update all the **repositories section** in the **build.gradle** file **after cloning**, from:
    >
    > ```
    > repositories {
    >      maven {
    >            url 'https://repo.ronella.xyz/artifactory/java-central'
    >            credentials {
    >                username "${artifactoryUsername}"
    >                password "${artifactoryPassword}"
    >            }
    >      }
    >  }
    >    ```
    >    
    >    to
    >    
    >    ```
    >  repositories {
    > 	mavenCentral()
    > }
    >```
