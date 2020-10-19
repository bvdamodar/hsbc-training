import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-emp-idlist',
  templateUrl: './emp-idlist.component.html',
  styleUrls: ['./emp-idlist.component.css']
})
export class EmpIdlistComponent implements OnInit {

  public empList: IEmp[];
  
  constructor( private _service:EmpService) { }  

  ngOnInit(): void {
    this._service.empList().subscribe(data => this.empList = data);
   }

  public listAll(){
    this._service.empList().subscribe(data => this.empList = data);
  }
  
  

}
