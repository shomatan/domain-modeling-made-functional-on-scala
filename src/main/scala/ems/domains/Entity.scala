package ems.domains

trait Entity[T] {

  def id: Id[T]

  def sameIdentity(b: Entity[T]): Boolean = this.id == b.id

}