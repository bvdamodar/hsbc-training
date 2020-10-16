import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-json',
  templateUrl: './emp-json.component.html',
  styleUrls: ['./emp-json.component.css']
})
export class EmpJsonComponent implements OnInit {

  public empList:IEmployee[];

  constructor(private _service:EmpServiceService) { }

  ngOnInit(): void {
    // this._service.getJsonData().subscribe(value => console.log(value));
    this._service.getJsonData().subscribe(value => this.empList=value );
  }


}
