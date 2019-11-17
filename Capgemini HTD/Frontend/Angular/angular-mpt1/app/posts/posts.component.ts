import { Component, OnInit } from '@angular/core';
import { Post } from '../post';
import { PostService } from '../post.service';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  selectedPost: Post = {
    userId: null,
    id: null,
    title: null,
    body: null,
    pk: null
  };

  constructor(public postService: PostService) {
    this.postService.getData();
    console.log(postService.posts);
  }
  ngOnInit() {
  }

}
