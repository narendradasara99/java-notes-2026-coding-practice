package com.example.demo;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PostController {
	private final PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}

	// Fetch posts from external API and save to DB
	@GetMapping("/fetch")
	public Flux<PostEntity> fetchPosts() {
		return postService.getPost();
	}

	// Get all posts from DB
	@GetMapping("/get")
	public List<PostEntity> getPostsFromDB() {
		return postService.getAllPostsFromDB();
	}

	// Stream posts from DB in real-time
	@GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<PostEntity> streamPosts() {
		return postService.streamPosts();
	}

}
