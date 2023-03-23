package com.name.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.name.model.Product;

import com.name.repo.ProductRepo;

@RestController
public class ProductController {
@Autowired
private ProductRepo repo;
@PostMapping("/save")
public Product saveProduct(@RequestBody Product pro,Model m)
{
	return  repo.save(pro);
}
@GetMapping("/get/{proid}")
public Product getOne(@PathVariable Integer proid)
{
	Product s2=repo.findById(proid).get();
	return s2;
}
@GetMapping("/getAll")
public List<Product> getAll()
{
	return(List<Product>) repo.findAll();

}
@DeleteMapping("/delete/{proid}")
public void deleteProduct(@PathVariable Integer proid,Model m)
{
	repo.deleteById(proid);
}
@DeleteMapping("/delete/{id}")
public void deleteStudent(@PathVariable Integer id,Model m)
{
	repo.deleteById(id);
}
@PutMapping("/update/{proid}")
public Product updateStudent(@RequestBody Product pro,@PathVariable Integer proid)
{
Optional<Product> option=repo.findById(proid);
Product p1=option.get();
p1.setName(pro.getName());
p1.setPrice(pro.getPrice());
p1.setQuntity(pro.getQuntity());
return repo.save(p1);


}
}
