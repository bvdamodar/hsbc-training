import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';
import { ICust } from '../icust';

@Component({
  selector: 'app-listall',
  templateUrl: './listall.component.html',
  styleUrls: ['./listall.component.css']
})
export class ListallComponent implements OnInit {

  public custList: ICust[];
  constructor( private _service:CustService) { } 

  ngOnInit(): void {
    this._service.custList().subscribe(data => this.custList = data);
   }

  public listAll(){
    this._service.custList().subscribe(data => this.custList = data);
  }

}
