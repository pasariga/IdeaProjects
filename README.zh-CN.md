[English](README.md) · [简体中文](README.zh-CN.md)

# IdeaProjects · Java 学习与实践

**从 Java 语法出发，练到 Web 请求处理和数据库访问。**

按顺序挑选独立练习。从具体模块的源码入口或 Maven POM 开始。

| 阶段 | 模块 | 运行提示 |
| --- | --- | --- |
| 语法与面向对象 | [Demo](Demo)、[Demo02](Demo02)、[Work](Work)、[HomeWork](HomeWork) | 打开各自目录，查找对应 Java 入口。 |
| JDBC | [DataBase](DataBase) | Maven 工程，POM 声明 JDK 25。先看驱动加载示例。 |
| Servlet 与 HTTP | [Java_Web](Java_Web) | 先看父子 POM，练习请求和响应模块。 |
| Session 与 Cookie | [javaweb-session-cookie](javaweb-session-cookie) | 按模块配置 Servlet 环境。其 JDBC 练习需要本地数据库。 |
| Spring Boot | [springboot-web-quickstart](springboot-web-quickstart) | POM 声明 JDK 17。 |
| MyBatis | [启动示例](Mybatis/springboot-quickstart)、[独立子模块](Mybatis/springboot-quickstart/mybatis) | 父示例与子模块分别声明 Java 17 和 25，运行前核对数据库配置。 |

## 本地数据库练习

运行 JDBC 和 MyBatis 示例前，在本地环境中设置 `IDEA_PROJECTS_DB_PASSWORD`，使用专门的练习数据库。下方历史项目中的 IDE 文件与 `target` 产物仅作为旧存档，构建时以所选模块 POM 为准。本次尚未逐模块编译。

## 项目边界与许可

本归档与 Snapline、Dayline、智笔、文衡和 OpenEssayScore 分开管理，应作为基础学习记录展示，而不是这些应用的实现或持续维护产品。具体课程来源和个别第三方练习署名仍待确认。当前没有仓库级许可证文件，本文不新增授权；原源码和历史保持不变。

[提交学习资料反馈](https://github.com/pasariga/IdeaProjects/issues/new)。如果索引帮你找到练习，欢迎 Star。
