import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmpIdlistComponent } from './emp-idlist/emp-idlist.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { EmpService } from './emp.service';
import { HrPageComponent } from './hr-page/hr-page.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpIdlistComponent,
    EmpDetailsComponent,
    HrPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [EmpService,HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
