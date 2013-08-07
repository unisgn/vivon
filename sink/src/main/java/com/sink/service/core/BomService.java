package com.sink.service.core;

public interface BomService {
	
	public Bom getBomByMaterial(Material material);
	public Bom getBomById(int id);

	public void addBom(Bom bom);
	public void updateBom(Bom bom);
	public void toggleActiveOfBom(int id);



}
