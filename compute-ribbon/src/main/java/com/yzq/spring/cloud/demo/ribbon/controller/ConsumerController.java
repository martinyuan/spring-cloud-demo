package com.yzq.spring.cloud.demo.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yzq.spring.cloud.demo.ribbon.service.ComputeService;

@RestController
public class ConsumerController {

	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return computeService.addService();
	}

}