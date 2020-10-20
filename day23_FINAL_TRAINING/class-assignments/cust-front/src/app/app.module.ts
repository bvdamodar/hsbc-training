import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FindbyidComponent } from './findbyid/findbyid.component';
import { ListallComponent } from './listall/listall.component';
import { AddcustComponent } from './addcust/addcust.component';
import { CustService } from './cust.service';

@NgModule({
  declarations: [
    AppComponent,
    FindbyidComponent,
    ListallComponent,
    AddcustComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CustService],
  bootstrap: [AppComponent]
})
export class AppModule { }
