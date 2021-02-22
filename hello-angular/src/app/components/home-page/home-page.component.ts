import { Component, Input, OnInit } from '@angular/core';
import { Posts } from '../../models/posts-data';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  posts = Posts;

  constructor() { }

  ngOnInit(): void {
  }

  onComment() {
    alert('You are reading comments');
  }

}
