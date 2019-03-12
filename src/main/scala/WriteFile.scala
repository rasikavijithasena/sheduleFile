import java.io.{File, FileWriter, PrintWriter}
import java.util.TimerTask


class WriteFile extends TimerTask {

  var count = 0

  def run(): Unit ={
    count += 1
    print("printed\n")
    //val fileSummary = "/home/cloudera/Documents/logFiles1/application.log"
    val fileSummary = "C:\\Users\\Rasika_105127\\IdeaProjects\\ShedulerLogs\\src\\main\\resources\\application.log"

    //val pw = new PrintWriter(new File(fileSummary))
    val log = "2019-03-11 13:21:18|dialog|0|none|65890|apicall|deviceadm:8083/api/devices;POST;201"+count+"\n"
    val summaryWriter = new FileWriter(fileSummary , true)

    summaryWriter.write(log)
    summaryWriter.close()

  }




}
