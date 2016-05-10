package com.despegar.tpintegradorfinal.dto;

/**
 * Created by nazarenolevy on 09/05/16.
 */
public class ReviewsDto {

    private CommentsDto comments;
    private UserDto user;

    public ReviewsDto() {
    }

    public CommentsDto getComments() {
        return comments;
    }

    public void setComments(CommentsDto comments) {
        this.comments = comments;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
