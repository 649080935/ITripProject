package cn.ekgc.itrip.dao;

import cn.ekgc.itrip.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao {
	List<User> findUserByQuery(Map<String, Object> queryMap) throws Exception;
}
