package ir.maktab.service.impl;

import ir.maktab.base.service.impl.BaseEntityServiceImpl;
import ir.maktab.domain.AirlineFlight;
import ir.maktab.repository.AirlineFlightRepository;
import ir.maktab.service.AirlineFlightService;

public class AirlineFlightServiceImpl extends BaseEntityServiceImpl<AirlineFlight, Long, AirlineFlightRepository> implements AirlineFlightService {

    public AirlineFlightServiceImpl(AirlineFlightRepository repository) {
        super(repository);
    }
}
