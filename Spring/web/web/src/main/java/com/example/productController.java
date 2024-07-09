package com.example.web;

@RestController
public class productController{
@Autowired
    ProductService service;
@RequestMapping("/product")
public list<Product>getProduct()
{
  
    return service.getProduct();
}
}