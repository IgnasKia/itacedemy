import { Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import { Posts } from '../../models/posts-data';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  @Input() post;
  @Output() readComment = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }
  
}
