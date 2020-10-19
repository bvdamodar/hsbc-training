import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GreetService {

  constructor(private http:HttpClient) { }
  private _url="http://localhost:8080/greetservice/greet/";

  public getGreeting(name:String):Observable<any>{
      return this.http.get<any>(this._url+name);
  }

}
