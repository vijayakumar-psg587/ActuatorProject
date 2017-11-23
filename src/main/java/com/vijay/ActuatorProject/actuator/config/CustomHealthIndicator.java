package com.vijay.ActuatorProject.actuator.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		if(checkForRegisteredClientonEurekaServer()){
			return Health.status("200").up().build();
		}else {
			return Health.down().withDetail("Error:", "There is no registered client in eureka").build();
		}
	}
	
	private boolean checkForRegisteredClientonEurekaServer(){
		return true;
	}
}
