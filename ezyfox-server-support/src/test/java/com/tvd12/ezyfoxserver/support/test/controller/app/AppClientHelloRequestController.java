package com.tvd12.ezyfoxserver.support.test.controller.app;

import com.tvd12.ezyfox.core.annotation.EzyClientRequestController;
import com.tvd12.ezyfox.core.annotation.EzyRequestHandle;
import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.context.EzyContext;
import com.tvd12.ezyfoxserver.entity.EzySession;
import com.tvd12.ezyfoxserver.entity.EzyUser;
import com.tvd12.ezyfoxserver.event.EzyUserSessionEvent;
import com.tvd12.ezyfoxserver.support.test.controller.Hello;

@EzyClientRequestController
public class AppClientHelloRequestController {

	@EzyRequestHandle("c_hello")
	public void handleHello(EzyAppContext context, EzyUserSessionEvent event, Hello data) {
		System.out.println("app: c_hello: " + data.getWho());
	}
	
	@EzyRequestHandle("c_hello1")
	public void handleHello1(EzyAppContext context, EzyUserSessionEvent event) {
		System.out.println("app: c_hello1");
	}
	
	@EzyRequestHandle("c_hello2")
	public void handleHello2() {
		System.out.println("app: c_hello2");
	}
	
	@EzyRequestHandle("c_hello3")
	public void handleHello3(EzyUser user) {
		System.out.println("app: c_hello3");
	}
	
	@EzyRequestHandle("c_hello4")
	public void handleHello4(EzySession session) {
		System.out.println("app: c_hello4");
	}
	
	@EzyRequestHandle("c_hello5")
	public void handleHello5(EzyContext context) {
		System.out.println("app: c_hello4");
	}
	
}