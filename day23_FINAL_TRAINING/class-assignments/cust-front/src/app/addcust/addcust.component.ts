import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';
import { ICust } from '../icust';

@Component({
  selector: 'app-addcust',
  templateUrl: './addcust.component.html',
  styleUrls: ['./addcust.component.css']
})
export class AddcustComponent implements OnInit {

  constructor(private _service: CustService) { }

  ngOnInit(): void {
  }

  public cust: ICust;
  public status:String;

  public addCustomer(id:Number, name:String,mob:String) {
    this.cust = {custId:id,custName:name,mobile:mob};
    console.log(this.cust);
    this._service.addCustomer(this.cust).subscribe(data=> this.status = data );
  }

}
