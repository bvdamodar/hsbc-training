import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { empdata } from './empdata';
import { IEmp } from './iemp';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private http:HttpClient) { }


  private _baseUrl="http://localhost:8081/emp/";
  private _hrBaseUrl="http://localhost:9000/hr/emp/details";

  public getEmpById(id:String):Observable<IEmp>{
    return this.http.get<IEmp>(this._baseUrl+"find/"+id);
  }

  public getEmpDetails(id:String):Observable<IEmp>{
    return this.http.get<IEmp>(this._hrBaseUrl+"?id="+id);
  }

  public empList():Observable<IEmp[]>{
    return this.http.get<IEmp[]>(this._baseUrl);
  }
  
  //Old Method without Http

  // public empList2 = empdata;

  // public listAllEmployees() {
  //   return this.empList2;
  // }
  
  // public findOneEmp(empid: Number) {
  //   let emp = this.empList2.filter(function (value) {
  //     if (value.empId == empid)
  //       return value;
  //     else
  //       return null;
  //   });
  //   return emp;
  // }


  
}
