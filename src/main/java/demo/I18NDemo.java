package demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.ResourceBundle;

@Slf4j
public class I18NDemo {
  public static void main(String[] args) {
    /*inCn();
    inTw();
    loc();*/
    i18n();
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
    logger.debug("Ñ§ºÅ");
  }
  public static void inTw(){
    logger.debug("ŒWÌ–");
  }
}
