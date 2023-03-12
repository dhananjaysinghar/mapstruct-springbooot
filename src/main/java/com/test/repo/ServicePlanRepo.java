package com.test.repo;

import com.test.entity.ServicePlanEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePlanRepo extends ReactiveMongoRepository<ServicePlanEntity, String> {}
