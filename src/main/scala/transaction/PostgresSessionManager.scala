package transaction

import org.squeryl.adapters.PostgreSqlAdapter
import org.squeryl.{Session, SessionFactory}

/**
 * Author: yanyang.wang
 * Date: 22/06/2015
 */
class PostgresSessionManager(url: String, user: String, password: String) extends SessionFactory {
  Class.forName("org.postgresql.Driver")

  val connection = java.sql.DriverManager.getConnection(url, user, password)
  SessionFactory.concreteFactory = Some(() => Session.create(connection, new PostgreSqlAdapter))

  override def newSession(): Session = SessionFactory.newSession.asInstanceOf[Session]
}
