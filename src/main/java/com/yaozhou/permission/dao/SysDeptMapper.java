package com.yaozhou.permission.dao;

import com.yaozhou.permission.model.SysDept;

import java.util.List;

public interface SysDeptMapper {

    int deleteByPrimaryKey(Integer deptId);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    String selectLevelByPrimaryKey(Integer deptId);

    SysDept selectByPrimaryKey(Integer deptId);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);

    List<SysDept> getAllDept();

}