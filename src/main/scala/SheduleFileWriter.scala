import java.util.Timer

object SheduleFileWriter {

  def main(args: Array[String]): Unit = {
    val timer =  new Timer()
    var writeFile = new WriteFile()

    timer.scheduleAtFixedRate(writeFile , 0 , 10000)
  }



}
