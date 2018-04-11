package com.gelaigelai.domain;

import org.springframework.aop.IntroductionAdvisor;

public class NewImage {
private String filepath;
private String title;
private String Introduction;
private Integer poemId;
public String getFilepath() {
	return filepath;
}
public void setFilepath(String filepath) {
	this.filepath = filepath;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getIntroduction() {
	return Introduction;
}
public void setIntroduction(String introduction) {
	Introduction = introduction;
}
public Integer getPoemId() {
	return poemId;
}
public void setPoemId(Integer poemId) {
	this.poemId = poemId;
}


}
