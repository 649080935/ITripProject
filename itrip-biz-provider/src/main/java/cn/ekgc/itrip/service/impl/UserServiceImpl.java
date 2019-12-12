package cn.ekgc.itrip.service.impl;

import cn.ekgc.itrip.dao.UserDao;
import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public User getUserByUserCode(String userCode) throws Exception {

		Map<String, Object> queryMap = new HashMap<String, Object>();
		queryMap.put("userCode", userCode);

		List<User> userList = userDao.findUserByQuery(queryMap);
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		}

		return null;
	}
}
