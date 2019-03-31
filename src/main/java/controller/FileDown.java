package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import java.io.InputStream;

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
  public InputStream getFileDown(){
    return ServletActionContext.getServletContext().getResourceAsStream(uploadPath);
  }
}
