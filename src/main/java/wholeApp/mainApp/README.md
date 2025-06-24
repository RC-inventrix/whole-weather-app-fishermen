# Weathe_App

## Description

This application can be use to evaluate the safness of the sea depend on the weather.

## Prerequisites

Before you can run this project, you need to have the following installed on your machine:

- **Java Development Kit (JDK):** [JDK version 22]. You can download it from [Link to JDK download page, e.g., Oracle JDK, Adoptium Temurin].
- **Apache Maven:** To build the project and manage dependencies. Download from [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).
- **MySQL Server:** A running instance of a MySQL database server. You can download and install it from [https://dev.mysql.com/downloads/mysql/](https://dev.mysql.com/downloads/mysql/).

## Getting Started

1.  **Clone the repository:**

2.  **Ignore VS Code Specific Directory:** If you are using VS Code, a directory starting with `@mysql` might be created locally by extensions. This directory should not be committed to Git. Ensure you have a `.gitignore` file in the root of the project and it contains the line `@mysql*/`. If not, create the file and add the line.

## Database Setup

This project includes code to dynamically create the necessary database and tables when the application runs for the first time.

1.  **Ensure MySQL Server is Running:** Make sure your MySQL server is running.
2.  **Configure Database Connection:**
    - Locate the Java file responsible for database connection (based on your code, it might be a class like `WeatherDataReader` or similar).
    - You will need to update the following connection details to match your local MySQL server setup:
      - `DB_URL`: The JDBC URL for your MySQL server (e.g., `jdbc:mysql://localhost:3306/weather_app`).
      - `DB_USER`: Your MySQL username.
      - `DB_PASS`: Your MySQL password.
    - **IMPORTANT SECURITY WARNING:** **Hardcoding credentials like `root` with no password directly in your code is highly insecure and not recommended.** For a real-world application, you should use a more secure method like reading credentials from a configuration file (which is not committed to Git) or environment variables. For this basic example, you will need to change the hardcoded values.
    - Ensure the MySQL user you configure has permissions to create databases and tables.

## Running the Project

1.  **Build the project:** Open a terminal in the project's root directory and run the Maven build command:

    ```bash
    mvn clean install
    ```

    This will download dependencies (like the MySQL Connector/J) and compile your code.

2.  **Run the application:**

    Run this java file: "IntegrationTest.java"

## Important Notes

- As mentioned in the Database Setup section, hardcoding database credentials is insecure. Consider externalizing them for better security.
- Ensure your MySQL server is running before attempting to run the application.
- The application will attempt to create the database and tables if they don't exist based on the logic in your code.
