package com.tarena.entity;
//问答:dddddd
public class Question {
	private String userName;
	private String date;
	private String message1;
	private String message2;

	public Question() {
	}

	public Question(String userName, String date, String message1,
			String message2) {
		super();
		this.userName = userName;
		this.date = date;
		this.message1 = message1;
		this.message2 = message2;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	@Override
	public String toString() {
		return userName + ":" + date + ":" + message1 + ":" + message2;
	}

}
