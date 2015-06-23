import Service.UserService
import org.squeryl.SessionFactory
import transaction.{SessionManager, PostgresSessionManager}
import model.{Vip, User, Library}
import org.squeryl.PrimitiveTypeMode._
import system.Setting


/**
 * Author: yanyang.wang
 * Date: 08/04/2015
 */
object Main {
  def main(args: Array[String]) {
    println("Hello world")
    val sesFactory: SessionFactory = new PostgresSessionManager(Setting.postgresUrl, Setting.postgresUser, Setting.postgresPwd)
    val service = new UserService(sesFactory)
    service.addDummyUser
  }
}
