package Lab03
import definitions.de._
object Threads extends App {
//    val t: Thread = Thread.currentThread
//    val name = t.getName
//    println(s"Thread: $name")
//// State of threads: // New ->  runnable -> terminated
//
//    class MyThread extends Thread{
//        override def run(): Unit = {
//            println("New thread running")
//        }
//    }
//    val t = new MyThread
//    t.start()
//    //then calls run and the OS asigns a Processor
//    t.join() //main thread into waiting state
//    println("New thread joined.")

//  Determinista
//    val t = thread {
//        Thread.sleep(1000)
//        log("New thread running.")
//        Thread.sleep(1000)
//        log("Still running.")
//        Thread.sleep(1000)
//        log("Completed.")
//    }
//    t.join()
//    log("New thread joined.")

//   No Determinista
//val t = thread { log("New thread running.") }
//    log("...")
//    log("...")
//    t.join()
//    log("New thread joined.")
//    Thread variables are shared between threads
//    var result: String = null
//    val t = thread {result = "\nTitle\n" + "=" * 5 }
//    t.join()
//    log(result)
var uidCount = 0L
    //gets the unique ID
    def getUniqueId() = this.synchronized {
        val freshUid = uidCount + 1
        uidCount = freshUid
        freshUid
    }

    //method that prints the unique ids
    def printUniqueIds(n: Int): Unit = {
        val uids = for (i<- 0 until n) yield getUniqueId()
        log(s"Generated uids: $uids")
    }
    val t = thread { printUniqueIds(5) } // runs the method in the thread 0
    printUniqueIds(5) //runs the method in thread main
    t.join()

}
