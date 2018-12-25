package com.bocsoft.rdmr.cvs.serviceImpl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.bocsoft.rdmr.cvs.api.DemoApi;
@Service(interfaceClass=DemoApi.class)
@Component
public class DemoAplImpl implements DemoApi{

	public String test() {
		return "123";
	}

}
