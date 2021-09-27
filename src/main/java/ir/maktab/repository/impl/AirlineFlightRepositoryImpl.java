package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.domain.AirlineFlight;
import ir.maktab.repository.AirlineFlightRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class AirlineFlightRepositoryImpl extends BaseEntityRepositoryImpl<AirlineFlight, Long> implements AirlineFlightRepository {

    public AirlineFlightRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<AirlineFlight> getEntityClass() {
        return AirlineFlight.class;
    }

    @Override
    public List<AirlineFlight> findAllAirlineId(Long airlineId) {
        return getEntityManager().createQuery(
                " from AirlineFlight a where a.airline.id = :airline_id", AirlineFlight.class)
                .setParameter("airline_id", airlineId)
                .getResultList();
    }
}
