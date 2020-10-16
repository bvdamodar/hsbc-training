import { Component, OnInit } from '@angular/core';
import { EmpServiceService } from '../emp-service.service';
import { empdata } from '../empdata';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-idlist',
  templateUrl: './emp-idlist.component.html',
  styleUrls: ['./emp-idlist.component.css']
})
export class EmpIdlistComponent implements OnInit {

  // public empList = empdata;
  // public empList = this._service.listAllEmployees();
  public empList:IEmployee[] ;
  public dataFlag = true;

  public onClick(){
    if(this.dataFlag == true)
    this.dataFlag = false;
    else
    this.dataFlag = true;

  }

  public findEmp(empId:Number){
    console.log("Clicked the Item of Employee "+empId);
  }
  
  constructor( private _service:EmpServiceService) { }

  

  ngOnInit(): void {
    this.empList = this._service.listAllEmployees();
  }

}
