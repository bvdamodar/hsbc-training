import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';
import { empdata } from '../empdata';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  constructor( private _service:EmpServiceService) { }
  // public empList = empdata;

  // public es2:EmpServiceService = new EmpServiceService();
  public empList:IEmployee[] = this._service.listAllEmployees();
  // public empList = this.es2.empList;

  public dataFlag = true;

  public onClick(){
    if(this.dataFlag == true)
    this.dataFlag = false;
    else
    this.dataFlag = true;

  }


  ngOnInit(): void {
  }

}
