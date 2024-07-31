package com.qimu.qiapibackend.controller;

import cn.hutool.core.util.StrUtil;
import com.qimu.qiapibackend.common.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public ResultData<String> hello(@RequestParam(required = false) String name) throws Exception {
        if(StrUtil.isBlank(name))
            throw new UnsupportedOperationException("无名，不允许操作");
        log.info("模拟业务操作：{}", name);
        return ResultData.success(name);
    }

}
