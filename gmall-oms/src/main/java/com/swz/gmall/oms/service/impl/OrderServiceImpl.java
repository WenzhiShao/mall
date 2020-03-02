package com.swz.gmall.oms.service.impl;

import com.swz.gmall.oms.entity.Order;
import com.atguigu.gmall.oms.mapper.OrderMapper;
import com.swz.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-02
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
