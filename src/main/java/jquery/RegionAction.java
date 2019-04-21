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
  String term;//autocompleter发送的关键字变量名

  public String findSheng() {
    shengs = dao.getAll("0");
    return SUCCESS;
  }

  public String findByTerm() {
    res = dao.findByName(term);
    return SUCCESS;
  }
}
