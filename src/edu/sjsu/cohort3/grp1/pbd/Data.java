package edu.sjsu.cohort3.grp1.pbd;

public class Data {
	private static String userId;
	private static String deviceId;

	public static String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public static String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
