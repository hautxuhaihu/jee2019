两种异常处理方法
1. 局部异常处理
```
     <action name="exDemo" class="controller.ExDemo">
            <exception-mapping exception="java.io.IOException" result="io_ex"/>
            <result name="io_ex">/io_ex.jsp</result>
        </action>
```

2. 全局异常处理
```
<global-results>
            <result name="sql_ex">/sql_ex.jsp</result>
        </global-results>
        <global-exception-mappings>
            <exception-mapping exception="java.sql.SQLException" result="sql_ex"/>
        </global-exception-mappings>
```