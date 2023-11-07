package ait.forum.test;

import ait.forum.dao.Forum;
import ait.forum.dao.ForumImpl;
import ait.forum.model.Post;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {
    Forum forum;
    Post[] posts;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts = new Post[6];
        posts[0] = new Post(0, "t1", "a1", "photo");
        posts[1] = new Post(1, "t2", "a2", "photo");
        posts[2] = new Post(2, "t3", "a2", "photo");
        posts[3] = new Post(3, "t4", "a1", "photo");
        posts[4] = new Post(4, "t1", "a3", "photo");
        posts[5] = new Post(5, "t2", "a1", "photo");
        for (int i = 0; i < posts.length - 1; i++) {
            forum.addPost(posts[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addPost() {
        assertTrue(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
        assertFalse(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
    }

    @org.junit.jupiter.api.Test
    void removePost() {
        assertTrue(forum.removePost(3));
        assertEquals(4, forum.size());
        assertFalse(forum.removePost(3));
        assertEquals(4, forum.size());
    }

    @org.junit.jupiter.api.Test
    void updatePost() {
        assertTrue(forum.updatePost(2, "new photo"));
        assertEquals("new photo", forum.getPostById(2).getContent());
    }

    @org.junit.jupiter.api.Test
    void getPostById() {
        assertEquals(posts[1], forum.getPostById(1));
        assertNull(forum.getPostById(5));
    }

    @org.junit.jupiter.api.Test
    void getPostsByAuthor() {
        Post[] actual = forum.getPostsByAuthor("a3");
        Arrays.sort(actual);
        Post[] expected = {posts[4]};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testGetPostsByAuthor() {
        //TODO
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(5, forum.size());
    }
}