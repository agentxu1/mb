package com.xys.mb.entities;

import lombok.Data;

import java.util.HashSet;

@Data
public class Blog extends BaseEntity {
    private String title;
    private String content;
    private User author;
    private Category category;
    private HashSet<Tag> tags;
}
