import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetpostComponent } from '../getpost/getpost.component';
import { PostsComponent } from '../posts/posts.component';

const routes: Routes = [
  { path: "posts", component: PostsComponent },
  { path: "getpost", component: GetpostComponent }
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
