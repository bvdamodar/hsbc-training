import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { ChildComponent } from './child/child.component';
import { EmpIdlistComponent } from './emp-idlist/emp-idlist.component';
import { EmpComponent } from './emp/emp.component';
import { EmpServiceService } from './emp-service.service';
import { EmpJsonComponent } from './emp-json/emp-json.component';

@NgModule({
  declarations: [
    AppComponent,
    EmpDetailsComponent,
    ChildComponent,
    EmpIdlistComponent,
    EmpComponent,
    EmpJsonComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [EmpServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
