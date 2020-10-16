import { Component, OnInit } from '@angular/core';
import { JsonDataService } from '../json-data.service';
import { Post } from '../post';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

  public posts:Post[]=[];
  public count:Number=0;

  constructor(private _service:JsonDataService) { }

  public showCount(count:Number){
    this.count = count;
  }
  ngOnInit(): void {
    this._service.getPosts().subscribe(value => this.posts=value);
  }

  

}
