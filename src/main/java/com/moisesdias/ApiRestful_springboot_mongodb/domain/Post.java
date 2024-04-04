package com.moisesdias.ApiRestful_springboot_mongodb.domain;

import com.moisesdias.ApiRestful_springboot_mongodb.dto.AuthorDTO;
import com.moisesdias.ApiRestful_springboot_mongodb.dto.CommentDTO;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO author;

    private List<CommentDTO> comments =new ArrayList<>();

    public Post(){
    }

    public Post(String id, Date date, String title, String body, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;

    }

    public String getId() {
        return id;
    }

    public Post setId(String id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Post setDate(Date date) {
        this.date = date;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Post setBody(String body) {
        this.body = body;
        return this;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public Post setAuthor(AuthorDTO author) {
        this.author = author;
        return this;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public Post setComments(List<CommentDTO> comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;

        return getId() != null ? getId().equals(post.getId()) : post.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }



}
