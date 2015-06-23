package model

/**
 * Author: yanyang.wang
 * Date: 18/06/2015
 */
object Gender extends Enumeration {
  type Gender = Value
  val Male = Value("M")
  val Female = Value("F")
}

object Race extends Enumeration {
  type Race = Value
  val Human = Value("Human")
  val Dwarf = Value("Dwarf")
  val Orc = Value("Orc")
  val Elf = Value("Elf")
}

object Vip extends Enumeration {
  type Vip = Value
  val Low = Value(0, "Low")
  val Medium = Value(1, "Medium")
  val High = Value(2, "High")
}
