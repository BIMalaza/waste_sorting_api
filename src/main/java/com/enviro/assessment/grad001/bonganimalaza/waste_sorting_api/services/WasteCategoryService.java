package com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.services;

import com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.models.WasteCategory;
import com.enviro.assessment.grad001.bonganimalaza.waste_sorting_api.repositories.WasteCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WasteCategoryService {
    private final WasteCategoryRepository repository;

    // Constructor injection for repository dependency
    public WasteCategoryService(WasteCategoryRepository repository) {
        this.repository = repository;
    }

    // Retrieve all waste categories
    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    // Save a new waste category
    public WasteCategory saveCategory(WasteCategory category) {
        return repository.save(category);
    }


    public Optional<WasteCategory> getCategoryById(Long id) {
        return repository.findById(id);
    }

    public WasteCategory updateCategory(Long id, WasteCategory updatedCategory) {
        WasteCategory existingCategory = repository.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        existingCategory.setName(updatedCategory.getName());
        existingCategory.setDisposalGuideline(updatedCategory.getDisposalGuideline());
        return repository.save(existingCategory);
    }

    public boolean deleteCategory(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}