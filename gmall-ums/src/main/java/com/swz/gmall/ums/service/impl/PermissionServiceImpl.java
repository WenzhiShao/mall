package com.swz.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swz.gmall.ums.entity.Permission;
import com.swz.gmall.ums.mapper.PermissionMapper;
import com.swz.gmall.ums.service.PermissionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-03-02
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
