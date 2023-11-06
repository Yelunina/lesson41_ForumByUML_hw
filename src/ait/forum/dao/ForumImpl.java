package ait.forum.dao;

import ait.forum.model.Post;

import java.time.LocalDate;
import java.util.Comparator;

public class ForumImpl implements Forum {
    private Post[] posts;
    private int size;
    Comparator<Post> comparator = (p1, p2) -> {
        int res = Integer.compare(p1.getPostId(), p2.getPostId());
        return res != 0 ? res :p1.getAuthor().compareTo(p2.getAuthor());

    };

    public ForumImpl() {
        posts = new Post[0];
    }

    @Override
    public boolean addPost(Post post) {
        return false;
    }

    @Override
    public boolean removePost(int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        return false;
    }

    @Override
    public Post getPostById(int postId) {
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        return new Post[0];
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        return new Post[0];
    }

    @Override
    public int size() {
        return size;
    }

}
