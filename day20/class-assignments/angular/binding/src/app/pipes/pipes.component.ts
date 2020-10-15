import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  template: `
  <h1>{{title|titlecase}}</h1> <!-- 
  <h1>{{title|uppercase}}</h1>
  <h1>{{title|lowercase}}</h1>
  -->
  <h1>{{num1|percent }}</h1>
  <h1>{{num1|percent: '3.2-6' }}</h1>
  <h1>{{num1|percent: '2.2-3' }}</h1>
  
  <h1>Date: {{today|date }}</h1>
  <h1>Short Date: {{today|date :'shortDate'}}</h1>
  <h1>Long Date: {{today|date :'longDate'}}</h1>
  `,
  styles: [
  ]
})
export class PipesComponent implements OnInit {

  public title = "learning pipes";

  public num1:Number = 0.12345;

  public today= Date.now();

  constructor() { }

  ngOnInit(): void {
  }

}
