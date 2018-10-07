# git使用笔记

标签（空格分隔）： git
###### create date : 2018-09-27 20:52:26
---
### 一、安装git
    Ubuntu 安装 Git： apt-get install git  
    CentOS 安装 Git： yum install git  
    查看 Git 版本信息： git version  
### 二、配置本地git账号
    git config --global user.email "you@example.com"
    git config --global user.name "Your Name"
### 三、开启SSH服务
    [如果已经开启SSH,请跳过此步骤]
    Ubuntu 安装 SSH：  apt-get install ssh 
    查看 SSH 服务状态： ps -e | grep sshd
### 四、生成SSH KEY
    ssh-keygen -t rsa -C "you@example.com"
    生成 ssh key 过程中，会让你填写 passphrase，按回车Enter设置空密码
### 五、查看生成的SSH KEY文件
    cd ~/.ssh
>*.ssh目录
>id_rsa
>id_rsa.pub

### 六、复制 SSH KEY
    more id_ras.pub
    得到:
    ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCt2Fxo60NeqW0nSwtss5zT7XM9E8FFrJt3/z9vYMBazNTc8Y88FtEqlCNtTl6HLlT8SgFc7YSDTkYm9HvLcQ3YX2PjFCycAABDALD3g5zeaP1tbUfvSpO4EOGwAqol01u196tev7q5GufImn9gxYhIme55qFVA2PutHFvG83Wy3D6Mn4FCcz+3bHki8OZBWnyr0BHiY7s9ZTn0JPQnVeyP7F6PFUQ84lOyUVvifG/Vvd5DimUOJ0ginVuSZpBDbOi0qYWX1q9Jqpd10zrkM6FtjKQt6aZHyL3y3481Htz8morzjuXe5/XldNvI2whuOAfGoV5IfKBgKrHv+qh8+fbD you@example.com
### 七、设置 SSH KEY
    1) 登录github ，选择Settings，选择SSH and GPG keys
    2) 选择 NEW SSH key 按钮
    3) Key输入刚刚生成的id_ras.pub内容
    4) 选择Add SSH key按钮进行保存
### 八、创建GitHub仓库
    1) 选择New repository
    2) 输入Repository name资源仓库名称
    3）选择Public 公共仓库
    4) 选择Create repository 创建仓库
    5) 得到仓库的HTTPS和SSH地址
### 九、克隆仓库到本地
    git clone git@github.com:*/*.git
### 十、常用命令
    添加文件 git add readme.md
    提交文件到git本地库 git commit -m "add readme file"
    上传到git远程库 git push
    查看分支列表 git branch -a
    创建本地分支 git checkout -b test
    提交本地分支到远程库 git push origin test
    合并主分支到test分支 git branch --set-upstream-to=origin/test
    更新分支文件到本地 git pull
    切换分支 git checkout master
    查看文件状态 git status
    添加所有文件 git add .

### git 常用命令速查表
    * 创建版本库
    git clone [url]                     #克隆远程版本库
    git init                            #初始化本地版本库
    
    *修改和提交
    git status                          #查看状态
    git diff                            #查看变更内容
    git add .                           #跟踪所有改动过的文件
    git add [file]                      #跟踪指定的文件
    git mv [old] [new]                  #文件改名
    git rm [file]                       #删除文件
    git rm --cached [file]              #停止跟踪文件但不删除
    git commit -m "commit messages"     #提交所有更新过的文件
    git commit --amend                  #修改最后一次改动
    
    * 查看提交历史
    git log                             #查看提交历史
    git log -p [file]                   #查看指定文件的提交历史
    git blame [file]                    #以列表方式查看指定文件的提交历史

    * 撤销
    git reset --hard HEAD               #撤销工作目录中所有未提交文件的修改内容
    git checkout HEAD [file]            #撤销指定的未提交文件的修改内容
    git revert [commit]                 #撤销指定的提交
    git log --before="1 days"           #退回到之前1天的版本

    * 分支与标签
    git branch                          #显示所有本地分支
    git checkout [branch/tag]           #切换到指定分支和标签
    git branch [new-branch]             #创建新分支
    git branch -d [branch]              #删除本地分支
    git tag                             #列出所有本地标签
    git tag [tagname]                   #基于最新提交创建标签
    git tag -d [tagname]                #删除标签

    * 合并与衍合
    git merge [branch]                  #合并指定分支到当前分支
    git rebase [branch]                 #衍合指定分支到当前分支
    
    * 远程操作
    git remote -v                       #查看远程版本库信息
    git remote show [remote]            #查看指定远程版本库信息
    git remote add [remote] [url]       #添加远程版本库
    git fetch [remote]                  #从远程库获取代码
    git pull [remote] [branch]          #下载代码及快速合并
    git push [remote] [branch]          #上传代码及快速合并
    git push [remote] :[branch/tag-name]#删除远程分支或标签
    git push --tags                     #上传所有标签
    
    
    
    
    







