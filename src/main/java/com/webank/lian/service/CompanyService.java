package com.webank.lian.service;

import com.webank.lian.dao.CompanyDao;
import com.webank.lian.domain.Company;
import com.webank.lian.util.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	
	@Autowired
	CompanyDao companyDao;
	
	public Result login(String identification, String password) {
		//企业识别号或密码为空
		if (StringUtils.isEmpty(identification) || StringUtils.isEmpty(password)) {
			return Result.error(1, "企业识别号或密码为空");
		}
		
		//企业识别号不存在
		Company company = companyDao.getCompanyByIdentification(identification);
		if (company == null) {
			return Result.error(2, "企业识别号不存在");
		}
		
		//企业识别号或密码错误
		if (!password.equals(company.getPassword())) {
			return Result.error(3, "企业识别号或密码错误");
		}
		
		return Result.success(company.getId());
	}
}
