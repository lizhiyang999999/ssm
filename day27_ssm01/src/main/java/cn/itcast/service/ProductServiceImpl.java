package cn.itcast.service;

import cn.itcast.mapper.ProductMapper;
import cn.itcast.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public Map<String, Object> findProuductMap() {

        //1.创建一个Map集合  -- 最终封装好数据的map   ;  map.put("xData",List<String>)   map.put("seriesData",List<Long>)
        Map<String,Object> map = new HashMap<String, Object>();
        //2.创建两个空的list集合,装数据  List<String> 放xData 服装的名称集合;    第二个List<Long> 放服装的数量
        List<String> xDataList = new ArrayList<String>();
        List<Long> seriesList = new ArrayList<Long>();
        //3.调用mapper查询所有的商品 List<Product>
        List<Product> list = productMapper.findProducts();
        //4.循环List<Product> 目的是给 List<String> 放xData 服装的名称集合;    第二个List<Long> 放服装的数量 赋值.
        for (Product product : list) {
            xDataList.add(product.getPname());
            seriesList.add(product.getNum());
        }
        //5.把两个list put到map集合中
        map.put("xData",xDataList);
        map.put("seriesData",seriesList);
        //6.返回map
        return map;
    }
}
