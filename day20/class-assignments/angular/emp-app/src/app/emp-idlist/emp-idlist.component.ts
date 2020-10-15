import { Component, OnInit } from '@angular/core';
import { empdata } from '../empdata';

@Component({
  selector: 'app-emp-idlist',
  templateUrl: './emp-idlist.component.html',
  styleUrls: ['./emp-idlist.component.css']
})
export class EmpIdlistComponent implements OnInit {

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
