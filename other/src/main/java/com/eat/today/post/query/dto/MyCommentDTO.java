package com.eat.today.post.query.dto;

import lombok.Data;

@Data
public class MyCommentDTO {
    private int foodCommentNo;
    private String memberId;
    private String boardTitle;
    private String fcContent;
    private String fcDate;
}
