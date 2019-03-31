为JEE2019课程准备的一个空工程，已经准备好了
- struts.xml
- web.xml
- build.gradle文件（struts2类库已设置）
- 设置好了idea中的服务器（需要根据本地计算机修改具体路径）

---
**从git中clone下来时，根据自己情况判断是否需要修改目录**

---
新建docs目录，用来存放上课内容
### 资源
[作业部落md编辑器，实时预览](https://www.zybuluo.com/mdeditor)
### Todo
- [x] 试试pull request，是不是可以先提交给给学委
- [x] 简单说下md语法
#### 入门内容
 - [x] log4j2
 - [x] session
 - [x] 注销
 - [x] 数据库中验证
   - [x] 启动数据库
   - [x] 创建表，准备数据
 - [x] 提交到Stu对象
 - [x] 提交到对象时验证，作业
 - [ ] 用s:iterator显示所有学生，作业
 ### 工具
 - [x] gradle
 - [x] log4j2
 - [x] lombok
 - [x] gretty
 - [x] junit
 #### i18n
 - [x] java中的i18n
   - [x] Locale
   - [x] 资源文件，编码，ResourceBundle
   - [x] MessageFormat，占位符
   - [x] 显示所有语言地区
  - [x] struts2中国际化
    - [x] action中显示国际化信息，占位符
    - [x] jsp中国际化信息，forward和redirect时不同，占位符
    - [x] 缺省资源文件，首页从哪取值
 #### namespace
 - [x] 缺省
 - [x] /
 - [x] /cn/hn
 ####  拦截器
  - [x] 自己声明拦截器为action设置值
  - [x] params拦截器
  - [x] 安全拦截器，全局结果和局部结果
  - [x] 拦截器堆栈、缺省拦截器等
 #### 异常处理
 - [x]  局部异常处理、全局异常处理
 #### 校验器
  - [x] int
  - [x] 从action取最大最小
  - [x] double
  - [x] requiredstring
  - [x] stringlength
  - [x] html5的email
  - [x] visitor
  - [x] fieldexpression
  - [x] expression
  - [x] 校验器短路
  - [x] 输入日期
 #### 文件上传下载
  - [x] 文件上传、拷贝
  - [x] 限制文件大小、类型、扩展名
  - [x] 多文件上传
  - [x] stream结果
    - [x] txt、附件、直接打开
    - [x] img
    - [x] 文件下载
    - [x] 中文文件名    
 #### jdbc
 - [ ] spring、redis
    - [ ] spring xml
    - [ ] spring java
    - [ ] spring jdbc
    - [ ] redis
    - [ ] cache
 - [ ] mybatis、分页
 - [ ] jdbc
 - [ ] echarts
 #### jquery
 #### app