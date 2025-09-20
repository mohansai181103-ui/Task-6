🎯 Objective
- A simple Java console program to demonstrate **database connectivity** using JDBC.  
- It performs **basic CRUD operations** (Insert & Fetch) on a `users` table using **PreparedStatement** and **ResultSet**.

⚙️ Features
- Connect Java application to **MySQL**  
- Create `users` table with `id`, `name`, `email`  
- Insert user records securely using **PreparedStatement**  
- Fetch and display data using **ResultSet**  
- Close DB connections safely in `finally` block

🛠️ Tech Stack
- **Language**: Java  
- **Database**: MySQL 
- **Core Concepts**: JDBC, CRUD operations, PreparedStatement, ResultSet

🖥️ Sample Output
```bash
Database connected!
User inserted!
ID: 1 , Name: john , Email: john123@email.com
ID: 2 , Name: Don , Email: don345@gmail.com

📌 Outcome
- Learned to establish **Java-Database connectivity** with JDBC
- Understood **SQL CRUD operations** and **PreparedStatement** to prevent SQL injection


🚀 How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/Manideep-Dasari/jdbc-java.git
   ```
2. Add JDBC driver (MySQL Connector JAR) to your project classpath.
3. Update DB credentials in the `DBConnection.java` file.
4. Run the `Main` class.
5. Insert users and view stored data in the console.
