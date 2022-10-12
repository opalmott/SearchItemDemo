package com.partssearch;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.partssearch.domain.StoreUbiety;
import com.partssearch.service.IStoreUbietyService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ControladorInicio {
	
	@Autowired
	private IStoreUbietyService storeUbietyService; 
	
	@GetMapping("/")
	public String Inicio(Model model){
		
		model.addAttribute("mensaje", "probando model...");
		model.addAttribute("saludo", "Que hubole mundo desde timeleaf y spring boot ...");
		
//		Iterable<StoreUbiety> storeUbieties = storeUbietyDao.findAll();
		List<StoreUbiety> storeUbieties = storeUbietyService.listarUbicaciones();
		
		log.info("Ejecutando el controlador spring MVC - info");
		model.addAttribute("ubieties", storeUbieties);
		
		// busca la ubicacion de 258 y 3
		StoreUbiety storeUbiety = new StoreUbiety();
		storeUbiety.setIdProd(258);
		storeUbiety.setIdStore(3);
		
		StoreUbiety storeUbiety2 = storeUbietyService.encontrarUbicacion(storeUbiety);
		
		model.addAttribute("ubiety", storeUbiety2);
		
		return "index";
	}
	
	@GetMapping("/agregar")
	public String agregar(StoreUbiety storeUbiety, Model model){
//		storeUbiety.setFecRegi(new Date());
		model.addAttribute("storeUbiety", storeUbiety);
		return "modificar";
	}
	
	@PostMapping("/guardar")
	public String guardar(StoreUbiety storeUbiety){
		log.info("Pasa por guardar");
		storeUbietyService.guardar(storeUbiety);
		return "redirect:/";
	}
	
	@GetMapping("/editar")
	public String editar(StoreUbiety storeUbiety, Model model){
		storeUbiety = storeUbietyService.encontrarUbicacion(storeUbiety);
		model.addAttribute("storeUbiety", storeUbiety);
		return "modificar";
	}
	
}
