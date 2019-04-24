package jquery;

import com.opensymphony.xwork2.ActionSupport;
import dao.mapper.RegionDAO;
import domain.Region;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegionAction extends ActionSupport {
  @Setter
  @Getter
  List<Region> res, shengs, shis, xians;
  @Autowired
  RegionDAO dao;
  @Setter
  @Getter
  String term, sheng = "-1", shi = "-1";//autocompleter发送的关键字变量名

  public String findSheng() {
    shengs = dao.getAll("0");
    return SUCCESS;
  }

  public String findShi() {
    if (!sheng.equals("-1"))
      shis = dao.getAll(sheng);
    return SUCCESS;
  }

  public String findXian() {
    if (!shi.equals("-1"))
      xians = dao.getAll(shi);
    return SUCCESS;
  }

  public String findShiOrXian() {
    if (sheng.equals("-1")) return SUCCESS;
    if (shi.equals("-1")) {
      res = dao.getAll(sheng);
    } else {
      res = dao.getAll(shi);
    }
    return SUCCESS;
  }

  public String findByTerm() {
    res = dao.findByName(term);
    return SUCCESS;
  }
}
