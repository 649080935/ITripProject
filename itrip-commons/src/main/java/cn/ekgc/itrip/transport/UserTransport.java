package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "itrip-biz-provider")
@RequestMapping("/user")
public interface UserTransport {

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	User getUserByUserCode(@RequestParam String userCode) throws Exception;
}
