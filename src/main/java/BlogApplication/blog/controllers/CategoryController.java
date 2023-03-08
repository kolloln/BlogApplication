package BlogApplication.blog.controllers;

import BlogApplication.blog.payloads.ApiResponse;
import BlogApplication.blog.payloads.CategoryDto;
import BlogApplication.blog.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    //Create
    @PostMapping("/")
    public ResponseEntity<CategoryDto>createCategory(@Valid @RequestBody CategoryDto cateoDto){
        CategoryDto createCategory=this.categoryService.createCategory(cateoDto);
        return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);
    }

    //Update
    @PutMapping("/{catId}")
    public ResponseEntity<CategoryDto>createCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer catId){
       CategoryDto updatedCategory=this.categoryService.updateCategory(categoryDto,catId);
        return new ResponseEntity<CategoryDto>(updatedCategory,HttpStatus.OK);
    }
    //Delete
    @DeleteMapping("/{catId}")
    public ResponseEntity<ApiResponse>deleteUser( @PathVariable Integer catId){
        this.categoryService.deleteCategory(catId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Category is deleted successfully!!",false),HttpStatus.OK);
    }
    //Get
    @GetMapping("/{catId}")
    public ResponseEntity<CategoryDto>getCategory(@PathVariable Integer catId){
        CategoryDto categoryDto=this.categoryService.getCategory(catId);
        return new ResponseEntity<CategoryDto>(categoryDto,HttpStatus.OK);
    }

    //get All
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>>getCategories(){
        List<CategoryDto>categories=this.categoryService.getCategories();
        return ResponseEntity.ok(categories);
    }
}
