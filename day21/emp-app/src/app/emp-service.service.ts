import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { empdata } from './empdata';
import { IEmployee } from './iemployee';

@Injectable({
  providedIn: 'root'
})
export class EmpServiceService {

  constructor( private http:HttpClient) { }

  public empList = empdata;

  public url = "/assets/data/emp.json";

  public listAllEmployees() {
    return this.empList;
  }

  // (value) => {return value.empId == empid?value:null} 
  // this lambda can also be used inside filter instead of function
  public findOneEmp(empid: Number) {
    let emp = this.empList.filter(function (value) {
      if (value.empId == empid)
        return value;
      else
        return null;
    });
    return emp;
  }

  public getJsonData():Observable<IEmployee[]> {
    return this.http.get<IEmployee[]>(this.url);
  }
}
