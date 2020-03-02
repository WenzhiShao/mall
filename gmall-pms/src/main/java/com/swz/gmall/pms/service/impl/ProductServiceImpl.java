package com.swz.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swz.gmall.pms.entity.Product;
import com.swz.gmall.pms.mapper.ProductMapper;
import com.swz.gmall.pms.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-02
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
