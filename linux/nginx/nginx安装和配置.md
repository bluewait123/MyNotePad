# nginx

标签（空格分隔）：linux nginx
###### create date 2018-09-28 19:09:38
---

## 安装
    1) 下载 nginx-1.13.12.tar.gz
    2) 解压 tar -zxvf nginx-1.13.12.tar.gz
    3）打开nginx目录 cd nginx
    4) 执行配置并指定安装目录 ./configure --prefix=/usr/local/nginx
    5) 执行编译 make
    6) 执行安装 make install
    7) 安装完成得出目录 cd /usr/local/nginx

## 命令
    1) 启动命令 ./nginx
    2) 停止命令 ./nginx -s stop

## 配置
    1) 配置文件
        -> cd /usr/local/nginx/conf/
        -> vi nginx.conf
    2) 转发配置
        listen  80  //监听端口
        
        //转到到百度
        location / {
            proxy_pass http://www.baidu.com;
        }
        
        //访问上下文/test 转发到test.com
        location /test {
            proxy_pass http://test.com;
        }

## 报错解决fang
    1) 提示pcre不存在
        1.下载 pcre-8.40.tar.gz
        2.解压 tar -zxvf pcre-8.40.tar.gz
        3.进入解压目录 cd pcre-8.40
        4.执行配置 ./configure
        5.编译文件 make
        6.安装 make install
    
    2) 启动nginx报错
        1. ./nginx: error while loading shared libraries: libpcre.so.1: cannot open shared object file: No such file or directory
        解决办法: 
        添加软连接 ln -s /usr/local/lib/libpcre.so.1 /lib64/

