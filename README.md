

# Selenium Test Automation Framework

## Overview

This project is a Selenium-based test automation framework designed to test the functionality of the Amazon website. It implements the Page Object Model (POM) to structure the tests, making them more maintainable and scalable.

## Technologies Used

- **Selenium WebDriver**: For browser automation.
- **TestNG**: For test management and execution.
- **Allure**: For generating test reports.
- **Java**: The programming language used for writing tests.
- **Maven**: For project dependency management.

## Project Structure


```
src
├── main
│   └── java
│       └── Pages
│           ├── HomePage.java
│           ├── LoginPage.java
│           ├── PageBase.java
│           └── SignUpDataPage.java
├── test
│   └── java
│       └── Tests
│           ├── LogInTest.java
|           ├── ForgotPassword
│           ├── MobilePhonesTest.java
|           ├──SignUpFailedTest 
|           ├──TestBase
│           └── SignUpSuccessTest.java
└── resources
└── testng.xml
```

## Page Object Model Structure

### HomePage

Contains methods to interact with the homepage elements, including navigation to login and selecting categories.

### LoginPage

Handles the login functionality, including entering email and password and submitting the form.

### PageBase

Provides common methods for actions like clicking, writing text, waiting for elements, and handling advanced user actions.

## Test Cases

### Positive Test Cases

- **Log In Test**: Verifies successful login with valid credentials.
- **Sign Up Test**: Verifies successful account creation.
- **Mobile Phones Test**: Checks navigation to the "Mobile Phones" category and verifies the "Cell Phones and Communication" header.

### Negative Test Cases

- **Invalid Login Test**: Validates error messages for incorrect login attempts.
- **Exceed Character Limit**: Tests the character limit for email input.

## How to Set Up

### Prerequisites

- Java JDK 8 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/ahmedelshafayy/amazon-project
   ```

2. Open the project in your IDE.

3. Install the necessary dependencies using Maven:
   ```bash
   mvn clean install
   ```

4. Set up your WebDriver:
    - Ensure you have the ChromeDriver or any other browser driver installed and included in your system's PATH.

### Running Tests

To run the tests, execute the following command in the terminal:

```bash
mvn test
```

You can also specify the browser by modifying the `testng.xml` file.

## Generating Allure Reports

To generate Allure reports, follow these steps:

1. Run your tests with Maven:
   ```bash
   mvn clean test
   ```

2. Generate the Allure report:
   ```bash
   mvn allure:report
   ```

3. Open the report:
   ```bash
   mvn allure:serve
   ```

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any enhancements or bug fixes.

