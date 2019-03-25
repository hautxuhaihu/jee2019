两种异常处理方法
1. 局部异常处理
```
     <action name="exDemo" class="controller.ExDemo">
            <exception-mapping exception="java.io.IOException" result="io_ex"/>
            <result name="io_ex">/io_ex.jsp</result>
        </action>
```