import { Component, OnInit } from '@angular/core';
import { empdata } from '../empdata';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  public empList = empdata;

  public dataFlag = true;

  public onClick(){
    if(this.dataFlag == true)
    this.dataFlag = false;
    else
    this.dataFlag = true;

  }

  constructor() { }

  ngOnInit(): void {
  }

}
