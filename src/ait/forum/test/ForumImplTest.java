package ait.forum.test;

import ait.forum.dao.Forum;
import ait.forum.dao.ForumImpl;
import ait.forum.model.Post;

import java.time.LocalDateTime;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    Forum forum;
    Post[] posts;
    LocalDateTime now = LocalDateTime.now();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        forum =new ForumImpl();
        posts =new Post[6];
        posts[0] = new Post(0,"t1","a1","photo");
        posts[1] = new Post(1,"t2","a2","photo");
        posts[2] = new Post(2,"t3","a2","photo");
        posts[3] = new Post(3,"t4","a1","photo");
        posts[4] = new Post(4,"t1","a3","photo");
        posts[5] = new Post(5,"t2","a1","photo");
        for (int i = 0; i <posts.length ; i++) {
            forum.addPost(posts[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addPost() {
    }

    @org.junit.jupiter.api.Test
    void removePost() {
    }

    @org.junit.jupiter.api.Test
    void updatePost() {
    }

    @org.junit.jupiter.api.Test
    void getPostById() {
    }

    @org.junit.jupiter.api.Test
    void getPostsByAuthor() {
    }

    @org.junit.jupiter.api.Test
    void testGetPostsByAuthor() {
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0,forum.size());
    }
}