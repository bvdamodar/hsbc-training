import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  constructor(private _service: EmpService) { }

  ngOnInit(): void {
  }

  public emp: IEmp;

  public getEmpDetails(id: String) {
    this._service.getEmpById(id).subscribe(data => this.emp = data);
  }

}
