package Impl;

import InterFace.PostInterFace;
import Model.Post;
import Model.User;

import java.util.ArrayList;

public class PostInterFaceImpl implements PostInterFace {

    private  DataBase dataBase;

    public PostInterFaceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    ArrayList<Post> posts = new ArrayList<>();


    @Override
    public void savePost(long userId, Post post) {
        for (User user: dataBase.getUsers()) {
        if(user.getId()==userId){
            posts.add(post);
            System.out.println("Успешно добавлен!!");
        }
        }
    }

    @Override
    public void getPostsByUserId(long userId) {
        for (User user:dataBase.getUsers()
             ) {
            if(user.getId()==userId){
                user.getPosts();
            }
        }
    }

    @Override
    public Post searchPost(String query) {
        for (Post post:posts
             ) {
            if(post.getDescription().equals(query)){
                return post;
            }
        }
        System.out.println("Пост с таким запросом не найден");
return null;
    }

    @Override
    public void deletePostById(long postId) {

        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            if (post.getId() == postId) {
               posts.remove(i);
                System.out.println("Пост с id " + postId + " успешно удален.");
                return;
            }
        }
        System.out.println("Пост с id " + postId + " не найден.");
    }
}
