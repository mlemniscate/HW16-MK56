package ir.maktab.repository.impl;

import ir.maktab.base.repository.impl.BaseEntityRepositoryImpl;
import ir.maktab.domain.Service;
import ir.maktab.repository.ServiceRepository;

import javax.persistence.EntityManager;

public class ServiceRepositoryImpl extends BaseEntityRepositoryImpl<Service, Long> implements ServiceRepository {

    public ServiceRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Service> getEntityClass() {
        return Service.class;
    }
}
