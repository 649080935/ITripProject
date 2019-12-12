package cn.ekgc.itrip.controller;

import cn.ekgc.itrip.base.controller.BaseController;
import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.pojo.vo.Dto;
import cn.ekgc.itrip.transport.UserTransport;
import cn.ekgc.itrip.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;

@RestController("authController")
@RequestMapping("/auth")
public class AuthController extends BaseController {

	@Autowired
	private UserTransport userTransport;

	@RequestMapping(value = "/api/ckusr", method = RequestMethod.GET)
	public Dto<User> checkUserCodeForRegistry(String name) throws Exception {
		Dto<User> userDto = new Dto<User>();
		if (UserUtil.checkUserCodePattern(name)){
			User user = userTransport.getUserByUserCode(name);
			if (user == null) {
				userDto.setSuccess("true");
				return userDto;
			}
		}
		userDto.setSuccess("false");
		userDto.setMsg("该邮箱地址或手机号码格式不正确，或者已被占用");
		return userDto;
	}

}
