import { Component, OnInit } from '@angular/core';
import { JsonDataService } from '../json-data.service';
import { Post } from '../post';

@Component({
  selector: 'app-getpost',
  templateUrl: './getpost.component.html',
  styleUrls: ['./getpost.component.css']
})
export class GetpostComponent implements OnInit {

  public post:Post;
  constructor(private _service:JsonDataService) { }

  ngOnInit(): void {
    this.post = {userId:0,id:0,title:"",body:""};
  }

  public showPost(postId:Number){
    this._service.getPostById(postId).subscribe(value => this.post=value);
  }

}
