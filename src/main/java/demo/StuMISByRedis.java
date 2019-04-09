package demo;


import domain.Stu;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;
import java.util.*;
@Slf4j
public class StuMISByRedis {
  Jedis redis;
  StuMISByRedis(){
    redis=new Jedis("localhost");
  }

  public static void main(String[] args) {
    StuMISByRedis mis=new StuMISByRedis();
    //mis.init();
    //mis.findById(2L);
    mis.sortByScore("java",2);
  }
  public void init(){
    for(int i=0;i<10;i++){
      Stu stu=new Stu();
      stu.setUsername("redis-test-"+i);
      stu.setJava(60+Math.random()*40);
      add(stu);
    }
  }
  public void add(Stu stu){
    long id=redis.incr("stu::id");
    stu.setId(id);
    Map<String,String> val=new HashMap<>();
    val.put("id",""+stu.getId());
    val.put("username",stu.getUsername());
    val.put("java",""+stu.getJava());
    redis.hmset("stu:"+id,val);//stu:id=hash
    redis.sadd("stu:id",""+id);//stu.id=set
    redis.zadd("stu:score:java",stu.getJava(),""+id);//stu:score:java=sorted set
  }
  public void findById(long id){
    boolean isHave=redis.sismember("stu:id",""+id);
    if(!isHave){
      logger.debug("no person {}",id);
      return;
    }
    logger.debug("{}",redis.hgetAll("stu:"+id));
  }
  public void sortByScore(String course,int page){
     int start=(page-1)*3;
     int end=page*3-1;
     Set<String> ids=redis.zrange("stu:score:"+course,start,end);
     for(String id:ids){
       logger.debug("{}",redis.hgetAll("stu:"+id));
     }
  }

}
