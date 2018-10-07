# 建立maven资源库-nexus3

标签（空格分隔）： linux nexus3
###### create date 2018-10-05 15:38:44
###### 参考 https://www.cnblogs.com/kevingrace/p/6201984.html
---

## 一、下载nexus3
    wget http://download.sonatype.com/nexus/3/latest-mac.tgz
    得到最新的nexus3 例如:nexus-3.13.0-01-mac.tgz

## 二、解压并启动
    解压nexus压缩包: 
        tar -zxvf nexus-3.13.0-01-mac.tgz -C /usr/local/nexus
        -- 得出:nexus-3.13.0-01、sonatype-work
    进入解压后的目录: 
        cd nexus-3.13.0-01/bin
    启动nexus:
        ./nexus start
    --> 启动后，需等待一下，8081端口才会启动完成
    检查8081管理端口是否已启动:
        netstat -alpn|grep 8081

## 三、访问管理端进行配置
    打开浏览器访问：http://localhost:8081/
    默认管理员用户密码:admin/admin123

## 四、说明
##### 1.component name的一些说明： 
    1）maven-central：maven中央库，默认从https://repo1.maven.org/maven2/拉取jar 
    2）maven-releases：私库发行版jar 
    3）maven-snapshots：私库快照（调试版本）jar 
    4）maven-public：仓库分组，把上面三个仓库组合在一起对外提供服务，在本地maven基础配置settings.xml中使用。
##### 2.Nexus默认的仓库类型有以下四种：
    1）group(仓库组类型)：又叫组仓库，用于方便开发人员自己设定的仓库；
    2）hosted(宿主类型)：内部项目的发布仓库（内部开发人员，发布上去存放的仓库）；
    3）proxy(代理类型)：从远程中央仓库中寻找数据的仓库（可以点击对应的仓库的Configuration页签下Remote Storage Location属性的值即被代理的远程仓库的路径）；
    4）virtual(虚拟类型)：虚拟仓库（这个基本用不到，重点关注上面三个仓库的使用）；
##### 3.Policy(策略):表示该仓库为发布(Release)版本仓库还是快照(Snapshot)版本仓库；
##### 4.Public Repositories下的仓库 
    1）3rd party: 无法从公共仓库获得的第三方发布版本的构件仓库，即第三方依赖的仓库，这个数据通常是由内部人员自行下载之后发布上去；
    2）Apache Snapshots: 用了代理ApacheMaven仓库快照版本的构件仓库 
    3）Central: 用来代理maven中央仓库中发布版本构件的仓库 
    4）Central M1 shadow: 用于提供中央仓库中M1格式的发布版本的构件镜像仓库 
    5）Codehaus Snapshots: 用来代理CodehausMaven 仓库的快照版本构件的仓库 
    6）Releases: 内部的模块中release模块的发布仓库，用来部署管理内部的发布版本构件的宿主类型仓库；release是发布版本；
    7）Snapshots:发布内部的SNAPSHOT模块的仓库，用来部署管理内部的快照版本构件的宿主类型仓库；snapshots是快照版本，也就是不稳定版本
    所以自定义构建的仓库组代理仓库的顺序为：Releases，Snapshots，3rd party，Central。也可以使用oschina放到Central前面，下载包会更快。
##### 5.Nexus默认的端口是8081，可以在etc/nexus-default.properties配置中修改。
##### 6.Nexus默认的用户名密码是admin/admin123
##### 7.当遇到奇怪问题时，重启nexus，重启后web界面要1分钟左右后才能访问。
##### 8.Nexus的工作目录是sonatype-work（路径一般在nexus同级目录下）



