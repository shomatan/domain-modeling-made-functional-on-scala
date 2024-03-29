package ems.domains.reservations

import ems.shared.Result.Result
import ems.domains.equipments.Equipment
import ems.domains.reservations.ReservationTags.ValidatedReservation

trait ReservationRepository {
  def store(reservation: ValidatedReservation, requestingEquipment: Equipment): Result[ReservationError, RequestedReservation]
}
