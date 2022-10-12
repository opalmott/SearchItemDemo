package com.partssearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.partssearch.dao.IStoreUbietyDao;
import com.partssearch.domain.StoreUbiety;
import com.partssearch.domain.StoreUbietyId;

@Service
public class StoreUbietyServiceImpl implements IStoreUbietyService {
	
	@Autowired
	private IStoreUbietyDao storeUbietyDao;

	@Override
	@Transactional(readOnly = true)
	public List<StoreUbiety> listarUbicaciones() {
		// TODO Auto-generated method stub
		return (List<StoreUbiety>) storeUbietyDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public StoreUbiety encontrarUbicacion(StoreUbiety storeUbiety) {
		// TODO Auto-generated method stub
		StoreUbietyId storeUbietyId = new StoreUbietyId();
		storeUbietyId.setIdProd(storeUbiety.getIdProd());
		storeUbietyId.setIdStore(storeUbiety.getIdStore());
		return storeUbietyDao.findById(storeUbietyId).orElse(null);
	}
	
	@Override
	@Transactional
	public void guardar(StoreUbiety storeUbiety) {
		storeUbietyDao.save(storeUbiety);
	}
	

}
