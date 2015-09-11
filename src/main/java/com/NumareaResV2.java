package com;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import lombok.extern.log4j.Log4j;

import org.apache.log4j.Logger;
import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

import com.sitech.core.architecture.bean.RetInfo;
/**
 * 不需要输入验证码
 * @author wangtlc
 */
@Path("/v2/res")
@Log4j
public class NumareaResV2 {
	private Logger logger = Logger.getLogger(NumareaResV2.class);

	@POST
	@Path("/numarea")
	@Produces("application/json; charset=utf-8")
	@BadgerFish
	public RetInfo numAreaQry(@FormParam("user_id") String userId) throws Exception {
		RetInfo retInfo = new RetInfo();
		retInfo.setObject(null);
		retInfo.setRetCode("wangtlc212");
		retInfo.setRetMsg("抱歉，功能尚未对您号码的归属省份开放"+userId);
		if (userId.equals("1")) {
			log.error("异常!!");
			throw new Exception("my exception");
		}
		log.info("成功！！");
		return retInfo;
	}
}
