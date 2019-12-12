package cn.ekgc.itrip.transport.impl;

import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.service.UserService;
import cn.ekgc.itrip.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("userTransport")
@RequestMapping("/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public User getUserByUserCode(@RequestParam String userCode) throws Exception {
		return userService.getUserByUserCode(userCode);
	}
}
