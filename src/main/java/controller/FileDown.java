package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class FileDown extends ActionSupport {
  public InputStream getXml(){
    //����·�������ļ�
    return getClass().getResourceAsStream("/struts.xml");
  }
  public InputStream getTxt(){
    //����վ��Ŀ¼���ļ�
    return ServletActionContext.getServletContext().getResourceAsStream("/down.txt");
  }
  @Setter @Getter
  private String uploadPath;
  @Setter @Getter
  private String uploadFileName;
  @Setter
  private String cnFileName;

  public String getCnFileName() {
    cnFileName=uploadFileName;
    try {
      cnFileName=new String(uploadFileName.getBytes(),"iso-8859-1");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return cnFileName;
  }

  public InputStream getFileDown(){
    return ServletActionContext.getServletContext().getResourceAsStream(uploadPath);
  }
}
