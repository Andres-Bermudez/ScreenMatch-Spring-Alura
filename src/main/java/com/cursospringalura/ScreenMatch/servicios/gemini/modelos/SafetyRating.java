package com.cursospringalura.ScreenMatch.servicios.gemini.modelos;

// Clase SafetyRating
public class SafetyRating {
    private String category;
    private String probability;

    // Getters y Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
