package Service

import model.{Library, User, Vip}
import org.squeryl.PrimitiveTypeMode._
import org.squeryl.SessionFactory

/**
 * Author: yanyang.wang
 * Date: 22/06/2015
 */
class UserService(factory: SessionFactory) {
  def addDummyUser = transaction {
    Library.user.insert(User(0, "Dummy", "123456", Vip.High, "It is invisible to database"))
  }
}
