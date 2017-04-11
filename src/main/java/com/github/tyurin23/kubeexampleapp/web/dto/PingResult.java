package com.github.tyurin23.kubeexampleapp.web.dto;

/**
 * Created by Y. Tyurin <tyurin23@gmail.com> on 29.03.17.
 */
public class PingResult {

	private String app;

	private String hostname;

	private Long uptime;

	public PingResult() {
	}

	public PingResult(String app, String hostname, Long uptime) {
		this.app = app;
		this.hostname = hostname;
		this.uptime = uptime;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Long getUptime() {
		return uptime;
	}

	public void setUptime(Long uptime) {
		this.uptime = uptime;
	}

	@Override
	public String toString() {
		return "PingResult{" +
				"app='" + app + '\'' +
				", hostname='" + hostname + '\'' +
				", uptime=" + uptime +
				'}';
	}
}
