import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CounterService } from './counter.service';
import { HomePageComponent } from './components/home-page/home-page.component';
import { PostComponent } from './components/post/post.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    PostComponent
  ],

  imports: [
    BrowserModule,
    NgbModule
  ],

  providers: [CounterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
