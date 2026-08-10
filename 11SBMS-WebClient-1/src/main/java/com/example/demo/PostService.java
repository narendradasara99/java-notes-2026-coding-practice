package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class PostService {
	@Autowired
	private PostRepository p;
	
	// Fetch posts from external API

	public Flux<PostEntity> getPost() {
		
		WebClient webClient = WebClient.create();
		return webClient.get().uri("https://jsonplaceholder.typicode.com/posts").retrieve().bodyToFlux(PostEntity.class)
				.doOnNext(p::save);

	}

	// Get all posts from DB
	public List<PostEntity> getAllPostsFromDB() {
		return p.findAll();
	}

	// Stream posts from DB in real-time (SSE)
	public Flux<PostEntity> streamPosts() {
		return Flux.fromIterable(p.findAll()).delayElements(java.time.Duration.ofSeconds(1)); // simulate real-time
	}
}
