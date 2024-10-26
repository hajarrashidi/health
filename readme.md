# Health
To make it easier to understand your health, we have created a service that connects to multiple health services and provides a better overview of your health.

## Services 

### Oura
create a `application.yml` and insert :
```yaml
oura:
  api:
    base-url: https://api.ouraring.com/v2
    token: YOUR_OURA_PERSONAL_ACCESS_TOKEN
```

<hr>

## Setup project

To run and build the project, follow these steps:

1. **Build the Project**:
   Open a terminal and navigate to the root directory of your project. Run the following command to build the project:
   ```sh
   ./gradlew build
    ```
2. **Run the Project**:
   Open a terminal and navigate to the root directory of your project. Run the following command to run the project:
   ```sh
   ./gradlew bootRun
   ```