package com.partssearch.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Entity
@Table(name = "dtlinv_catalogoalmacen", schema = "ecomsys")
@IdClass(StoreUbietyId.class)
public class StoreUbiety {
	
	@Id
	@Column(name="ideprodcia")
	private Integer idProd;
	
	@Id
	@Column(name="idealma")
	private Integer idStore;
	
	@Column(name="numpiso")
	private Integer ubiFloor;
	
	@Column(name="txtstan")
	private String ubiRack;
	
	@Column(name="numfila")
	private Integer ubiRow;
	
	@Column(name="numcolu")
	private Integer ubiCol;
	
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
//    @Column(name="fecregi")
//    private Date fecRegi;
	
//	public void setFecRegi(String date){
//        try {
//            this.fecRegi = new SimpleDateFormat("dd-MM-yyyy").parse(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }		
//	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
