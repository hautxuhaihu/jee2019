### 配置
xml配置文件定义校验规则。
validate()。
先xml，后validate方法。简单的放xml中。

#### 文件头部
```

  <!DOCTYPE validators PUBLIC
  		"-//Apache Struts//XWork Validator 1.0.3//EN"
  		"http://struts.apache.org/dtds/xwork-validator-1.0.3.dtd">
```
#### 定义校验规则
类名-validation.xml
### 校验器
#### int
```aidl
 <field name="test_int">
        <field-validator type="int">
            <param name="max">20</param>
            <!--<message>超过最大值${max}</message>-->
            <message key="test_int.outof.range"/>
        </field-validator>
    </field>
```
##### 从action中指定最大值
```
<param name="maxExpression">${maxValue}</param>
getMaxValue
```
`com\opensymphony\xwork2\validator\validators\IntRangeFieldValidator.class`
#### stringlength校验器
没有输入不会校验。需要先用requiredstring保证输入值。

#### visitor
```
    <field name="stu">
        <field-validator type="visitor">
            <param name="appendPrefix">true</param>
            <message>stu.visitor</message>
        </field-validator>
    </field> 
    
```
#### expression
唯一的非字段校验器，错误信息actionError。`<s:actionerror/>`

#### 校验器的短路
1. 非字段校验器先运行，字段校验器后运行
2. 同一个变量的多个校验器按照定义的先后顺序运行。多个非字段按照定义的先后顺序运行。

短路：校验不通过，后边的不运行