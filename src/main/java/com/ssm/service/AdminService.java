package com.ssm.service;

import com.ssm.model.Admin;
import com.ssm.util.SeeRecord;

import java.util.List;

/**
 * Created by ThinKPad on 2017/6/17.
 */
public interface AdminService {
    List<Admin> getAllAdmin();

    int getCount();

    List<Admin> queryAllAdmin(SeeRecord seeRecord);
}
