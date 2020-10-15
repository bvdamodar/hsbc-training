import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <button (click)="divShowHide()">Toggle Page</button>
  <div [hidden]="isDivDisabled">
  <h1 [id]="compId">{{title}}</h1>
  <hr>
  <h2 class = "text-danger">{{7+8}}</h2>
  <h2 [class] = "textStyle">
    My name is {{'Damodar'.toUpperCase()}} &nbsp;
    <input type = "text" name = "uid" [disabled]="isDisabled" /> &nbsp;
  <button (click)="changeState()">Toggle Input</button>
  </h2>
  </div>
  `,
  styles: [`
    .text-danger{ color:red}
    .text-success{ color:green}
    `
  ]
})
export class TestComponent implements OnInit {

  public title = "Learning Binding";

  public name = "Hello";
  public compId = "testId";

  public isDisabled = true; // will be disabled
  // public isDisabled=false; // will not be disabled

  public isDivDisabled = true;

  public textStyle = "text-success";
  public textStyleRED = "text-danger";

  public hasError = false;

  constructor() { }

  ngOnInit(): void {
  }

  public changeState() {
    if (this.isDisabled == true)
      this.isDisabled = false;
    else
      this.isDisabled = true;
  }

  public divShowHide() {
    if (this.isDivDisabled == true)
      this.isDivDisabled = false;
    else
      this.isDivDisabled = true;
  }

}
