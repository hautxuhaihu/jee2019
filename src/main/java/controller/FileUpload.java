package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.*;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileUpload extends ActionSupport {
  @Setter @Getter
  File upload;
  @Setter @Getter
  String uploadContentType;
  @Setter @Getter
  String uploadFileName;
  @Override public String execute(){
    String realPath= ServletActionContext.getServletContext().getRealPath("/upload");
    Path destPath= Paths.get(realPath,uploadFileName);
    try {
      Files.copy(upload.toPath(),destPath, StandardCopyOption.REPLACE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
      return ERROR;
    }
    return SUCCESS;
  }

}
