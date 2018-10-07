# intellij idea 设置Java快捷代码

标签（空格分隔）： 编程资料 开发工具 ide
##### create date 2018-10-05 17:28:28
---

#### 一、设置模板
    1) 选择 File -> Settings -> Editor -> Live Templates 
    2) 选择右上角的绿色＋ , 选择2.Template Group 输入Java
    3) 选择右上角的绿色＋ , 选择1.Live Template
    4）Abbreviaction 输入快捷键名称
        例如: main
    5) Template test:输入内容
        public static void main(String[] args){
            $start$
        }
    $start$用于定位光标
    6) 定义作用域
        -> 提示no applicablle contexts yet.
        -> 选择 DefineDefine
        -> 选择 Java 全选