package transaction

import org.squeryl.Session

/**
 * Author: yanyang.wang
 * Date: 22/06/2015
 */
trait SessionManager {
  def newSession(): Session
  def shutDown(): Unit
}
