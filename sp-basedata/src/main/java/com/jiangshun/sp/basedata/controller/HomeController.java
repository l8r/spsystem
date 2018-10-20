package com.jiangshun.sp.basedata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiangshun.sp.basedata.extend.BaseController;

@RestController
public class HomeController extends BaseController {

	@RequestMapping("index")
	public Object Index() {
		return Func(() -> {
			return "Hello world!"; 
		});
	}
}
