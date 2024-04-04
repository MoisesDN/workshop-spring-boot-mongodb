package com.moisesdias.ApiRestful_springboot_mongodb.resources;

import com.moisesdias.ApiRestful_springboot_mongodb.domain.Post;
import com.moisesdias.ApiRestful_springboot_mongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {

        Post obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }


}
