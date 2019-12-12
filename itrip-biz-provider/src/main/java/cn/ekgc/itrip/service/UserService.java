package cn.ekgc.itrip.service;

import cn.ekgc.itrip.pojo.entity.User;

public interface UserService {

	User getUserByUserCode(String userCode) throws Exception;
}
