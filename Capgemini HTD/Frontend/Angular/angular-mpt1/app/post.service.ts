import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { Post } from './post';
@Injectable({
    providedIn: 'root'
})
export class PostService {

    posts: Post[] = [];

    api = 'https://jsonplaceholder.typicode.com/posts';

    constructor(private http: HttpClient) { }

    getData() {
        this.http.get<any>(`${this.api}`).subscribe(data => {
            console.log((data));
            this.posts = data;
        });

    }

}
