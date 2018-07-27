package com.webank.lian.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;
import com.webank.lian.domain.Company;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CompanyDao {
    
    int insert(@Param("company") Company company);
    
    Company getCompanyByIdentification(@Param("identification") String identification);
}

