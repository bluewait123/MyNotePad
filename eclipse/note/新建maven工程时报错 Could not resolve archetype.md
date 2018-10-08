# 新建maven工程时报错 Could not resolve archetype

标签（空格分隔）： 编程资料 开发工具 eclipse
###### create date 2018-10-08 17:09:44
---

## 解决思路
    1.下载最新版maven-archetype-quickstart-1.1.jar
        http://www.java2s.com/Code/Jar/m/Downloadmavenarchetypequickstart11jar.htm
    2.cmd窗口cd到maven-archetype-quickstart-1.1.jar目录
    3.执行mvn install:install-file -DgroupId=org.apache.maven.archetypes -DartifactId=maven-archetype-quickstart -Dversion=1.1 -Dpackaging=jar -Dfile=maven-archetype-quickstart-1.1.jar
