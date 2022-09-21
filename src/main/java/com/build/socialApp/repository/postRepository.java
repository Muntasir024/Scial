package com.build.socialApp.repository;

import java.util.ArrayList;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.build.socialApp.Entity.Post;

@Repository
public interface postRepository extends JpaRepository<Post, UUID> {

	ArrayList<Post> findAll();
	Post save(Post post);
	void deleteById(UUID postID);
}
