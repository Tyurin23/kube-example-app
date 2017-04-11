package com.github.tyurin23.kubeexampleapp.web;

import com.github.tyurin23.kubeexampleapp.web.dto.PingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Y. Tyurin <tyurin23@gmail.com> on 29.03.17.
 */
@RestController
public class AppController {

	private final String hostname;

	private final String app;

	private long start = System.currentTimeMillis();

	@Autowired
	public AppController(@Qualifier("hostname") String hostname, @Qualifier("app") String app) {
		this.hostname = hostname;
		this.app = app;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity<PingResult> ping() {
		return ResponseEntity.ok(new PingResult(app, hostname, System.currentTimeMillis() - start));
	}
}
