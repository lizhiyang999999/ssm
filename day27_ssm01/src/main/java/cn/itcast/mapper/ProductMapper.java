package cn.itcast.mapper;

import cn.itcast.pojo.Product;

import java.util.List;

public interface ProductMapper {

    public List<Product> findProducts();

}