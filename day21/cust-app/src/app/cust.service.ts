import { Injectable } from '@angular/core';
import {custdata} from './custdata';

@Injectable({
  providedIn: 'root'
})
export class CustService {

  constructor( ) { }

  public custList = custdata;

  public listAllCustomers() {
    return this.custList;
  }

  public findOneCust(custId: Number) {
    let cust = this.custList.filter(function (value) {
      if (value.custId == custId)
        return value;
      else
        return null;
    });
    return cust;
  }

}
