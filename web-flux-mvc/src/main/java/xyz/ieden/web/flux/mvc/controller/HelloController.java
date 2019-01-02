package xyz.ieden.web.flux.mvc.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lianghongwei01
 * @date 2019/1/2 17:27
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value = "{id}")
    public JSONObject getReqData(@PathVariable(value = "id") Integer id) {
        LOGGER.info("Request Param:{}.", id);
        JSONObject resData = new JSONObject();
        resData.put("reqId", id);
        resData.put("resStr", "Hello World.");
        resData.put("resDate", new Date());

        LOGGER.info("Response Data:{}.", resData.toJSONString());

        return resData;
    }

}
