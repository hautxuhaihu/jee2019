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
    format();
  }
  public static void format(){
    //������Դ�ļ��У�getString
    ResourceBundle res=ResourceBundle.getBundle("demo.msg");
    String val=res.getString("age.negative");
    String result=MessageFormat.format(val,-32);
    logger.debug(result);
    logger.debug(MessageFormat.format("ѧ��-{0}������{1},{1}-{0}",1L,18));
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
    logger.debug("ѧ��");
  }
  public static void inTw(){
    logger.debug("�W̖");
  }
}
