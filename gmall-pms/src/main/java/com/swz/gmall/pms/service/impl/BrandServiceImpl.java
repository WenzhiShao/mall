package com.swz.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swz.gmall.pms.entity.Brand;
import com.swz.gmall.pms.mapper.BrandMapper;
import com.swz.gmall.pms.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-02
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
