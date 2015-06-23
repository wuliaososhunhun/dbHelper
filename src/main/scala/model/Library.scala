package model

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.Schema
import system.Setting

/**
 * Author: yanyang.wang
 * Date: 18/06/2015
 */
object Library extends Schema {
  override def name = Some(Setting.schema)

  val user = table[User]("USER")
  val userInfo = table[UserInfo]("USER_INFO")
  val character = table[Character]("CHARACTER")

  on(user)(user => declare(
    user.id       is(primaryKey, autoIncremented),
    user.myNotes  is (transient)
  ))

  on(userInfo)(uf => declare(
    uf.userId     is (primaryKey),
    uf.gender     defaultsTo (Gender.Male)
  ))
}
