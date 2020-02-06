package com.chant.apiplatform.controller;


import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 文件信息 前端控制器
 * </p>
 *
 * @author peng.chen
 * @since 2019-05-24
 */
@Slf4j
@Api(tags = "Backend: 用户")
@RestController
@RequestMapping("/backend/user")
@Validated
public class UserBackendController {

	@GetMapping("/{id}")
	public String getUser(@PathVariable("id") long id) {
		return "id=" + id;
	}

	@GetMapping("/get")
	public String getUse2r(@RequestParam("id") long id) {
		return "id=" + id;
	}

}

