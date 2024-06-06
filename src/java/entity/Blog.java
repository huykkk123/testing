/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Blog {

    public int id, account_id;
    public String content, img, blog_name, created_at;
    public int categoryID;

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public Blog() {
    }

    public Blog(int id, int account_id, String content, String img, String blog_name, String created_at, int categoryID) {
        this.id = id;
        this.account_id = account_id;
        this.content = content;
        this.img = img;
        this.blog_name = blog_name;
        this.created_at = created_at;
        this.categoryID = categoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBlog_name() {
        return blog_name;
    }

    public void setBlog_name(String blog_name) {
        this.blog_name = blog_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {

//    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Blog{" + "id=" + id + ", account_id=" + account_id + ", content=" + content + ", img=" + img + ", blog_name=" + blog_name + ", created_at=" + created_at + '}';
    }

}
 // chỉnh sửa định dạng
