import { Component, OnInit } from '@angular/core';
import { GreetService } from '../greet.service';

@Component({
  selector: 'app-greet-view',
  templateUrl: './greet-view.component.html',
  styleUrls: ['./greet-view.component.css']
})
export class GreetViewComponent implements OnInit {

  constructor(private _service:GreetService) { }

  ngOnInit(): void {
  }

  public greet = "Greeting will Arrive here";

  public showGreeting(value: String) {
      this._service.getGreeting(value).subscribe(data => this.greet=data.greet);
  }

}
