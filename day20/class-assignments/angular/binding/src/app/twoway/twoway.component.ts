import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-twoway',
  template: `
  <h1>{{title}}</h1>
  <hr>
  <input type="text" name ="username" value="" #textInput  />
  <button (click)="onClick(textInput.value)"  >Update Text</button><br>
  <h2>{{data}}</h2>
  <input type="text" name ="username" value="" [(ngModel)]="data"  />
  `,
  styles: [
  ]
})
export class TwowayComponent implements OnInit {

  title = "Learning Angular Two Way Binding";

  public data:String = "Sample Text";

  public textInput="";

  constructor() { }

  ngOnInit(): void {
  }

  public onClick(value:String){
    // this.data = "New Text";
    this.data = value;
  }
}
