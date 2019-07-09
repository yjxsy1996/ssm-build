package com.yuanfeng.service.impl;/**
 * Created by yuanfeng on 2019/7/9 16:58
 */

import com.yuanfeng.mapper.SysUserMapper;
import com.yuanfeng.pojo.SysUser;
import com.yuanfeng.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *@ClassName SysUserServiceImpl
 *@Description T0D0
 *@Author yuanfeng
 *@Date 2019/7/9 16:58
 *@Version 1.0
 **/

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser login(SysUser sysUser) {
        return sysUserMapper.login(sysUser);
    }
}
