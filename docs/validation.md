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
