### 使用步骤
1. 在xml中声明interceptor
2. action中用interceptor-ref

**用invocation.invoke()** 调用下一个拦截器。
为action定义的结果，只能自己用
`
<result name="login">/login_s2.jsp</result>
`
定义一个全局结果，大家都用
<global-results/>