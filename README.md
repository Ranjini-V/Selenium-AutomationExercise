# Selenium-AutomationExercise

Hands-on Selenium WebDriver automation framework targeting **AutomationExercise.com** - a real-world e-commerce practice site. Built with Java and TestNG to demonstrate end-to-end UI test automation.

---

## Tech Stack

| Tool | Purpose |
|------|---------|
| Java | Core programming language |
| Selenium WebDriver | Browser automation |
| Cucumber | Behaviour Driven Development |
| TestNG | Test execution and management |
| Maven | Build and dependency management |
| ExtentReports | HTML test reporting |


---

## Application Under Test

**[AutomationExercise.com](https://automationexercise.com)** -- An e-commerce web application used for practicing automation testing.

---

## Project Structure

```
Selenium-AutomationExercise/
├── src/
│   ├── main/java/
│   │   ├── pages/          # Page Object classes
│   │   └── utils/          # Utility methods and base setup
│   └── test/java/
│       └── tests/          # Test scenarios
├── reports/                # ExtentReports HTML output
├── testng.xml
└── pom.xml
```

---

##  Test Scenarios Covered

- User Registration and Login
- Product Search and Browsing
- Add to Cart and Checkout flow
- Contact Us form submission
- Subscription functionality
- Logout

---

## How to Run

### Prerequisites
- Java JDK 11+
- Maven 3.6+
- Chrome browser

### Steps

```bash
# Clone the repository
git clone https://github.com/Ranjini-V/Selenium-AutomationExercise.git
cd Selenium-AutomationExercise

# Run all tests
mvn test
```

---

## Test Reports

After execution, find the report at:

```
reports/ExtentReport.html
```

---

##  Concepts Demonstrated

- Page Object Model (POM) design pattern
- TestNG test grouping and sequencing
- Explicit waits for dynamic elements
- ExtentReports with test step logging
- Screenshot capture on failure

---

##  Author

**Ranjini V** - QA Automation Engineer  
[GitHub](https://github.com/Ranjini-V)
