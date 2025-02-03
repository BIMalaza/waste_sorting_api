package com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.controllers;

import com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.models.WasteCategory;
import com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.services.WasteCategoryService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waste-categories")
public class WasteCategoryController {
    private final WasteCategoryService service;

    // Constructor injection for dependency management
    public WasteCategoryController(WasteCategoryService service) {
        this.service = service;
    }

    // Get all waste categories
    @GetMapping
    public ResponseEntity<List<WasteCategory>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }

    // Add a new waste category with validation
    @PostMapping
    public ResponseEntity<?> addCategory(@Valid @RequestBody WasteCategory category) {
        if (category.getName() == null || category.getDisposalGuideline() == null) {
            return ResponseEntity.badRequest().body("Invalid request: name and disposal guideline are required");
        }
        return ResponseEntity.ok(service.saveCategory(category));
    }
}
