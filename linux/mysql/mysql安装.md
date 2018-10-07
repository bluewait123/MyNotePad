# mysql安装

标签（空格分隔）： linux mysql

###### create datee 2018-09-29 18:02:40
---

### 安装mysql
    apt-get install mysql-server mysql-client
    
### 设置mysql
    将mysql加入到系统服务 chkconfig --add mysql
    将mysql设置开机启动 chkconfig mysql on
    
###### 注意：在这里可能chkconfig没有安装，如果是的话 ，则需要安装chkconfig命令
    apt-get install chkconfig

### 远程与开放端口
    grant all privileges on *.* to 'root' @'%' identified by 'root';
    flush privileges;
    
### 开放Linux的对外访问端口3306：
    /sbin/iptables -I INPUT -p tcp --dport 3306 -j ACCEPT
    /etc/rc.d/init.d/iptables save ---将修改永久保存到防火墙中

### 修改root密码
    1.修改mysql配置文件 vi /etc/mysql/mysql.conf.d/mysqld.cnf
    2.在[mysqld] 字段中加入 skip-grant-tables=1
    3.保存后，重启mysql
        -> service mysql restart
        -> systemctl restart mysql.service
    4.登录mysql mysql -u root -p 
    5.输入flush privileges；
    6.修改密码
        -> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '要设置的密码';
        -> ALTER USER 'root'@127.0.0.1 IDENTIFIED WITH mysql_native_password BY '要设置的密码';
    7.删掉配置文件中的skip-grant-tables=1
    8.重启mysql,再次登录root用户，输入新密码
    
### 错误处理
    1.ERROR 1290 (HY000): The MySQL server is running with the --skip-grant-tables option so it cannot execute this statement
    解决办法: flush privileges
    
    2.Error: Cannot retrieve repository metadata (repomd.xml) for repository: InstallMedia. Please verify its path and try again
    You could try using --skip-broken to work around the problem
    You could try running: rpm -Va --nofiles --nodigest
    解决办法: 将/etc/yum.repo.s下删除packetxxxx.repo和redhat.repo