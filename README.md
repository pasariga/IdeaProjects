[English](README.md) · [简体中文](README.zh-CN.md)

# IdeaProjects

**A Java practice route from language basics to database-backed web apps.**

Pick an independent exercise from the route below. Each module has its own entry point and toolchain.

| Stage | Module | How to start |
| --- | --- | --- |
| Core Java and OOP | [Demo](Demo), [Demo02](Demo02), [Work](Work), [HomeWork](HomeWork) | Open the individual folder and run its Java entry point. |
| JDBC | [DataBase](DataBase) | Use its Maven POM and JDK 25. Start with the driver-loading example. |
| Servlet / HTTP | [Java_Web](Java_Web) | Read the parent and child POMs. Try the request and response modules first. |
| Sessions and cookies | [javaweb-session-cookie](javaweb-session-cookie) | Run within the servlet environment specified by the project. The JDBC exercise needs a local database. |
| Spring Boot | [springboot-web-quickstart](springboot-web-quickstart) | Use JDK 17 as declared by the starter POM. |
| MyBatis | [MyBatis starter](Mybatis/springboot-quickstart), [nested MyBatis module](Mybatis/springboot-quickstart/mybatis) | The starter and nested module declare Java 17 and 25 respectively. Check the module POM and local database config. |

## Local database practice

Set `IDEA_PROJECTS_DB_PASSWORD` in your local environment before running the JDBC and MyBatis examples. Use a dedicated local test database. Existing IDE metadata and generated `target` files are historical. Build with the POM in the module you are studying. No repository-wide build result is claimed.

## Project boundaries and license

This archive is separate from Snapline, Dayline, ZhiBi, WenHeng and OpenEssayScore. It should be presented as foundational practice rather than their implementation or a currently maintained product. Exact coursework origins and individual third-party exercise attribution remain to be confirmed. No repository-level license file is present; this README does not add a license grant. Original history is preserved.

[Report a documentation problem](https://github.com/pasariga/IdeaProjects/issues/new). A star helps other learners find the exercise index.
