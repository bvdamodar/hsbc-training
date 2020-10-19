import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmpDetailsComponent } from './emp-details/emp-details.component';
import { EmpIdlistComponent } from './emp-idlist/emp-idlist.component';
import { HrPageComponent } from './hr-page/hr-page.component';

const routes: Routes = [
  { path: "emp-idlist", component: EmpIdlistComponent },
  { path: "emp-details", component: EmpDetailsComponent },
  { path: "hr-page", component: HrPageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
