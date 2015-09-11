package com;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import lombok.extern.log4j.Log4j;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

import com.sitech.core.architecture.bean.RetInfo;
/**
 * 不需要输入验证码
 * @author liuhy_bj
 *
 * 2013-10-29
 */
@Path("/v1/res")
@Log4j
public class NumareaResV1 {

	@GET
	@Path("/numarea/{user_id}")
	@Produces("application/json; charset=utf-8")
	@BadgerFish
	public RetInfo numAreaQry(@Context HttpServletRequest request,@PathParam("user_id") String userId) throws Exception {
		RetInfo retInfo = new RetInfo();
		retInfo.setObject(null);
		retInfo.setRetCode("wangtlc11");
		retInfo.setRetMsg("抱歉，功能尚未对您号码的归属省份开放");
		if (userId.equals("1")) {
			log.error("异常!!");
			throw new Exception("my exception");
		}
		log.info("成功！！");
		return retInfo;
	}
}
