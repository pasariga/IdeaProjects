[English](README.md) | [简体中文](README.zh-CN.md)

# Java practice archive

A collection of independent Java learning exercises and introductory web/database projects. The repository name remains `IdeaProjects`; it is a historical study archive, not one integrated application or a production framework.

## Repository map

| Directory | What to inspect |
| --- | --- |
| `Demo/`, `Demo02/` | Java syntax, object-oriented examples and progressively organized exercises. |
| `Work/`, `HomeWork/`, `HomeWork_/` | Standalone practice and coursework; start with the individual source entry point. |
| `DataBase/` | A Maven/JDBC driver-loading example. |
| `Java_Web/` | Servlet, request and response exercises. |
| `javaweb-session-cookie/` | Session/cookie and servlet-oriented web examples. |
| `springboot-web-quickstart/` | Spring Boot web starter exercises. |
| `Mybatis/` | Spring Boot/MyBatis database-integration exercises. |

The examples show a learning progression from basic Java to HTTP handling and persistence, not evidence that every module forms a complete feature or has passed a unified test suite. The history currently has a single initial import; no later optimization results can be inferred from it.

## How to use the archive

1. Choose one subproject and inspect its `pom.xml`, source tree and entry class.
2. Import that subproject into an IDE, or compile/run its individual Java entry point where appropriate.
3. For Maven projects, run commands from the directory containing that project's POM, not the repository root.
4. Configure your own local database/container and servlet runtime when the exercise needs them.

There is **no single JDK requirement**: the Spring Boot starter POMs declare Java 17, while `DataBase/pom.xml` declares Java 25 and its source uses a compact entry form. Verify each module's actual toolchain and dependencies before running it. No global version upgrade or clean-clone build was performed in this documentation task.

Existing IDE metadata and some generated output are historical contents, not necessary setup instructions. Database schemas, credentials and external runtime availability are not standardized; do not connect an old exercise to a live production database. Do not publish new local credentials while configuring examples.

## Project boundaries and license

This archive is separate from Snapline, Dayline, ZhiBi, WenHeng and OpenEssayScore. It should be presented as foundational practice rather than their implementation or a currently maintained product. Exact coursework origins and individual third-party exercise attribution remain to be confirmed. No repository-level license file is present; this README does not add a license grant. Existing source and history are unchanged.
