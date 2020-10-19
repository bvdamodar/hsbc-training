import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { IEmp } from '../iemp';

@Component({
  selector: 'app-hr-page',
  templateUrl: './hr-page.component.html',
  styleUrls: ['./hr-page.component.css']
})
export class HrPageComponent implements OnInit {

  constructor(private _service: EmpService) { }

  ngOnInit(): void {
  }

  public emp: IEmp;

  public getEmpDetails(id: String) {
    this._service.getEmpDetails(id).subscribe(data => this.emp = data);
  }

}
