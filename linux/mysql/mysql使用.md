# mysql使用
###### create date 2018-10-05 16:16:41
标签（空格分隔）： linux mysql

---

## 一、常用命令:
### 1）启动/停止/重启/查看状态
    systemctl start mysql.service                       --启动
    systemctl stop mysql.service                        --停止
    systemctl restart mysql.service                     --重启
    systemctl status mysql.service                      --查看状态
    service mysql start                                 --启动
    service mysql restart                               --重启
    service mysql stop                                  --停止
    service mysql status                                --查看状态
    
### 2)登录
    mysql -u root -p                                    --登录root用户 
    
### 3)数据库操作
#### 3.1) 创建数据库
    create schema [数据库名称] default character set utf8 collate utf8_general_ci;
    --创建数据库（采用create schema和create database创建数据库的效果一样）
#### 3.2) 创建用户
    create user '[用户名称]'@'%' identified by '[用户密码]';
    密码8位以上，包括：大写字母、小写字母、数字、特殊字符
    %：匹配所有主机，该地方还可以设置成‘localhost’，代表只能本地访问，例如root账户默认为‘localhost‘
#### 3.3) 用户授权数据库
    grant select,insert,update,delete,create on [数据库名称].* to [用户名称];
    *代表整个数据库
#### 3.4) 立即启用修改
    flush  privileges ;--立即启用修改
#### 3.5) 取消用户所有数据库（表）的所有权限
    revoke all on *.* from tester;
#### 3.6) 删除用户
    delete from mysql.user where user='tester';
#### 3.7) 删除数据库
    drop database [schema名称|数据库名称];
    



