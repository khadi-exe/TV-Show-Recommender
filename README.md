# 🎬 Java TV Show Recommendation System

## Overview
This project is a **Java-based TV Show Recommendation System** that suggests TV shows to users based on their preferences such as **genre, rating, and watch history**. It demonstrates core Java concepts including **Object-Oriented Programming (OOP), collections, file handling, and basic recommendation logic**.

This is a **console-based backend project**, designed to clearly showcase Java fundamentals for **internships, entry-level roles, and GitHub portfolios**.

---

## Features
- Store TV shows with title, genre, and rating
- Create user profiles with preferred genres
- Track watched TV shows
- Recommend unwatched TV shows based on:
  - Preferred genre
  - Highest ratings
- Load TV show data from a text file
- Clean, modular OOP-based design

---

## Technologies Used
- Java
- Java Collections (`ArrayList`, `HashSet`, `List`)
- File I/O
- Object-Oriented Programming (OOP)

---

## Project Structure
TV-Show-Recommender/
│
├── src/
│ ├── Main.java
│ ├── model/
│ │ ├── TVShow.java
│ │ └── User.java
│ ├── service/
│ │ └── RecommendationService.java
│ └── util/
│ └── DataLoader.java
│
├── data/
│ └── tvshows.txt
│
└── README.md

yaml
Copy code

---

## How It Works
1. TV show data is loaded from a text file.
2. A user profile is created with a preferred genre.
3. The system filters out shows the user has already watched.
4. Remaining shows are sorted by rating.
5. The highest-rated recommendations are displayed.

---

## Sample Output
Recommended TV Shows for Alex:
Better Call Saul (Drama, Rating: 9.0)

yaml
Copy code

---

## How to Run
1. Clone the repository:
```bash
git clone https://github.com/yourusername/TV-Show-Recommender.git
Compile the project:

bash
Copy code
javac src/Main.java
Run the application:

bash
Copy code
java src.Main
Skills Demonstrated
Java programming

Object-oriented design

Data filtering and sorting

File parsing

Clean code organization

GitHub project structuring

Future Improvements
Add a menu-driven user interface

Implement multiple genre preferences

Add unit tests (JUnit)

Convert to a REST API using Spring Boot

Add a graphical UI with JavaFX

Author
Khadimul Islam
