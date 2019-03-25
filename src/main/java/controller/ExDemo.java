package controller;

import com.opensymphony.xwork2.ActionSupport;

import java.io.IOException;
import java.sql.SQLException;

import static java.lang.Math.random;

public class ExDemo extends ActionSupport {
  @Override public String execute() throws Exception{
    double number=Math.random();
    if(number>0.5) throw new IOException("file not found");
    else throw new SQLException("table not found");
  }
}
