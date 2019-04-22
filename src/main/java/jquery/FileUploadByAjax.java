package jquery;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

public class FileUploadByAjax extends ActionSupport {
  @Setter
  @Getter
  File upload;
  @Setter
  @Getter
  String uploadContentType;
  @Setter
  @Getter
  String uploadFileName;
  @Getter
  String uploadPath;

  @Override
  public String execute() throws InterruptedException {
    String realPath = ServletActionContext.getServletContext().getRealPath("/upload");
    Path destPath = Paths.get(realPath, uploadFileName);
    try {
      uploadPath = "upload/" + uploadFileName;
      Files.copy(upload.toPath(), destPath, StandardCopyOption.REPLACE_EXISTING);
      TimeUnit.SECONDS.sleep(5);
    } catch (IOException e) {
      e.printStackTrace();
      return ERROR;
    }
    return SUCCESS;
  }

}
