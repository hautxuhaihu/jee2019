package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;

import javax.servlet.Servlet;
import java.io.InputStream;

public class FileDown extends ActionSupport {
  public InputStream getXml(){
    //从类路径下找文件
    return getClass().getResourceAsStream("/struts.xml");
  }
  public InputStream getTxt(){
    //从网站根目录找文件
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
