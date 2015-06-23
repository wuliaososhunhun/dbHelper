package model

import java.util.Date

import model.Gender.Gender
import model.Race.Race
import model.Vip.Vip
import org.squeryl.KeyedEntity
import org.squeryl.annotations.Column

/**
 * Author: yanyang.wang
 * Date: 18/06/2015
 */
case class User(val id: Int,
                val account: String,
                val password: String,
                val vip: Vip,
                val myNotes: String) extends KeyedEntity[Int]

case class UserInfo(@Column("USER_ID")
                    val userId: Int,
                    val email: Option[String],
                    val birthday: Option[Date],
                    val gender: Gender)

case class Character(val id: Int,
                     @Column("USER_ID")
                     val userId: Int,
                     val race: Race)

