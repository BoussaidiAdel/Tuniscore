import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { Post } from '../Models/Post';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  p: Post[] = [];           // Latest posts
  all: Post[] = [];         // All posts
  allposts: boolean = false; // Toggle state for viewing all posts
  user: any;

  constructor(
    private http: HttpClient,
    private router: Router,
    private sharedService: SharedService
  ) {}

  ngOnInit(): void {
    this.fetchLatestPosts();
    this.fetchAllPosts();
    this.user = this.sharedService.getuser(); // Fetch user only once
  }

  private fetchLatestPosts(): void {
    // Fetch the first set of latest posts with a limit of 2
    this.http.get<Post[]>('http://127.0.0.1:9000/api/posts?limit=2')  // Adjusted endpoint to include limit
      .subscribe(
        (response: Post[]) => {
          this.p = response;
          console.log("Latest Posts:", this.p);
        },
        (error) => {
          console.error("Error fetching latest posts:", error);
        }
      );
  }
  

  private fetchAllPosts(): void {
    // Fetch all posts
    this.http.get<Post[]>('http://127.0.0.1:9000/api/posts/all')
      .subscribe(
        (response: Post[]) => {
          this.all = response;
          console.log("All Posts:", this.all);
        },
        (error) => {
          console.error("Error fetching all posts:", error);
        }
      );
  }

  arrayBufferToBase64(buffer: ArrayBuffer): string {
    const bytes = new Uint8Array(buffer);
    return btoa(String.fromCharCode(...bytes)); // Using spread operator for clarity
  }

  allp(): void {
    this.allposts = !this.allposts; // Toggle the state for viewing posts
    console.log("Toggle view for posts:", this.allposts);
  }
}
