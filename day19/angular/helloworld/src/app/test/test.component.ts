import { Component } from '@angular/core';

@Component({
    selector:"test-demo",
    template:`<h3>My Test Component</h3>
    <h2>Friends</h2>
    <ul *ngFor = 'let name of names'>
        <li>{{name}}</li>
    </ul>
    
    `,
    styles:[]
  })

  
export class TestComponent {
    public names:String[] = ["Ram","Shyam","Raj"];

  }