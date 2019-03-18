package demo;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

@Slf4j
public class I18NDemo {
  public static void main(String[] args) {
    /*inCn();
    inTw();
    loc();*/
    //i18n();
    //format();
    order();
  }
  /**资源文件的加载顺序*/
  public static void order(){
    Locale loc=Locale.US;
    //只有zh_CN，需要en_US
    ResourceBundle res=ResourceBundle.getBundle("demo.order",loc);
    String val=res.getString("key.cn");
    logger.debug(val);
    //todo 有en资源包从哪里取？
    //todo 取zh_CN有的key，但en没有的key
    //todo s:select显示所有语言地区
  }
  public static void format(){
    //放在资源文件中，getString
    ResourceBundle res=ResourceBundle.getBundle("demo.msg");
    String val=res.getString("age.negative");
    String result=MessageFormat.format(val,-32);
    logger.debug(result);
    logger.debug(MessageFormat.format("学号-{0}，年龄{1},{1}-{0}",1L,18));
  }
  public static void i18n(){
    ResourceBundle res=ResourceBundle.getBundle("demo.msg");
    String val=res.getString("id");
    logger.debug(val);
  }
  public static void loc(){
    Locale loc=Locale.getDefault();
    logger.debug(""+loc);
    if(loc.equals("zh_CN")) inCn();
    else inTw();
  }

  public static void inCn(){
    logger.debug("学号");
  }
  public static void inTw(){
    logger.debug("學號");
  }
}
