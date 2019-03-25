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
没有输入不会校验。需要先用requiredstring保证输入值

#### visitor
```
    <field name="stu">
        <field-validator type="visitor">
            <param name="appendPrefix">true</param>
            <message>stu.visitor</message>
        </field-validator>
    </field>
```