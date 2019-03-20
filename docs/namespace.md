### 用途
 >The namespace attribute subdivides action configurations into logical modules, 
 java package
 
 >each with its own identifying prefix. Namespaces avoid conflicts between action names. 
 
 >Each namespace can have its own "menu" or "help" action, each with its own 
 
 ```
 namespace=""
 namespace="/"
 namespace="/sub"
 ```
 ```
 localhost/jee2019/logout.action
 网站根地址去掉后就是action的全名
 /logout.action  /
 localhost/jee2019/sub/sub.action
 /sub/sub.action /sub
 ```

### 从哪里找action
1. 自己和默认，自己没有就从默认找
2. /和其他命名空间不能互相访问 
`/sub.action`: /和默认
3. 不是路径，不能回退，是一个整体
`/cn/hn`,`/cn/hn`下没有，不会从/cn下边找

```


<!ELEMENT struts ((package|include|bean|constant)*, unknown-handler-stack?)>
|不分先后，*：0或多个
?:0或1个

<!ELEMENT action ((param|result|interceptor-ref|exception-mapping)*,allowed-methods?)>

<!ATTLIST action
    name CDATA #REQUIRED
    class CDATA #IMPLIED
    method CDATA #IMPLIED
    converter CDATA #IMPLIED
>
```