package com.sink.service.core;

public interface MaterialService {

	public Material findMaterialById(int id);
	public List<Material> findMaterialsByCategory(MaterialCategory category, boolean active);

	public List<Material> findMaterialsByPropertySet(Set<MaterialPropertyValue> propertySet);

	public List<Material> searchMaterials(String searchKey);

	public int addMaterial(Material material);

	public void updateMaterial(Material material);



}
