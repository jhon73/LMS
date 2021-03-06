package com.example.bhoomi.lms.APIModel.AddScheduleClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddScheduleClassData {

@SerializedName("id")
@Expose
private String id;
@SerializedName("time_zone")
@Expose
private String timeZone;
@SerializedName("keywords")
@Expose
private String keywords;
@SerializedName("price")
@Expose
private String price;
@SerializedName("class_title")
@Expose
private String classTitle;
@SerializedName("class_id")
@Expose
private String classId;
@SerializedName("tuter_id")
@Expose
private String tuterId;
@SerializedName("date")
@Expose
private String date;
@SerializedName("start_time")
@Expose
private String startTime;
@SerializedName("end_time")
@Expose
private String endTime;
@SerializedName("profile_image")
@Expose
private String profileImage;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getTimeZone() {
return timeZone;
}

public void setTimeZone(String timeZone) {
this.timeZone = timeZone;
}

public String getKeywords() {
return keywords;
}

public void setKeywords(String keywords) {
this.keywords = keywords;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

public String getClassTitle() {
return classTitle;
}

public void setClassTitle(String classTitle) {
this.classTitle = classTitle;
}

public String getClassId() {
return classId;
}

public void setClassId(String classId) {
this.classId = classId;
}

public String getTuterId() {
return tuterId;
}

public void setTuterId(String tuterId) {
this.tuterId = tuterId;
}

public String getDate() {
return date;
}

public void setDate(String date) {
this.date = date;
}

public String getStartTime() {
return startTime;
}

public void setStartTime(String startTime) {
this.startTime = startTime;
}

public String getEndTime() {
return endTime;
}

public void setEndTime(String endTime) {
this.endTime = endTime;
}

public String getProfileImage() {
return profileImage;
}

public void setProfileImage(String profileImage) {
this.profileImage = profileImage;
}

}