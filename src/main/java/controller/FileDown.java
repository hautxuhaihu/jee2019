package controller;

import com.opensymphony.xwork2.ActionSupport;

import java.io.InputStream;

public class FileDown extends ActionSupport {
  public InputStream getXml(){
    //从类路径下找文件
    return getClass().getResourceAsStream("/struts.xml");
  }
}
