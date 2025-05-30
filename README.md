# CrimeManagement Project

It provides an explanation of the core components and files in the CrimeManagement project repository.

---

## 1. `build.xml`

- This is an **Ant build script** used to automate building the project.
- It typically contains tasks such as compiling Java code, copying resources, packaging the application, and cleaning build artifacts.
- Ant is a Java-based build tool that uses XML configuration files.

---

## 2. `nbproject/`

- This directory contains **NetBeans IDE project files and configuration**.
- Includes project settings, libraries, and build configurations used by the NetBeans IDE.
- Helps to open and manage the project easily within NetBeans.

---

## 3. `src/` (Source Code)

- Contains the **Java source files** for the CrimeManagement application.
- This is where the main application logic is implemented.
- Expect classes related to:
  - User management
  - Crime reporting and handling
  - Business logic for crime data processing
- The source files may be organized into packages based on functionality (e.g., controllers, services, models).

---

## 4. `web/`

- Contains the **web-related resources** and files.
- Includes JSPs (Java Server Pages), HTML, CSS, JavaScript files.
- Responsible for the user interface and client-side interactions.
- May include forms for reporting crimes, viewing crime details, or admin pages.

---

## 5. SQL Scripts (`cr.sql`, `crimedb.sql`, etc.)

- These files contain **SQL statements for database setup**.
- Typically used to create tables, insert initial data, and set up schema required by the application.
- They define database tables for:
  - Users
  - Crime records
  - Roles and permissions
- Before running the application, these scripts must be executed in the database server to create the necessary tables.

---

## Application Flow (Typical)

1. **User Interaction:**  
   Users interact with the web interface (forms/pages) in the `web/` folder.

2. **Request Handling:**  
   The Java classes in `src/` handle requests, process input, and execute business logic.

3. **Database Operations:**  
   The application reads from and writes to the database using SQL tables created by the SQL scripts.

4. **Response Rendering:**  
   The results are returned and rendered back to the user through JSP or HTML pages.

---

## Technologies Used

- **Java:** Backend programming language.
- **Apache Ant:** Build automation tool.
- **NetBeans IDE:** Development environment.
- **SQL:** Database schema and data management.
- **JSP/HTML/CSS/JavaScript:** Frontend presentation and interaction.

---

## Recommendations

- Review the SQL files to set up your database before running the project.
- Open the project in NetBeans IDE for smooth development experience.
- Explore the `src/` folder to understand business logic and application workflows.
- Extend or modify the UI components under `web/` to customize the user interface.

---
## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/thillainirmal-tech/CrimeManagement.git
   ```

2. **Open in NetBeans**:
   - Launch NetBeans IDE.
   - Navigate to `File` > `Open Project`.
   - Select the cloned repository folder.

3. **Set up the database**:
   - Create a MySQL database.
   - Import the `counselling.sql` file to create the necessary tables.

4. **Build the project**:
   - Right-click on the project in the NetBeans Projects pane.
   - Select `Build` to compile the project using Ant.

5. **Run the project**:
   - Right-click on the project.
   - Select `Run` to execute the application.
     
## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Commit your changes.
4. Push to your fork.
5. Submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

K. Thillai Nirmal  
Email: shanmugakannan7549@gmail.com  
GitHub: [thillainirmal-tech](https://github.com/thillainirmal-tech)

