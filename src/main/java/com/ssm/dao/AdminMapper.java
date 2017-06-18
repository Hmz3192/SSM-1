package com.ssm.dao;

import com.ssm.model.Admin;
import com.ssm.util.SeeRecord;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    List<Admin> selectAllAdmin();

    List<Admin> queryAllAdmin(SeeRecord seeRecord);
    /*取得记录条数信息，通过当前用户的loginName查询*/
    int getCount();


}