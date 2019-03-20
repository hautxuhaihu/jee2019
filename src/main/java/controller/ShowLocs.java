package controller;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class ShowLocs extends ActionSupport {
  @Setter @Getter
  Locale[] locs;
  @Setter @Getter
  Map<String,String> locsMap=new TreeMap<>();
  @Override
  public String execute() throws Exception {
    locs=Locale.getAvailableLocales();
    for(Locale loc:locs){
      locsMap.put(loc.toString(),loc.getDisplayName(loc));
    }
    return super.execute();
  }
}
