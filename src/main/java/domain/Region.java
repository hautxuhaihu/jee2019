package domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Region {
  @Getter
  @Setter
  int region_code;
  @Getter
  @Setter
  String region_name;
  int region_level;
  @Getter
  @Setter
  int parent_region_code;
}
