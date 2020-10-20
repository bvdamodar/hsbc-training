import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';
import { ICust } from '../icust';

@Component({
  selector: 'app-findbyid',
  templateUrl: './findbyid.component.html',
  styleUrls: ['./findbyid.component.css']
})
export class FindbyidComponent implements OnInit {

  constructor(private _service: CustService) { }

  ngOnInit(): void {
  }

  public cust: ICust;

  public getCustDetails(id: String) {
    this._service.getCustById(id).subscribe(data => this.cust = data);
  }


}
