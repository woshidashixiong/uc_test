package user

import org.apache.log4j.Logger

/**
  * Created by admin on 2018/6/1.
  */
object MainClass {

  private final val logger = Logger.getLogger(MainClass.getClass)

  def init(args: Array[String]):Tuple3[String,String,String] = {
    var dateInterval = "7"
    var currentDate = ""
    if (args != null && !args.isEmpty){
        if(){

        }

    }else{

    }
    ("","","")
  }

  def insertUserLabel2Hbase(args: Array[String]): Unit = {
    init(args)
  }

  def main(args: Array[String]): Unit = {
    insertUserLabel2Hbase(args)
  }
}
