package com.project.withpet.service;


import com.project.withpet.dao.ProductDAO;
import com.project.withpet.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;


    // 01. 상품목록

    public List<Product> getProductList(int page) {
        return productDAO.getProductList(page);
    }

    // 01 -1. 리스트 데이터 카운트
    public int getCount() {
        return productDAO.getCount();
    }




//    // 02. 상품상세
//    public Product detailProduct(int pro_no) {
//        return productDAO.detailProduct(pro_no);
//    }




}

