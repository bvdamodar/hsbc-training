import { Component, OnInit } from '@angular/core';
import { employees } from '../Emp';

@Component({
  selector: 'app-emp',
  templateUrl: './emp.component.html',
  styleUrls: ['./emp.component.css']
})
export class EmpComponent implements OnInit {

  public empList=employees;

 public dataFlag=true;

  constructor() { }

  ngOnInit(): void {
  }

  public onClick(){
    if(this.dataFlag==false)
    this.dataFlag=true;
    else
    this.dataFlag=false;
  }

}