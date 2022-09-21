package com.build.socialApp.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.build.socialApp.repository.postRepository;
import com.build.socialApp.Entity.Post;

@Service
public class postService {

	@Autowired
	private final postRepository postRepo;
	public postService(postRepository postRepo) {
		this.postRepo = postRepo;
	}
	
	public ArrayList<Post> submitPostToDB(Post postData){
		
		Date date= new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);
		
		postData.setPostID(UUID.randomUUID());
		postData.setDateTime(dateTime);
		
		postRepo.save(postData);
		ArrayList<Post> result=retrivePostFromDB();
		return result;
	}
	
	
	public ArrayList<Post> retrivePostFromDB(){
		ArrayList<Post> result=postRepo.findAll();
		return result;
	}
	
	public ArrayList<Post> deletePostFromDB(UUID postID){
		postRepo.deleteById(postID);
		
		ArrayList<Post> result=retrivePostFromDB();
		return result;
	}
	
	
}
