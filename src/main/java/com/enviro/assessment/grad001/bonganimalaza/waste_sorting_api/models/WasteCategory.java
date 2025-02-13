package com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class WasteCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category name is required")
    private String name;

    @NotBlank(message = "Disposal guideline is required")
    private String disposalGuideline;

    public String getName() {
        return name;
    }

    public String getDisposalGuideline() {
        return disposalGuideline;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDisposalGuideline(String disposalGuideline) {
        this.disposalGuideline = disposalGuideline;
    }
}
