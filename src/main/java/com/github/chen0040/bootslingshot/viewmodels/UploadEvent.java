package com.github.chen0040.bootslingshot.viewmodels;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by xschen on 9/11/2017.
 */
@Getter
@Setter
public class UploadEvent {
	private String eventType = "progress";

	private Object state;

	public void setState(Object state) {
		this.state = state;
	}
	public Object getState() {
		return state;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventType() {
		return eventType;
	}

}
