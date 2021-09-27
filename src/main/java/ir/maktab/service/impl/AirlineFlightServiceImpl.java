package ir.maktab.service.impl;

import ir.maktab.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.domain.AirlineFlight;
import ir.maktab.repository.AirlineFlightRepository;
import ir.maktab.service.AirlineFlightService;

import java.util.List;

public class AirlineFlightServiceImpl extends BaseEntityServiceImpl<AirlineFlight, Long, AirlineFlightRepository> implements AirlineFlightService {

    public AirlineFlightServiceImpl(AirlineFlightRepository repository) {
        super(repository);
    }


    @Override
    public List<AirlineFlight> findByAirlineId(Long airlineId) {
        return repository.findByAirlineId(airlineId);
    }

    @Override
    public List<AirlineFlight> findByCities(String initialCity, String destinationCity) {
        return repository.findByCities(initialCity, destinationCity);
    }
}
