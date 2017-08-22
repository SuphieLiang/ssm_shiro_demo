package com.yz.demo.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class YaoPin {
    private int id;
    private String title;
    private String sell_point;
    private int price;
    private int barcode;
    private String image;
    private int cid;
    private int status;
    private Date created;
    private Date updated;


    public YaoPin(int id, String title, String sell_point, int price, int barcode, String image, int cid, int status, Date created, Date updated) {
        this.id = id;
        this.title = title;
        this.sell_point = sell_point;
        this.price = price;
        this.barcode = barcode;
        this.image = image;
        this.cid = cid;
        this.status = status;
        this.created = created;
        this.updated = updated;
    }

    public YaoPin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSell_point() {
        return sell_point;
    }

    public void setSell_point(String sell_point) {
        this.sell_point = sell_point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "YaoPin{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sell_point='" + sell_point + '\'' +
                ", price=" + price +
                ", barcode=" + barcode +
                ", image='" + image + '\'' +
                ", cid=" + cid +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
