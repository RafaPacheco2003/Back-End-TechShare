package com.techmate.techmate.DTO;

public class SubCategoriesDTO {

    private int subCategoriesID;
    private String name;
    private String imagePath;
    private int categoryId; // ID de la categoría a la que pertenece la subcategoría
    private String categoryName; // Nuevo campo para el nombre de la categoría

    // Constructores
    public SubCategoriesDTO() {}

    public SubCategoriesDTO(int subCategoriesID, String name, String imagePath, int categoryId) {
        this.subCategoriesID = subCategoriesID;
        this.name = name;
        this.imagePath = imagePath;
        this.categoryId = categoryId;
    }

    // Getters y Setters
    public int getSubCategoriesID() {
        return subCategoriesID;
    }

    public void setSubCategoriesID(int subCategoriesID) {
        this.subCategoriesID = subCategoriesID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() { // Nuevo getter
        return categoryName;
    }

    public void setCategoryName(String categoryName) { // Nuevo setter
        this.categoryName = categoryName;
    }
}
