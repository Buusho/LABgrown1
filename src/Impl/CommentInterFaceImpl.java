package Impl;

import InterFace.CommentInterface;
import Model.Comment;
import Model.Post;
import Model.User;

import java.util.ArrayList;

public class CommentInterFaceImpl implements CommentInterface {
    private  DataBase dataBase;
    public CommentInterFaceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

ArrayList<Comment> comments = new ArrayList<>();


    @Override
    public void saveComment(long postId, long userId, Comment comment) {
        for (User user:dataBase.getUsers()) {

        }



    }

    @Override
    public void commentByPostId(long postId) {
        for (Post post : dataBase.
             ) {

        }
        
        
    }

    @Override
    public void updateComment(long commentId, String newText) {


    }

    @Override
    public void deleteComment(Comment comment) {

    }
}
