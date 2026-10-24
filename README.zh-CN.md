[English](README.md) | [简体中文](README.zh-CN.md)

# Java 学习练习归档

收录独立 Java 练习和入门 Web／数据库小项目，仓库名保留 `IdeaProjects`。这是历史学习资料，不是统一应用或生产框架。

## 目录导航

| 目录 | 阅读内容 |
| --- | --- |
| `Demo/`、`Demo02/` | Java 语法、面向对象示例及分阶段练习。 |
| `Work/`、`HomeWork/`、`HomeWork_/` | 独立练习与课程作业，从各自源码入口开始。 |
| `DataBase/` | Maven／JDBC 驱动加载示例。 |
| `Java_Web/` | Servlet、请求和响应练习。 |
| `javaweb-session-cookie/` | Session／Cookie 和 Servlet Web 示例。 |
| `springboot-web-quickstart/` | Spring Boot Web 入门练习。 |
| `Mybatis/` | Spring Boot／MyBatis 数据库集成练习。 |

这些示例体现从基础 Java 到 HTTP 和持久化的学习路径，不代表每个模块都是完整功能或已通过统一测试。当前历史只有一次初始导入，不能从中推断后续优化成果。

## 使用方法

1. 选择一个子项目，检查它的 `pom.xml`、源码目录和入口类。
2. 在 IDE 中导入该子项目，或按实际结构编译／运行独立 Java 入口。
3. Maven 命令在对应 POM 所在目录执行，不在仓库根目录统一执行。
4. 涉及数据库或 Servlet 时，配置自己的本地数据库／容器与运行环境。

仓库**没有统一 JDK 要求**：Spring Boot 入门项目的 POM 声明 Java 17，`DataBase/pom.xml` 则声明 Java 25，源码使用紧凑入口形式。运行前应逐模块核对工具链和依赖。本轮没有全局升级版本或验证全新克隆构建。

既有 IDE 元数据和部分生成输出是历史内容，不是必须照搬的配置。数据库结构、凭据和外部环境没有统一标准，不应把旧练习连到生产数据库；配置示例时也不要公开新的本地凭据。

## 项目边界与许可

本归档与 Snapline、Dayline、智笔、文衡和 OpenEssayScore 分开管理，应作为基础学习记录展示，而不是这些应用的实现或持续维护产品。具体课程来源和个别第三方练习署名仍待确认。当前没有仓库级许可证文件，本文不新增授权；原源码和历史保持不变。
