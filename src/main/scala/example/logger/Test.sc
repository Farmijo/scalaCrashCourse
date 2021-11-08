

import com.sun.xml.internal.bind.api.impl.NameConverter.Standard

import scala.util.Random

object NumberWithCompanionObject {
  def apply(value: String): NumberWithCompanionObject = NumberWithCompanionObject(value = value.toInt)

  def random: NumberWithCompanionObject = NumberWithCompanionObject(value = Random.nextInt())
}

final case class NumberWithCompanionObject(value: Int) {
  val plusOne: NumberWithCompanionObject = copy(value = value + 1)
}




//
//object Email{
//  def apply(email: String): Email = {
//    if ("""(?=[^\s]+)(?=(\w+)@([\w\.]+\.[\w]+))""".r.findFirstIn(email).isEmpty)
//      throw new IllegalArgumentException
//    val temp = email.split('@')
//    Email(temp(0), temp(1))
//  }
//}
//
//final case class Email(local: String, domain: String) {
//  val email: String = local + "@" + domain
//}
//
//val mail = Email("farmijo16@gmail.com")
//mail.domain