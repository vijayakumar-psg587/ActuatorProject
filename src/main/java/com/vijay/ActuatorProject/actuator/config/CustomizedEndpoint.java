package com.vijay.ActuatorProject.actuator.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomizedEndpoint implements Endpoint<List<String>>  {

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "acutatorEndpoint";
	}

	@Override
	public List<String> invoke() {
		// TODO Auto-generated method stub
		List<String> messages = new ArrayList<>();
		messages.add("info1");
		messages.add("info1");
		return messages;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSensitive() {
		// TODO Auto-generated method stub
		return false;
	}

}
