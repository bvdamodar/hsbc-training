import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { PostsComponent } from './posts/posts.component';
import { JsonDataService } from './json-data.service';
import { GetpostComponent } from './getpost/getpost.component';
import { AppRoutingModule } from './app-routing/app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    PostsComponent,
    GetpostComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [JsonDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
