import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddcustComponent } from './addcust/addcust.component';
import { FindbyidComponent } from './findbyid/findbyid.component';
import { ListallComponent } from './listall/listall.component';

const routes: Routes = [
  { path: "app-findbyid", component: FindbyidComponent },
  { path: "app-addcust", component: AddcustComponent },
  { path: "app-listall", component: ListallComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
