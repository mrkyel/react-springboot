package com.mrkyel.example.VO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class BoardVO {
    public int board_id;
    public String title;
    public String user_id;
    public String context;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime regDt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime updatedt;

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    public LocalDateTime getUpdatedt() {
        return updatedt;
    }

    public void setUpdatedt(LocalDateTime updatedt) {
        this.updatedt = updatedt;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "board_id=" + board_id +
                ", title='" + title + '\'' +
                ", user_id='" + user_id + '\'' +
                ", context='" + context + '\'' +
                ", regDt=" + regDt +
                ", updatedt=" + updatedt +
                '}';
    }
}
