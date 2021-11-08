package example.generics

trait Repository[AggregateIdType, AggregateType] {
  def save(aggregate: AggregateIdType): Unit
  def search(id: AggregateIdType): AggregateType
}

class UserRepository extends Repository[UserId, User] {
  def search(id: UserId): User = User(id)
  def save(aggregate: UserId): Unit = ()
}