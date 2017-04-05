package com.nexters.gathering.nexters.Model;

import java.util.Date;

/**
 * Created by Leekyeongwon on 2017-04-04.
 */

/*
* 안드로이드 스튜디오 메소드 자동생성 Alt + Insert
* */

public class Notice {
    private String noticeId;
    private String type;
    private String target;
    private String title;
    private boolean favor;
    private Date time;
    private String place;
    private String writer;
    private Date writeTime;

    public Notice()
    {
        this.noticeId = "1";
        this.type = "1";
        this.target = "넥스터즈 전체";
        this.title = "넥스터즈 공지";
        this.favor = false;
        this.time = new Date();
        this.place = "카우앤독";
        this.writer = "넥스터즈 CEO";
        this.writeTime = new Date();
    }

    public Notice(String noticeId, String type, String target, String title, boolean favor, Date time, String place, String writer, Date writeTime) {
        this.noticeId = noticeId;
        this.type = type;
        this.target = target;
        this.title = title;
        this.favor = favor;
        this.time = time;
        this.place = place;
        this.writer = writer;
        this.writeTime = writeTime;
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFavor() {
        return favor;
    }

    public void setFavor(boolean favor) {
        this.favor = favor;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "noticeId='" + noticeId + '\'' +
                ", type='" + type + '\'' +
                ", target='" + target + '\'' +
                ", title='" + title + '\'' +
                ", favor=" + favor +
                ", time=" + time +
                ", place='" + place + '\'' +
                ", writer='" + writer + '\'' +
                ", writeTime=" + writeTime +
                '}';
    }


}
