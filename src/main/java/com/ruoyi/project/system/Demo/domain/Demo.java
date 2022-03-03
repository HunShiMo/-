package com.ruoyi.project.system.Demo.domain;

/**
 * 水环境拆分表格
 *
 * @author ray
 * @date 2021/12/12 21:47
 */
public class Demo {

    private Long id;

    private String date;

    private int hour;

    private int minute;

    private int data;

    private String note;

    private String timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", data=" + data +
                ", note='" + note + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
