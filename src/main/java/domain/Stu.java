package domain;

public class Stu {
  private long id;
  private String username, pass;
  private double java, math, os;

  public Stu() {
  }

  @Override
  public String toString() {
    return "Stu{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", pass='" + pass + '\'' +
        ", java=" + java +
        ", math=" + math +
        ", os=" + os +
        '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public double getJava() {
    return java;
  }

  public void setJava(double java) {
    this.java = java;
  }

  public double getMath() {
    return math;
  }

  public void setMath(double math) {
    this.math = math;
  }

  public double getOs() {
    return os;
  }

  public void setOs(double os) {
    this.os = os;
  }
}
