package com.partssearch.dao;

import org.springframework.data.repository.CrudRepository;

import com.partssearch.domain.StoreUbiety;
import com.partssearch.domain.StoreUbietyId;

public interface IStoreUbietyDao extends CrudRepository<StoreUbiety, StoreUbietyId> {

}
