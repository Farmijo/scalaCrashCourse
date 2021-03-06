import java.util.UUID

object GuitarBrand extends Enumeration {
  val Fender, Gibson, PRS = Value

  def hasCheapModel(brand: GuitarBrand.Value) : Boolean = ValueSet(Fender,Gibson).contains(brand)
}

GuitarBrand.hasCheapModel(GuitarBrand.PRS)


object DomainError {
  def unapply(arg: DomainError): Option[(Int, String, Map[String, Any])] =
    Some((arg.priority, arg.mnemonic, arg.context))
}

sealed abstract class DomainError(
                                   val priority: Int,
                                   val mnemonic: String,
                                   val context: Map[String, Any] = Map.empty
                                 ) extends Ordered[DomainError] {
  override def compare(that: DomainError): Int = this.priority - that.priority
}

case object TooMuchCpuLoad extends DomainError(0, "too_much_cpu_load")

case object NotEnoughDiskSpace extends DomainError(1, "not_enough_disk_space")

final case class UserWithoutPermissions(userId: UUID, action: String) extends DomainError(
  100,
  "user_without_permissions",
  Map("user_id" -> userId.toString, "action" -> action)
)