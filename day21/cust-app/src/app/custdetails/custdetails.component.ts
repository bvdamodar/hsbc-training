import { CompileShallowModuleMetadata } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';

@Component({
  selector: 'app-custdetails',
  templateUrl: './custdetails.component.html',
  styleUrls: ['./custdetails.component.css']
})
export class CustdetailsComponent implements OnInit {

  constructor(private _service:CustService) { }

  ngOnInit(): void {
  }

  public custList = this._service.listAllCustomers();

  public findCust(custId:Number){
    console.log("Clicked the Item of Customer "+custId);
  }



}
