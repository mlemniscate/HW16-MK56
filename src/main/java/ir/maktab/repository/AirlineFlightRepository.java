package ir.maktab.repository;

import ir.maktab.base.repository.BaseEntityRepository;
import ir.maktab.domain.AirlineFlight;

import java.util.List;

public interface AirlineFlightRepository extends BaseEntityRepository<AirlineFlight, Long> {
    List<AirlineFlight> findAllAirlineId(Long airlineId);
}
