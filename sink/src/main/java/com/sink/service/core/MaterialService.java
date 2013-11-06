package com.sink.service.core;

public interface MaterialService {

    public Material findMaterialById(int id);
    public Material findMaterialByCode(String code);
    public Material findMaterialByNumber(String number);
    
    public List<Material> findMaterialsByCategory(MaterialCategory category);

    public List<Material> findMaterialsByPropertySet(Set<MaterialPropertyValue> propertySet);

    public List<Material> searchMaterials(String searchKey);

    public int addMaterial(Material material);

    public void updateMaterial(Material material);
    public void toggleActiveOfMaterial(int id);
}
