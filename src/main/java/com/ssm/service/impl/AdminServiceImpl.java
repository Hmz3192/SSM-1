package com.ssm.service.impl;

import com.ssm.dao.AdminMapper;
import com.ssm.model.Admin;
import com.ssm.service.AdminService;
import com.ssm.util.SeeRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ThinKPad on 2017/6/17.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AdminServiceImpl implements AdminService{
    @Resource
    private AdminMapper adminMapper;

    public List<Admin> getAllAdmin(){return adminMapper.selectAllAdmin();}

    public int getCount() {
        return adminMapper.getCount();
    }

    public List<Admin> queryAllAdmin(SeeRecord seeRecord) {
        return adminMapper.queryAllAdmin(seeRecord);
    }

}
