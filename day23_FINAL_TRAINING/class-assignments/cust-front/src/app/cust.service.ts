import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICust } from './icust';

@Injectable({
  providedIn: 'root'
})
export class CustService {

  constructor(private http:HttpClient) { }


  private _baseUrl="http://localhost:8081/cust/";

  public addCustomer(cust:ICust):Observable<any>{
    const headers = {'Content-Type':'application/json', 'Accept': 'text/plain' };
    return this.http.post<any>(this._baseUrl+"save",cust,{headers,responseType:'text' as 'json'});
  
  }

  public getCustById(id:String):Observable<ICust>{
    return this.http.get<ICust>(this._baseUrl+"find/"+id);
  }

  public custList():Observable<ICust[]>{
    return this.http.get<ICust[]>(this._baseUrl);
  }
}
