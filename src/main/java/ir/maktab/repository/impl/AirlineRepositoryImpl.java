package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.domain.Airline;
import ir.maktab.repository.AirlineRepository;

import javax.persistence.EntityManager;

public class AirlineRepositoryImpl extends BaseEntityRepositoryImpl<Airline, Long> implements AirlineRepository {

    public AirlineRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Airline> getEntityClass() {
        return Airline.class;
    }
}
