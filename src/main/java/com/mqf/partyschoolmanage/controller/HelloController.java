package com.mqf.partyschoolmanage.controller;

import com.mqf.partyschoolmanage.Entity.RespCode;
import com.mqf.partyschoolmanage.Entity.RespEntity;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "HelloController - 测试接口")

public class HelloController {

    @GetMapping(value = "/hello")
    @ApiOperation("测试方法")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "name",value = "姓名",required = true,paramType = "query"),
//            @ApiImplicitParam(name = "age",value = "年龄",required = true,paramType = "query",dataType = "Integer")
//    })
    public RespEntity hello() {
        System.out.println("123");
        System.out.println(RespCode.SUCCESS.getMsg());
        String s = "123";

        RespEntity respEntity =new RespEntity(RespCode.SUCCESS,s);
        System.out.println(respEntity);
        return respEntity;
    }

}
