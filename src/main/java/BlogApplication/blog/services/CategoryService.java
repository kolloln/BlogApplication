package BlogApplication.blog.services;

import BlogApplication.blog.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {
    //Create
    public CategoryDto createCategory(CategoryDto categoryDto);

    //Update
    public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

    //Delete
    public void deleteCategory(Integer categoryId);

    //get
    public CategoryDto getCategory(Integer categoryId);

    //getAll
    List<CategoryDto> getCategories();

}
