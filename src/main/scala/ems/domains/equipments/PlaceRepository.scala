package ems.domains.equipments

import ems.shared.Result.Result
import ems.domains.reservations.ReservationError
import ems.shared.domains.Id

trait PlaceRepository {
  def findById(id: Id[Place]): Result[ReservationError, Option[Place]]
  def store(place: Place): Result[ReservationError, Place]
  def delete(place: Place): Result[ReservationError, Unit]
}
