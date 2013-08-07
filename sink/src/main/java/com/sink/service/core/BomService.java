package com.sink.service.core;

import com.sink.domain.core.Bom;
import com.sink.domain.core.Material;

public interface BomService {
	
	public Bom getBomByMaterial(Material material);
	public Bom getBomById(int id);

	public void addBom(Bom bom);
	public void updateBom(Bom bom);
	public void toggleActiveOfBom(int id);



}
