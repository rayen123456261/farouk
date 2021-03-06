package com.pfe.GestionBank.service;

import java.util.List;
import java.util.Optional;

import com.pfe.GestionBank.entity.Fiche;

public interface FicheService {
	Fiche  save(Fiche fiche);
	List<Fiche> findAll();
	Optional<Fiche> findById(int id);
	Fiche update(Fiche fiche, int id);
	void deleteFicheById(int id);	
	void deleteAll();
}
