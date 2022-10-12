package com.partssearch.service;

import java.util.List;

import com.partssearch.domain.StoreUbiety;

public interface IStoreUbietyService {
	
	public List<StoreUbiety> listarUbicaciones();
	
	public StoreUbiety encontrarUbicacion(StoreUbiety storeUbiety);
	
	public void guardar(StoreUbiety storeUbiety);
	
}
